package com.novacreator.crudism.controllers;

public class ImportedKey {
	private String primaryKeyTableCatalog;
	private String primaryKeyTableSchema;
	private String primaryKeyTableName;
	private String primaryKeyColumnName;
	private String foreignKeyTableCatalog;
	private String foreignKeyTableSchema;
	private String foreignKeyTableName;
	private String foreignKeyColumnName;
	private short keySequenceNumber;
	private short updateRule;
	private short deleteRule;
	private String foreignKeyName;
	private String primaryKeyName;
	private short deferrability;
	
	public String getPrimaryKeyTableCatalog() {
		return primaryKeyTableCatalog;
	}
	void setPrimaryKeyTableCatalog(String primaryKeyTableCatalog) {
		this.primaryKeyTableCatalog = primaryKeyTableCatalog;
	}
	
	public String getPrimaryKeyTableSchema() {
		return primaryKeyTableSchema;
	}
	void setPrimaryKeyTableSchema(String primaryKeyTableSchema) {
		this.primaryKeyTableSchema = primaryKeyTableSchema;
	}
	
	public String getPrimaryKeyTableName() {
		return primaryKeyTableName;
	}
	void setPrimaryKeyTableName(String primaryKeyTableName) {
		this.primaryKeyTableName = primaryKeyTableName;
	}
	
	public String getPrimaryKeyColumnName() {
		return primaryKeyColumnName;
	}
	void setPrimaryKeyColumnName(String primaryKeyColumnName) {
		this.primaryKeyColumnName = primaryKeyColumnName;
	}
	
	public String getForeignKeyTableCatalog() {
		return foreignKeyTableCatalog;
	}
	void setForeignKeyTableCatalog(String foreignKeyTableCatalog) {
		this.foreignKeyTableCatalog = foreignKeyTableCatalog;
	}
	
	public String getForeignKeyTableSchema() {
		return foreignKeyTableSchema;
	}
	void setForeignKeyTableSchema(String foreignKeyTableSchema) {
		this.foreignKeyTableSchema = foreignKeyTableSchema;
	}
	
	public String getForeignKeyTableName() {
		return foreignKeyTableName;
	}
	void setForeignKeyTableName(String foreignKeyTableName) {
		this.foreignKeyTableName = foreignKeyTableName;
	}
	
	public String getForeignKeyColumnName() {
		return foreignKeyColumnName;
	}
	void setForeignKeyColumnName(String foreignKeyColumnName) {
		this.foreignKeyColumnName = foreignKeyColumnName;
	}
	
	public short getKeySequenceNumber() {
		return keySequenceNumber;
	}
	void setKeySequenceNumber(short keySequenceNumber) {
		this.keySequenceNumber = keySequenceNumber;
	}
	
	public short getUpdateRule() {
		return updateRule;
	}
	void setUpdateRule(short updateRule) {
		this.updateRule = updateRule;
	}
	
	public short getDeleteRule() {
		return deleteRule;
	}
	void setDeleteRule(short deleteRule) {
		this.deleteRule = deleteRule;
	}
	
	public String getForeignKeyName() {
		return foreignKeyName;
	}
	void setForeignKeyName(String foreignKeyName) {
		this.foreignKeyName = foreignKeyName;
	}
	
	public String getPrimaryKeyName() {
		return primaryKeyName;
	}
	void setPrimaryKeyName(String primaryKeyName) {
		this.primaryKeyName = primaryKeyName;
	}
	
	public short getDeferrability() {
		return deferrability;
	}
	void setDeferrability(short deferrability) {
		this.deferrability = deferrability;
	}
}