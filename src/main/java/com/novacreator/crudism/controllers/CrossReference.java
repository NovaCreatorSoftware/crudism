package com.novacreator.crudism.controllers;

public class CrossReference {
	private String parentKeyTableCatalog;
	private String parentKeyTableSchema;
	private String parentKeyTableName;
	private String parentKeyTableColumnName;
	private String foreignKeyTableCatalog;
	private String foreignKeyTableSchema;
	private String foreignKeyTableName;
	private String foreignKeyColumnName;
	private short sequenceNumber;
	private short updateRule;
	private short deleteRule;
	private String foreignKeyName;
	private String parentKeyName;
	private short deferrability;
	
	public String getParentKeyTableCatalog() {
		return parentKeyTableCatalog;
	}
	void setParentKeyTableCatalog(String parentKeyTableCatalog) {
		this.parentKeyTableCatalog = parentKeyTableCatalog;
	}
	
	public String getParentKeyTableSchema() {
		return parentKeyTableSchema;
	}
	void setParentKeyTableSchema(String parentKeyTableSchema) {
		this.parentKeyTableSchema = parentKeyTableSchema;
	}
	
	public String getParentKeyTableName() {
		return parentKeyTableName;
	}
	void setParentKeyTableName(String parentKeyTableName) {
		this.parentKeyTableName = parentKeyTableName;
	}
	
	public String getParentKeyTableColumnName() {
		return parentKeyTableColumnName;
	}
	void setParentKeyTableColumnName(String parentKeyTableColumnName) {
		this.parentKeyTableColumnName = parentKeyTableColumnName;
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
	
	public short getSequenceNumber() {
		return sequenceNumber;
	}
	void setSequenceNumber(short sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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
	
	public String getParentKeyName() {
		return parentKeyName;
	}
	void setParentKeyName(String parentKeyName) {
		this.parentKeyName = parentKeyName;
	}
	
	public short getDeferrability() {
		return deferrability;
	}
	void setDeferrability(short deferrability) {
		this.deferrability = deferrability;
	}
}