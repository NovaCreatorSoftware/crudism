package com.novacreator.crudism.controllers;

public class IndexInfo {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private boolean nonUnique;
	private String indexQualifier;
	private String indexName;
	private short type;
	private short ordinalPosition;
	private String columnName;
	private String ascendingOrDescending;
	private long cardinality;
	private long pages;
	private String filterCondition;
	
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
	
	public boolean isNonUnique() {
		return nonUnique;
	}
	void setNonUnique(boolean nonUnique) {
		this.nonUnique = nonUnique;
	}
	
	public String getIndexQualifier() {
		return indexQualifier;
	}
	void setIndexQualifier(String indexQualifier) {
		this.indexQualifier = indexQualifier;
	}
	
	public String getIndexName() {
		return indexName;
	}
	void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	
	public short getType() {
		return type;
	}
	void setType(short type) {
		this.type = type;
	}
	
	public short getOrdinalPosition() {
		return ordinalPosition;
	}
	void setOrdinalPosition(short ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	
	public String getColumnName() {
		return columnName;
	}
	void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getAscendingOrDescending() {
		return ascendingOrDescending;
	}
	void setAscendingOrDescending(String ascendingOrDescending) {
		this.ascendingOrDescending = ascendingOrDescending;
	}
	
	public long getCardinality() {
		return cardinality;
	}
	void setCardinality(long cardinality) {
		this.cardinality = cardinality;
	}
	
	public long getPages() {
		return pages;
	}
	void setPages(long pages) {
		this.pages = pages;
	}
	
	public String getFilterCondition() {
		return filterCondition;
	}
	void setFilterCondition(String filterCondition) {
		this.filterCondition = filterCondition;
	}
}