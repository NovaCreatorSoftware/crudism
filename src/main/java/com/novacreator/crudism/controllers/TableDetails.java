package com.novacreator.crudism.controllers;

public class TableDetails {
	private String catalog;
	private String schema;
	private String name;
	private String type;
	private String remarks;
	private String typeCatalog;
	private String typeSchema;
	private String typeName;
	private String selfReferencingColumnName;
	private String referenceGeneration;
	
	public String getCatalog() {
		return catalog;
	}
	void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	
	public String getSchema() {
		return schema;
	}
	void setSchema(String schema) {
		this.schema = schema;
	}
	
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
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
	
	public String getSelfReferencingColumnName() {
		return selfReferencingColumnName;
	}
	void setSelfReferencingColumnName(String selfReferencingColumnName) {
		this.selfReferencingColumnName = selfReferencingColumnName;
	}
	
	public String getReferenceGeneration() {
		return referenceGeneration;
	}
	void setReferenceGeneration(String referenceGeneration) {
		this.referenceGeneration = referenceGeneration;
	}
}