package com.novacreator.crudism.controllers;

public class Column {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String name;
	private int dataType;
	private String typeName;
	private int columnSize;
	private int decimalDigits;
	private int numberPrecissionRadix;
	private int nullable;
	private String remarks;
	private String columnDefinition;
	private int charOctetLength;
	private int ordinalPosition;
	private String isNullable;
	private String scopeCatalog;
	private String scopeSchema;
	private String scopeTable;
	private short sourceDataType;
	private String isAutoincrement;
	private String isGeneratedColumn;
	
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
	
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	public int getDataType() {
		return dataType;
	}
	void setDataType(int dataType) {
		this.dataType = dataType;
	}
	
	public String getTypeName() {
		return typeName;
	}
	void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public int getColumnSize() {
		return columnSize;
	}
	void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}
	
	public int getDecimalDigits() {
		return decimalDigits;
	}
	void setDecimalDigits(int decimalDigits) {
		this.decimalDigits = decimalDigits;
	}
	
	public int getNumberPrecissionRadix() {
		return numberPrecissionRadix;
	}
	void setNumberPrecissionRadix(int numberPrecissionRadix) {
		this.numberPrecissionRadix = numberPrecissionRadix;
	}
	
	public int getNullable() {
		return nullable;
	}
	void setNullable(int nullable) {
		this.nullable = nullable;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getColumnDefinition() {
		return columnDefinition;
	}
	void setColumnDefinition(String columnDefinition) {
		this.columnDefinition = columnDefinition;
	}
	
	public int getCharOctetLength() {
		return charOctetLength;
	}
	void setCharOctetLength(int charOctetLength) {
		this.charOctetLength = charOctetLength;
	}
	
	public int getOrdinalPosition() {
		return ordinalPosition;
	}
	void setOrdinalPosition(int ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	
	public String getIsNullable() {
		return isNullable;
	}
	void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}
	
	public String getScopeCatalog() {
		return scopeCatalog;
	}
	void setScopeCatalog(String scopeCatalog) {
		this.scopeCatalog = scopeCatalog;
	}
	
	public String getScopeSchema() {
		return scopeSchema;
	}
	void setScopeSchema(String scopeSchema) {
		this.scopeSchema = scopeSchema;
	}
	
	public String getScopeTable() {
		return scopeTable;
	}
	void setScopeTable(String scopeTable) {
		this.scopeTable = scopeTable;
	}
	
	public short getSourceDataType() {
		return sourceDataType;
	}
	void setSourceDataType(short sourceDataType) {
		this.sourceDataType = sourceDataType;
	}
	
	public String getIsAutoincrement() {
		return isAutoincrement;
	}
	void setIsAutoincrement(String isAutoincrement) {
		this.isAutoincrement = isAutoincrement;
	}
	
	public String getIsGeneratedColumn() {
		return isGeneratedColumn;
	}
	void setIsGeneratedColumn(String isGeneratedColumn) {
		this.isGeneratedColumn = isGeneratedColumn;
	}
}