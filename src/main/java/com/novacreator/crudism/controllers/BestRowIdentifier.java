package com.novacreator.crudism.controllers;

public class BestRowIdentifier {
	private short scope;
	private String columnName;
	private int dataType;
	private String typeName;
	private int columnSize;
	private short decimalDigits;
	private short pseudoColumn;
	
	public short getScope() {
		return scope;
	}
	void setScope(short scope) {
		this.scope = scope;
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
	
	public short getDecimalDigits() {
		return decimalDigits;
	}
	void setDecimalDigits(short decimalDigits) {
		this.decimalDigits = decimalDigits;
	}
	
	public short getPseudoColumn() {
		return pseudoColumn;
	}
	void setPseudoColumn(short pseudoColumn) {
		this.pseudoColumn = pseudoColumn;
	}
}