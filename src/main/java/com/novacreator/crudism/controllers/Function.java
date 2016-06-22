package com.novacreator.crudism.controllers;

public class Function {
	private String functionCatalog;
	private String functionSchema;
	private String functionName;
	private String remarks;
	private short functionType;
	private String specificName;
	
	public String getFunctionCatalog() {
		return functionCatalog;
	}
	void setFunctionCatalog(String functionCatalog) {
		this.functionCatalog = functionCatalog;
	}
	
	public String getFunctionSchema() {
		return functionSchema;
	}
	void setFunctionSchema(String functionSchema) {
		this.functionSchema = functionSchema;
	}
	
	public String getFunctionName() {
		return functionName;
	}
	void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public short getFunctionType() {
		return functionType;
	}
	void setFunctionType(short functionType) {
		this.functionType = functionType;
	}
	
	public String getSpecificName() {
		return specificName;
	}
	void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
}