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
	public void setParentKeyTableCatalog(String parentKeyTableCatalog) {
		this.parentKeyTableCatalog = parentKeyTableCatalog;
	}
	
	public String getParentKeyTableSchema() {
		return parentKeyTableSchema;
	}
	public void setParentKeyTableSchema(String parentKeyTableSchema) {
		this.parentKeyTableSchema = parentKeyTableSchema;
	}
	
	public String getParentKeyTableName() {
		return parentKeyTableName;
	}
	public void setParentKeyTableName(String parentKeyTableName) {
		this.parentKeyTableName = parentKeyTableName;
	}
	
	public String getParentKeyTableColumnName() {
		return parentKeyTableColumnName;
	}
	public void setParentKeyTableColumnName(String parentKeyTableColumnName) {
		this.parentKeyTableColumnName = parentKeyTableColumnName;
	}
	
	public String getForeignKeyTableCatalog() {
		return foreignKeyTableCatalog;
	}
	public void setForeignKeyTableCatalog(String foreignKeyTableCatalog) {
		this.foreignKeyTableCatalog = foreignKeyTableCatalog;
	}
	
	public String getForeignKeyTableSchema() {
		return foreignKeyTableSchema;
	}
	public void setForeignKeyTableSchema(String foreignKeyTableSchema) {
		this.foreignKeyTableSchema = foreignKeyTableSchema;
	}
	
	public String getForeignKeyTableName() {
		return foreignKeyTableName;
	}
	public void setForeignKeyTableName(String foreignKeyTableName) {
		this.foreignKeyTableName = foreignKeyTableName;
	}
	
	public String getForeignKeyColumnName() {
		return foreignKeyColumnName;
	}
	public void setForeignKeyColumnName(String foreignKeyColumnName) {
		this.foreignKeyColumnName = foreignKeyColumnName;
	}
	
	public short getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(short sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	public short getUpdateRule() {
		return updateRule;
	}
	public void setUpdateRule(short updateRule) {
		this.updateRule = updateRule;
	}
	
	public short getDeleteRule() {
		return deleteRule;
	}
	public void setDeleteRule(short deleteRule) {
		this.deleteRule = deleteRule;
	}
	
	public String getForeignKeyName() {
		return foreignKeyName;
	}
	public void setForeignKeyName(String foreignKeyName) {
		this.foreignKeyName = foreignKeyName;
	}
	
	public String getParentKeyName() {
		return parentKeyName;
	}
	public void setParentKeyName(String parentKeyName) {
		this.parentKeyName = parentKeyName;
	}
	
	public short getDeferrability() {
		return deferrability;
	}
	public void setDeferrability(short deferrability) {
		this.deferrability = deferrability;
	}
}