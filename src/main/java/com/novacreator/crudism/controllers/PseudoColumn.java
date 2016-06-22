package com.novacreator.crudism.controllers;

public class PseudoColumn {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String columnName;
	private int dataType;
	private int columnSize;
	private int decimalDigits;
	private int numberPrecissionRadix;
	private String columnUsage;
	private String remarks;
	private int charOctetLength;
	private String isNullable;

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
	
	public int getDataType() {
		return dataType;
	}
	void setDataType(int dataType) {
		this.dataType = dataType;
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
	
	public String getColumnUsage() {
		return columnUsage;
	}
	void setColumnUsage(String columnUsage) {
		this.columnUsage = columnUsage;
	}
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public int getCharOctetLength() {
		return charOctetLength;
	}
	void setCharOctetLength(int charOctetLength) {
		this.charOctetLength = charOctetLength;
	}
	
	public String getIsNullable() {
		return isNullable;
	}
	void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}
}