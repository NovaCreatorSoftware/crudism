package com.novacreator.crudism.controllers;

public class SchemaDetails {
	private String schemaName;
	private String catalogName;
	
	public String getSchemaName() {
		return schemaName;
	}
	void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	
	public String getCatalogName() {
		return catalogName;
	}
	void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
}