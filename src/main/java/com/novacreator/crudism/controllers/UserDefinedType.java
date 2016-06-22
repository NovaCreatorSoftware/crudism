package com.novacreator.crudism.controllers;

public class UserDefinedType {
	private String typeCatalog;
	private String typeSchema;
	private String typeName;
	private String className;
	private int dataType;
	private short baseType;
	private String remarks;
	
	public String getTypeCatalog() {
		return typeCatalog;
	}
	void setTypeCatalog(String typeCatalog) {
		this.typeCatalog = typeCatalog;
	}
	
	public String getTypeSchema() {
		return typeSchema;
	}
	void setTypeSchema(String typeSchema) {
		this.typeSchema = typeSchema;
	}
	
	public String getTypeName() {
		return typeName;
	}
	void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getClassNmae() {
		return className;
	}
	void setClassName(String className) {
		this.className = className;
	}
	
	public int getDataType() {
		return dataType;
	}
	void setDataType(int dataType) {
		this.dataType = dataType;
	}
	
	public short getBaseType() {
		return baseType;
	}
	void setBaseType(short baseType) {
		this.baseType = baseType;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}