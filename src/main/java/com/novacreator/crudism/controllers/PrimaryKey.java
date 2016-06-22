package com.novacreator.crudism.controllers;

public class PrimaryKey {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String columnName;
	private short keySequence;
	private String primaryKeyName;
	
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
	
	public String getColumnName() {
		return columnName;
	}
	void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public short getKeySequence() {
		return keySequence;
	}
	void setKeySequence(short keySequence) {
		this.keySequence = keySequence;
	}
	
	public String getPrimaryKeyName() {
		return primaryKeyName;
	}
	void setPrimaryKeyName(String primaryKeyName) {
		this.primaryKeyName = primaryKeyName;
	}
}