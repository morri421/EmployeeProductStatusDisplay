package com.tr.employeeproducts.data;

import java.util.List;

/**
 * Record object to store employee information
 *
 */
public class Record {
	
	//Name of employee
	private String employeename;
	
	//Boolean list of whether an employee knows an entire product group
	private List<Boolean> productBucketStatus;
	
	//A list for each product group that stores every product that the
	//employee is missing to complete the full set of of the group
	private List<String> utMissing;
	private List<String> toolsMissing;
	private List<String> gosysMissing;
	private List<String> docMissing;
	private List<String> acsMissing;
	private List<String> pcsMissing;
	private List<String> onvioMissing;
	private List<String> webMissing;
	private List<String> custMissing;

	//Have a constructor to create Record object. No setters because the information doesn't need to change.
    public Record (List<Boolean> allproductstatus, List<String> ut, List<String> tools, List<String> gosys, List<String> docs, List<String> acs, List<String> pcs, List<String> onvio, List<String> web, List<String> cust, String employeename) {
    	this.productBucketStatus = allproductstatus;
    	this.utMissing = ut;
    	this.toolsMissing = tools;
    	this.gosysMissing = gosys;
    	this.docMissing = docs; 
    	this.acsMissing = acs;
    	this.pcsMissing = pcs;
    	this.onvioMissing = onvio;
    	this.webMissing = web;
    	this.custMissing = cust;
    	this.employeename = employeename;
    }
    public String getName() {
    	return employeename;
    }

    public List<Boolean> getBucketStatus() {
        return productBucketStatus;
    }

    public List<String> getnullUTProducts() {
        return utMissing;
    }

    public List<String> getnullToolsProducts() {
        return toolsMissing;
    }

    public List<String> getnullGOSysProducts() {
        return gosysMissing;
    }

    public List<String> getnullDocProducts() {
        return docMissing;
    }

    public List<String> getnullACSProducts() {
        return acsMissing;
    }
    
    public List<String> getnullPCSProducts() {
        return pcsMissing;
    }
    
    public List<String> getnullOnvioProducts() {
        return onvioMissing;
    }

    public List<String> getnullWebProducts() {
        return webMissing;
    }
    
    public List<String> getnullCustProducts() {
        return custMissing;
    }
    

}
