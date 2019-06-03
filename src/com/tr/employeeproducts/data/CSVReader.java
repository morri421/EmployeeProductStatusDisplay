package com.tr.employeeproducts.data;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Extracts employee supported product data from a CSV to be returned for other
 * program components
 */
public class CSVReader {
	
	private static CSVReader instance;
	//private static Map <String, Record> data = null;
	
	private CSVReader() {}
	
	public static CSVReader getEmployeeInformation() {
		if (instance == null) {
			instance = new CSVReader();
		}
		return instance;
	}

	public Map<String, Record> readCSV() {

		String csvFile = "DATA.csv";
		String line = "";
		String cvsSplitBy = ",";
		Map<String, Record> EmployeeData = new <String, Record>HashMap();

		// Might want to use a stream here.
		try (BufferedReader bReader = new BufferedReader(new FileReader(csvFile))) {
			int skipfirstlinecount = 0;
			while ((line = bReader.readLine()) != null) {

				String employeename = "";

				ProductFilter DataToSort = new ProductFilter();

				if (skipfirstlinecount != 0) { // skip first line
					String[] employeeinfoline = line.split(cvsSplitBy); // use comma as separator

					employeename = employeeinfoline[0] + "," + employeeinfoline[1]; // stores employee name with
																					// formatting
					employeename = employeename.substring(1, employeename.length() - 1);

					// loops through line array and saves information for inputting into record
					// object constructor
					for (int i = 2; i <= 40; i++) {
						// if the employee supports a product, it adds 1 to count, this is used to
						// determine product group status
						if (employeeinfoline[i].toString().equals("1")) {
							// sends place in employeeinfoline to product filter to determine what product
							// it's talking about
							DataToSort.filterCount(i);
						} else {
							// if they don't support product, adds product to missing product list
							DataToSort.filterMissing(i);
						}
					}

				}
				// Constructs record and combines it with name. Both are then put into hashmap
				Record employeerecord = new Record(DataToSort.calculateProductBucketStatus(), DataToSort.getUTMissing(),
						DataToSort.getToolsMissing(), DataToSort.getGOSysMissing(), DataToSort.getDocsMissing(),
						DataToSort.getACSMissing(), DataToSort.getPCSMissing(), DataToSort.getOnvMissing(),
						DataToSort.getWebMissing(), DataToSort.getCustMissing(), employeename);
				EmployeeData.put(employeename, employeerecord);

				skipfirstlinecount = 1; // only trying to skip first line, don't care about iteration
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return EmployeeData;
	}

}//