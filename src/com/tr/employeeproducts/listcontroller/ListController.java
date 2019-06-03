package com.tr.employeeproducts.listcontroller;

import java.util.List;
import java.util.Map;

import com.tr.employeeproducts.data.Record;

public class ListController {
	
	private Map<String, Record> employeeData;
	
	public ListController(Map<String, Record> employeeData) {
		this.employeeData = employeeData;
	}

	public String getEmployeeProductsString(String employee) {
		
		//This should use StringBuilder and it should be separated in its own method or class.
		String fullProducts = "The employee has completed product knowledge for: \n\n";
		
		try {

			List<Boolean> bucketStatus = employeeData.get(employee).getBucketStatus();

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
			String completeMissingString = missingStringGenerator.generateMissingString(employeeData.get(employee));
			fullProducts = fullProducts + completeMissingString;
			
		} catch (Exception e) {
			// System.out.println(e);
		}
		return fullProducts;
	}
	
	//Updates cbox filter list
	public List<String> getComboBoxList(String cboxvalue) {
		
		ComboBoxModifier newEmployeeList = new ComboBoxModifier();
		List<String> updatednames = newEmployeeList.getParsedEmployeeList1(cboxvalue, employeeData);
		
		return updatednames;
	
	}
}

