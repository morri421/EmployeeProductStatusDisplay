package com.tr.employeeproducts.listcontroller;

import java.util.List;

import com.tr.employeeproducts.data.Record;

/**
 * This generates a string of missing products to be returned and put in a text
 * area in the interface.
 */
public class MissingProductStringGenerator {

	// this should probably use a stringbuilder
	public String generateMissingString(Record employeeRecord) {

		StringBuilder stringForAllMissingProducts = new StringBuilder(
				"To complete product group, employee needs: \n\n");
		// Looks to make sure that the missing products is not empty and that the
		// product is not in a completed product group
		if (employeeRecord.getnullUTProducts().size() > 0 && employeeRecord.getnullUTProducts().size() != 8) {
			List<String> utMissingProducts = employeeRecord.getnullUTProducts();
			stringForAllMissingProducts.append("UltraTax-  "); // formats the missing products and adds it to a string
																// that will be returned at end
			for (String product : utMissingProducts) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullToolsProducts().size() > 0 && employeeRecord.getnullToolsProducts().size() != 2) {
			List<String> toolsMissingProducts = employeeRecord.getnullToolsProducts();
			stringForAllMissingProducts.append("Tools-  ");
			for (String product : toolsMissingProducts) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullGOSysProducts().size() > 0 && employeeRecord.getnullGOSysProducts().size() != 12) {
			List<String> gosMissingProducts = employeeRecord.getnullGOSysProducts();
			stringForAllMissingProducts.append("GoSystem-  ");
			for (String product : gosMissingProducts) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullDocProducts().size() > 0 && employeeRecord.getnullDocProducts().size() != 3) {
			List<String> docMissingProduct = employeeRecord.getnullDocProducts();
			stringForAllMissingProducts.append("Documents-  ");
			for (String product : docMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullACSProducts().size() > 0 && employeeRecord.getnullACSProducts().size() != 5) {
			List<String> acsMissingProduct = employeeRecord.getnullACSProducts();
			stringForAllMissingProducts.append("Accounting CS-  ");
			for (String product : acsMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullPCSProducts().size() > 0 && employeeRecord.getnullPCSProducts().size() != 2) {
			List<String> pcsMissingProduct = employeeRecord.getnullPCSProducts();
			stringForAllMissingProducts.append("Practice CS-  ");
			for (String product : pcsMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullOnvioProducts().size() > 0 && employeeRecord.getnullOnvioProducts().size() != 1) {
			List<String> onvioMissingProduct = employeeRecord.getnullOnvioProducts();
			stringForAllMissingProducts.append("Onvio-  ");
			for (String product : onvioMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullWebProducts().size() > 0 && employeeRecord.getnullWebProducts().size() != 3) {
			List<String> webMissingProduct = employeeRecord.getnullWebProducts();
			stringForAllMissingProducts.append("Web Services-  ");
			for (String product : webMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}
		if (employeeRecord.getnullCustProducts().size() > 0 && employeeRecord.getnullCustProducts().size() != 3) {
			List<String> custMissingProduct = employeeRecord.getnullCustProducts();
			stringForAllMissingProducts.append("Customer Service-  ");
			for (String product : custMissingProduct) {
				stringForAllMissingProducts.append(product + ", ");
			}
			stringForAllMissingProducts.delete(stringForAllMissingProducts.length() - 2,
					stringForAllMissingProducts.length() - 1).append("\n");
		}

		return stringForAllMissingProducts.toString();
	}

}
