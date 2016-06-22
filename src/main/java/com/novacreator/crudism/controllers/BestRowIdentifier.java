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
	public void setScope(short scope) {
		this.scope = scope;
	}
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public int getColumnSize() {
		return columnSize;
	}
	public void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}
	
	public short getDecimalDigits() {
		return decimalDigits;
	}
	public void setDecimalDigits(short decimalDigits) {
		this.decimalDigits = decimalDigits;
	}
	
	public short getPseudoColumn() {
		return pseudoColumn;
	}
	public void setPseudoColumn(short pseudoColumn) {
		this.pseudoColumn = pseudoColumn;
	}
}