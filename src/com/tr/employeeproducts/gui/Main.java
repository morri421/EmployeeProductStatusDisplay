package com.tr.employeeproducts.gui;

import java.util.Map;

import com.tr.employeeproducts.data.CSVReader;
import com.tr.employeeproducts.data.Record;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton to grab employee data 
		Map<String, Record> employeeData = CSVReader.getEmployeeInformation().readCSV();
		
		InterfaceGenerator start = new InterfaceGenerator(employeeData);
		// start.initGUI();
	}

}
