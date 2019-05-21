package com.tr.employeerecord;

import java.util.List;

/**
 * This generates a string of missing products
 * to be returned and put in a text area in 
 * the interface. 
 */
public class MissingProductStringGenerator {
	
	//this should probably use a stringbuilder
	public String generateMissingString(Record employeeRecord) {
		
		String stringForAllMissingProducts ="To complete product group, employee needs: \n\n"; 
		//Looks to make sure that the missing products is not empty and that the product is not in a completed product group
		if (employeeRecord.getnullUTProducts().size() > 0 && employeeRecord.getnullUTProducts().size() != 8) {
			List<String> utMissingProducts = employeeRecord.getnullUTProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "UltraTax-  "; //formats the missing products and adds it to a string that will be returned at end
			for (String product : utMissingProducts) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", "
						;
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullToolsProducts().size() > 0 && employeeRecord.getnullToolsProducts().size() != 2) {
			List<String> toolsMissingProducts = employeeRecord.getnullToolsProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Tools-  ";
			for (String product : toolsMissingProducts) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullGOSysProducts().size() > 0 && employeeRecord.getnullGOSysProducts().size() != 12) {
			List<String> gosMissingProducts = employeeRecord.getnullGOSysProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "GoSystem-  ";
			for (String product : gosMissingProducts) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullDocProducts().size() > 0 && employeeRecord.getnullDocProducts().size() != 3) {
			List<String> docMissingProduct = employeeRecord.getnullDocProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Documents-  ";
			for (String product : docMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullACSProducts().size() > 0 && employeeRecord.getnullACSProducts().size() != 5) {
			List<String> acsMissingProduct = employeeRecord.getnullACSProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Accounting CS-  ";
			for (String product : acsMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullPCSProducts().size() > 0 && employeeRecord.getnullPCSProducts().size() != 2) {
			List<String> pcsMissingProduct = employeeRecord.getnullPCSProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Practice CS-  ";
			for (String product : pcsMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullOnvioProducts().size() > 0 && employeeRecord.getnullOnvioProducts().size() != 1) {
			List<String> onvioMissingProduct = employeeRecord.getnullOnvioProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Onvio-  ";
			for (String product : onvioMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullWebProducts().size() > 0 && employeeRecord.getnullWebProducts().size() != 3) {
			List<String> webMissingProduct = employeeRecord.getnullWebProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Web Services-  ";
			for (String product : webMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		if (employeeRecord.getnullCustProducts().size() > 0 && employeeRecord.getnullCustProducts().size() != 3) {
			List<String> custMissingProduct = employeeRecord.getnullCustProducts();
			stringForAllMissingProducts = stringForAllMissingProducts + "Customer Service-  ";
			for (String product : custMissingProduct) {
				stringForAllMissingProducts = stringForAllMissingProducts + product + ", ";
			}
			stringForAllMissingProducts = stringForAllMissingProducts.substring(0, stringForAllMissingProducts.length()-2) + "\n";
		}
		
		//System.out.println(stringmiss);
		return stringForAllMissingProducts;
	}
	
}
