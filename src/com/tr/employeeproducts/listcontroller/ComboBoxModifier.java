package com.tr.employeeproducts.listcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tr.employeeproducts.data.Record;

/**
 * Creates a list to replace the current employee selection list based on the
 * combo box selection.
 */
public class ComboBoxModifier {

	List<String> parsedEmployeeList = new ArrayList<>();

	private void updateList(String selection, Map<String, Record> employees) {

		// Sets the employee selection list to include all employees
		if (selection.equals("Select Needed Product")) {
			List<String> names = new ArrayList<String>(employees.keySet());
			parsedEmployeeList = names;
			// Looks through every employee record in the missing product list for the
			// selected product. If it contains the product, 
			//it adds the employee's name to a list
		} else if (selection.equals("UT 1040")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values()); // list of all records
			for (Record employee : employeerecord) {
				// second part of the if statement checks the max size of the arraylist to make
				// sure they are not missing the whole product group
				// which would not show in missing products
				if (employee.getnullUTProducts().contains("UT 1040") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 1041")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 1041") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 1065")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 1065") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 1120")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 1120") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 990")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 990") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 5500")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 5500") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UT 706/709/990/2290")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UT 706/709/990/2290")
						&& employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("UTSys")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullUTProducts().contains("UTSys") && employee.getnullUTProducts().size() != 8) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("FxAsstsCS")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullToolsProducts().contains("FxAsstsCS")
						&& employee.getnullToolsProducts().size() != 2) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("Planner/Toolbox")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullToolsProducts().contains("Planner/Toolbox")
						&& employee.getnullToolsProducts().size() != 2) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 1040")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 1040")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 1120")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 1120")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 1065")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 1065")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 1041")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 1041")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 990")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 990")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 5500")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 5500")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST 706/9")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST 706/9")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST INS")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST INS")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST MTI")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST MTI")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GST TB")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GST TB")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GSTSys")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GSTSys")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GSTSysFree")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullGOSysProducts().contains("GSTSysFree")
						&& employee.getnullGOSysProducts().size() != 12) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("FCS")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullDocProducts().contains("FCS") && employee.getnullDocProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("GFR")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullDocProducts().contains("GFR") && employee.getnullDocProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("AdvFlow")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullDocProducts().contains("AdvFlow") && employee.getnullDocProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("ACS Acct")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullACSProducts().contains("ACS Acct") && employee.getnullACSProducts().size() != 5) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("ACS Pay")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullACSProducts().contains("ACS Pay") && employee.getnullACSProducts().size() != 5) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("ACS AP/AR")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullACSProducts().contains("ACS AP/AR") && employee.getnullACSProducts().size() != 5) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("ACS Work")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullACSProducts().contains("ACS Work") && employee.getnullACSProducts().size() != 5) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("ACS Sys")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullACSProducts().contains("ACS Sys") && employee.getnullACSProducts().size() != 5) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("PCS")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullPCSProducts().contains("PCS") && employee.getnullPCSProducts().size() != 2) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("PCS Sys")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullPCSProducts().contains("PCS Sys") && employee.getnullPCSProducts().size() != 2) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("Onvio")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullOnvioProducts().contains("Onvio") && employee.getnullOnvioProducts().size() != 1) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("SAAS/VO")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullWebProducts().contains("SAAS/VO") && employee.getnullWebProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("WebBld")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullWebProducts().contains("WebBld") && employee.getnullWebProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("WebBldClassic")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullWebProducts().contains("WebBldClassic")
						&& employee.getnullWebProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("CS Gen")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullCustProducts().contains("CS Gen") && employee.getnullCustProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("CS GoSys")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullCustProducts().contains("CS GoSys") && employee.getnullCustProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		} else if (selection.equals("CS Rec")) {
			List<Record> employeerecord = new ArrayList<Record>(employees.values());
			for (Record employee : employeerecord) {
				if (employee.getnullCustProducts().contains("CS Rec") && employee.getnullCustProducts().size() != 3) {
					parsedEmployeeList.add(employee.getName());
				}
			}
		}

	}

	public List<String> getParsedEmployeeList1(String selection, Map<String, Record> employees) {

		updateList(selection, employees);
		return parsedEmployeeList;

	}

}
