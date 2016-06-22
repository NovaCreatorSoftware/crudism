package com.novacreator.crudism.controllers;

public class IndexInfo {
	public String tableCatalog;
	public String tableSchema;
	public String tableName;
	public boolean nonUnique;
	public String indexQualifier;
	public String indexName;
	public short type;
	public short ordinalPosition;
	public String columnName;
	public String ascendingOrDescending;
	public long cardinality;
	public long pages;
	public String filterCondition;

	public IndexInfo() {
	}
}