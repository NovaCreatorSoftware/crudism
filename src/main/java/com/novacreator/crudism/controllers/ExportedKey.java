package com.novacreator.crudism.controllers;

public class ExportedKey {
	public String primaryKeyTableCatalog;
	public String primaryKeyTableSchema;
	public String primaryKeyTableName;
	public String primaryKeyColumnName;
	public String foreignKeyTableCatalog;
	public String foreignKeyTableSchema;
	public String foreignKeyTableName;
	public String foreignKeyColumnName;
	public short keySequenceNumber;
	public short updateRule;
	public short deleteRule;
	public String foreignKeyName;
	public String primaryKeyName;
	public short deferrability;

	public ExportedKey() {
	}
}