package com.novacreator.crudism.controllers;

public class SuperTable {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String superTableName;
	
	public String getTableCatalog() {
		return tableCatalog;
	}
	void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}
	
	public String getTableSchema() {
		return tableSchema;
	}
	void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}
	
	public String getTableName() {
		return tableName;
	}
	void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getSuperTableName() {
		return superTableName;
	}
	void setSuperTableName(String superTableName) {
		this.superTableName = superTableName;
	}
}