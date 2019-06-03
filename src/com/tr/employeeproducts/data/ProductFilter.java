package com.tr.employeeproducts.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Takes extracted data from csv and puts it in an object to put in constructor
 * for Record object.
 */
public class ProductFilter {

	private int utcount = 0;
	private int toolcount = 0;
	private int gocount = 0;
	private int doccount = 0;
	private int acscount = 0;
	private int pcscount = 0;
	private int onviocount = 0;
	private int webcount = 0;
	private int custcount = 0;

	private List<Boolean> productbucketstatus = new ArrayList<Boolean>();
	private List<String> utmissing = new ArrayList<String>();
	private List<String> toolsmissing = new ArrayList<String>();
	private List<String> gosysmissing = new ArrayList<String>();
	private List<String> docmissing = new ArrayList<String>();
	private List<String> acsmissing = new ArrayList<String>();
	private List<String> pcsmissing = new ArrayList<String>();
	private List<String> onviomissing = new ArrayList<String>();
	private List<String> webmissing = new ArrayList<String>();
	private List<String> custmissing = new ArrayList<String>();

	public List<String> getUTMissing() {
		return utmissing;
	}

	public List<String> getToolsMissing() {
		return toolsmissing;
	}

	public List<String> getGOSysMissing() {
		return gosysmissing;
	}

	public List<String> getDocsMissing() {
		return docmissing;
	}

	public List<String> getACSMissing() {
		return acsmissing;
	}

	public List<String> getPCSMissing() {
		return pcsmissing;
	}

	public List<String> getOnvMissing() {
		return onviomissing;
	}

	public List<String> getWebMissing() {
		return webmissing;
	}

	public List<String> getCustMissing() {
		return custmissing;
	}

	private int convertPlacement(int placement) { // converts the place of the line array to a product group

		int convertedplacement = 0;

		if (placement >= 2 && placement <= 9) {
			convertedplacement = 1; // ut
		} else if (placement >= 10 && placement <= 11) {
			convertedplacement = 2; // tools
		} else if (placement >= 12 && placement <= 23) {
			convertedplacement = 3; // go
		} else if (placement >= 24 && placement <= 26) {
			convertedplacement = 4; // docs
		} else if (placement >= 27 && placement <= 31) {
			convertedplacement = 5; // acs
		} else if (placement >= 32 && placement <= 33) {
			convertedplacement = 6; // pcs
		} else if (placement == 34) {
			convertedplacement = 7; // onvio
		} else if (placement >= 35 && placement <= 37) {
			convertedplacement = 8; // web
		} else if (placement >= 38 && placement <= 40) {
			convertedplacement = 9; // cust
		}

		return convertedplacement;
	}

	public void filterCount(int placement) { // filters counts for completeded products, consider deleting as not used

		int convertedplacement = convertPlacement(placement);

		switch (convertedplacement) {
		case 1:
			utcount = utcount + 1;
			break;
		case 2:
			toolcount = toolcount + 1;
			break;
		case 3:
			gocount = gocount + 1;
			break;
		case 4:
			doccount = doccount + 1;
			break;
		case 5:
			acscount = acscount + 1;
			break;
		case 6:
			pcscount = pcscount + 1;
			break;
		case 7:
			onviocount = onviocount + 1;
			break;
		case 8:
			webcount = webcount + 1;
			break;
		case 9:
			custcount = custcount + 1;
			break;
		}
	}

	public void filterMissing(int placement) { // filters missing

		switch (placement) { // takes the placement and adds corresponding product to arraylist to be put in
								// constructor
		case 2:
			utmissing.add("UT 1040");
			break;
		case 3:
			utmissing.add("UT 1120");
			break;
		case 4:
			utmissing.add("UT 1065");
			break;
		case 5:
			utmissing.add("UT 1041");
			break;
		case 6:
			utmissing.add("UT 990");
			break;
		case 7:
			utmissing.add("UT 5500");
			break;
		case 8:
			utmissing.add("UT 706/709/990/2290");
			break;
		case 9:
			utmissing.add("UTSys");
			break;
		case 10:
			toolsmissing.add("FxAsstsCS");
			break;
		case 11:
			toolsmissing.add("Planner/Toolbox");
			break;
		case 12:
			gosysmissing.add("GST 1040");
			break;
		case 13:
			gosysmissing.add("GST 1120");
			break;
		case 14:
			gosysmissing.add("GST 1065");
			break;
		case 15:
			gosysmissing.add("GST 1041");
			break;
		case 16:
			gosysmissing.add("GST 990");
			break;
		case 17:
			gosysmissing.add("GST 5500");
			break;
		case 18:
			gosysmissing.add("GST 706/9");
			break;
		case 19:
			gosysmissing.add("GST INS");
			break;
		case 20:
			gosysmissing.add("GST MTI");
			break;
		case 21:
			gosysmissing.add("GST TB");
			break;
		case 22:
			gosysmissing.add("GSTSys");
			break;
		case 23:
			gosysmissing.add("GSTSysFree");
			break;
		case 24:
			docmissing.add("FCS");
			break;
		case 25:
			docmissing.add("GFR");
			break;
		case 26:
			docmissing.add("AdvFlow");
			break;
		case 27:
			acsmissing.add("ACS Acct");
			break;
		case 28:
			acsmissing.add("ACS Pay");
			break;
		case 29:
			acsmissing.add("ACS AP/AR");
			break;
		case 30:
			acsmissing.add("ACS Work");
			break;
		case 31:
			acsmissing.add("ACS Sys");
			break;
		case 32:
			pcsmissing.add("PCS");
			break;
		case 33:
			pcsmissing.add("PCS Sys");
			break;
		case 34:
			onviomissing.add("Onvio");
			break;
		case 35:
			webmissing.add("SAAS/VO");
			break;
		case 36:
			webmissing.add("WebBld");
			break;
		case 37:
			webmissing.add("WebBldClassic");
			break;
		case 38:
			custmissing.add("CS Gen");
			break;
		case 39:
			custmissing.add("CS GoSys");
			break;
		case 40:
			custmissing.add("CS Rec");
			break;
		}
	}

	public List<Boolean> calculateProductBucketStatus() { // make a product bucket status list of all products to be
															// used in constructor
		if (utcount == 8) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (toolcount == 2) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (gocount == 12) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (doccount == 3) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (acscount == 5) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (pcscount == 2) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (onviocount == 1) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (webcount == 3) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}
		if (custcount == 3) {
			productbucketstatus.add(true);
		} else {
			productbucketstatus.add(false);
		}

		return productbucketstatus;

	}

}
