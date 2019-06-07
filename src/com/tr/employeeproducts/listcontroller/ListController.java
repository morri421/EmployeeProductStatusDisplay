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
		
		StringBuilder fullProducts = new StringBuilder("The employee has completed product knowledge for: \n\n");
		
		try {

			List<Boolean> bucketStatus = employeeData.get(employee).getBucketStatus();

			if (bucketStatus.get(0) == true) {
				fullProducts.append("UltraTax, ");
			}
			if (bucketStatus.get(1) == true) {
				fullProducts.append("Tools, ");
			}
			if (bucketStatus.get(2) == true) {
				fullProducts.append("GoSystem Tax, ");
			}
			if (bucketStatus.get(3) == true) {
				fullProducts.append("Documents, ");
			}
			if (bucketStatus.get(4) == true) {
				fullProducts.append("Accounting CS, ");
			}
			if (bucketStatus.get(5) == true) {
				fullProducts.append("Practice CS, ");
			}
			if (bucketStatus.get(6) == true) {
				fullProducts.append("Onvio, ");
			}
			if (bucketStatus.get(7) == true) {
				fullProducts.append("Web Services, ");
			}
			if (bucketStatus.get(8) == true) {
				fullProducts.append("Customer Service, ");
			}
			
			fullProducts.delete(fullProducts.length() -2, fullProducts.length()-1).append("\n\n\n"); //removes punctuation from end of string

			// Creates a MissingProductString object to generate the missing product portion
			// of the text area
			MissingProductStringGenerator missingStringGenerator = new MissingProductStringGenerator();
			String completeMissingString = missingStringGenerator.generateMissingString(employeeData.get(employee));
			fullProducts.append(completeMissingString);
			
		} catch (Exception e) {
			// System.out.println(e);
		}
		
		return fullProducts.toString();
	}
	
	//Updates cbox filter list
	public List<String> getComboBoxList(String cboxvalue) {
		
		ComboBoxModifier newEmployeeList = new ComboBoxModifier();
		List<String> updatednames = newEmployeeList.getParsedEmployeeList1(cboxvalue, employeeData);
		
		return updatednames;
	
	}
}

