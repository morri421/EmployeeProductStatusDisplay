package com.tr.employeeproducts.gui;

import net.miginfocom.swing.MigLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.tr.employeeproducts.data.CSVReader;
import com.tr.employeeproducts.data.ComboBoxModifier;
import com.tr.employeeproducts.data.MissingProductStringGenerator;
import com.tr.employeeproducts.data.Record;

public class InterfaceGenerator {

	private JList<String> employeeSelectionList;
	private JPanel jPanel1;
	private JTextArea jTextArea1;
	private JComboBox<String> cbox;
	private Map<String, Record> employeeData;

	// init interface as soon as class is declared
	public InterfaceGenerator(Map<String, Record> employeeData) {
		this.employeeData = employeeData;
		initComponents();
	}

	private void initComponents() {
		JFrame f = new JFrame();
		jPanel1 = new JPanel();
		employeeSelectionList = new JList<String>();
		jTextArea1 = new JTextArea(13, 64);

		// Sets a model for the employee list with action listener for when employee changes selection
		employeeSelectionList.setModel(new AbstractListModel<String>() {

			List<String> names = new ArrayList<String>(employeeData.keySet()); //gets employee names from map and puts in list

			@Override
			public int getSize() {
				return names.size();
			}

			@Override
			public String getElementAt(int i) {
				return names.get(i);
			}
		});
		employeeSelectionList.addListSelectionListener(new ListSelectionListener() { //action listener for employee name selection change

			@Override
			public void valueChanged(ListSelectionEvent evt) {

				jList1ValueChanged(evt);
			}
		});

		//Array of Product types for cbox filter
		String[] comboStrings = { "Select Needed Product", "UT 1040", "UT 1041", "UT 1065", "UT 1120", "UT 990",
				"UT 5500", "UT 706/709/990/2290", "UTSys", "FxAsstsCS", "Planner/Toolbox", "GST 1040", "GST 1120",
				"GST 1065", "GST 1041", "GST 990", "GST 5500", "GST 706/9", "GST INS", "GST MTI", "GST TB", "GSTSys",
				"GSTSysFree", "FCS", "GFR", "AdvFlow", "ACS Acct", "ACS Pay", "ACS AP/AR", "ACS Work", "ACS Sys", "PCS",
				"PCS Sys", "Onvio", "SAAS/VO", "WebBld", "WebBldClassic", "CS Gen", "CS GoSys", "CS Rec" };
		
		//Adds product type list to cbox
		cbox = new JComboBox<String>(comboStrings);
		
		//When cbox filter selection is changed, it creates a different employee list with only employees needing that product
		cbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cboxvalue = cbox.getSelectedItem().toString();
				AbstractListModel<String> model = new AbstractListModel<String>() {
					
					//Creates a ComboModifier that gets the employees missing the product selected in cbox
					ComboBoxModifier newEmployeeList = new ComboBoxModifier();
					List<String> updatednames = newEmployeeList.getParsedEmployeeList1(cboxvalue, employeeData);

					@Override
					public int getSize() {
						return updatednames.size();
					}

					@Override
					public String getElementAt(int i) {
						return updatednames.get(i);
					}

				};
				employeeSelectionList.setModel(model);
				jTextArea1.setText(""); //clear text area after new cbox selection
			}
		});

		JScrollPane scroller = new JScrollPane(employeeSelectionList);
		scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setPreferredSize(new Dimension(150, 200));

		jPanel1.add(cbox);
		jPanel1.add(scroller);
		jPanel1.add(jTextArea1);

		f.setLayout(new MigLayout());
		f.setTitle("Thomson Reuters Product Groups");
		f.setSize(300, 75);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		f.add(jPanel1);
		f.pack();
		f.setVisible(true);
	}

	//This generates the text area that displays the employee information
	private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {
		
		String selectedName = (String) employeeSelectionList.getSelectedValue();
		
		//Gets copy of employee names and their product information
		
		//Formats and populates the text area
		//This should use StringBuilder and it should be separated in its own method or class.
		String fullProducts = "The employee has completed product knowledge for: \n\n";

		try {

			List<Boolean> bucketStatus = employeeData.get(selectedName).getBucketStatus();

			if (bucketStatus.get(0) == true) {
				fullProducts = fullProducts + "UltraTax, ";
			}
			if (bucketStatus.get(1) == true) {
				fullProducts = fullProducts + "Tools, ";
			}
			if (bucketStatus.get(2) == true) {
				fullProducts = fullProducts + "GoSystem Tax, ";
			}
			if (bucketStatus.get(3) == true) {
				fullProducts = fullProducts + "Documents, ";
			}
			if (bucketStatus.get(4) == true) {
				fullProducts = fullProducts + "Accounting CS, ";
			}
			if (bucketStatus.get(5) == true) {
				fullProducts = fullProducts + "Practice CS, ";
			}
			if (bucketStatus.get(6) == true) {
				fullProducts = fullProducts + "Onvio, ";
			}
			if (bucketStatus.get(7) == true) {
				fullProducts = fullProducts + "Web Services, ";
			}
			if (bucketStatus.get(8) == true) {
				fullProducts = fullProducts + "Customer Service, ";
			}
			fullProducts = fullProducts.substring(0, fullProducts.length() - 2) + "\n\n\n"; //removes punctuation from end of string
			
			//Creates a MissingProductString object to generate the missing product portion of the text area
			MissingProductStringGenerator missingStringGenerator = new MissingProductStringGenerator();
			String completeMissingString = missingStringGenerator.generateMissingString(employeeData.get(selectedName));
			fullProducts = fullProducts + completeMissingString;

			jTextArea1.setText(fullProducts);
			
		} catch (Exception e) {
			// System.out.println(e);
		}

	}

	// public static void main(String args[]) {
	// SwingUtilities.invokeLater(new Runnable() {

	// @Override
	// public void run() {
	// new GenerateInterface();
	// }
	// });
	// }
}