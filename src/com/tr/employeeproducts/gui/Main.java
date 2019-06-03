package com.tr.employeeproducts.gui;

import java.util.Map;

import com.tr.employeeproducts.data.CSVReader;
import com.tr.employeeproducts.data.Record;
import com.tr.employeeproducts.listcontroller.ListController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton to grab employee data 
		Map<String, Record> employeeData = CSVReader.getEmployeeInformation().readCSV();
		ListController controller = new ListController(employeeData);
		InterfaceGenerator start = new InterfaceGenerator(employeeData, controller);
		// start.initGUI();
	}

}
