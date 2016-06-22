package com.novacreator.crudism.controllers;

public class Procedure {
	private String procedureCatalog;
	private String procedureSchema;
	private String procedureName;
	private String remarks;
	private short procedureType;
	private String specificName;
	
	public String getProcedureCatalog() {
		return procedureCatalog;
	}
	void setProcedureCatalog(String procedureCatalog) {
		this.procedureCatalog = procedureCatalog;
	}
	
	public String getProcedureSchema() {
		return procedureSchema;
	}
	void setProcedureSchema(String procedureSchema) {
		this.procedureSchema = procedureSchema;
	}
	
	public String getProcedureName() {
		return procedureName;
	}
	void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public short getProcedureType() {
		return procedureType;
	}
	void setProcedureType(short procedureType) {
		this.procedureType = procedureType;
	}
	
	public String getSpecificName() {
		return specificName;
	}
	void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
}