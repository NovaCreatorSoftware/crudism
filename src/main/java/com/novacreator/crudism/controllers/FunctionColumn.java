package com.novacreator.crudism.controllers;

public class FunctionColumn {
	private String functionCatalog;
	private String functionSchema;
	private String functionName;
	private String columnName;
	private short columnType;
	private int dataType;
	private String typeName;
	private int precision;
	private int length;
	private short scale;
	private short radix;
	private short nullable;
	
	public String getFunctionCatalog() {
		return functionCatalog;
	}
	void setFunctionCatalog(String functionCatalog) {
		this.functionCatalog = functionCatalog;
	}
	
	public String getFunctionSchema() {
		return functionSchema;
	}
	void setFunctionSchema(String functionSchema) {
		this.functionSchema = functionSchema;
	}
	
	public String getFunctionName() {
		return functionName;
	}
	void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	public String getColumnName() {
		return columnName;
	}
	void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public short getColumnType() {
		return columnType;
	}
	void setColumnType(short columnType) {
		this.columnType = columnType;
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
	
	public int getPrecision() {
		return precision;
	}
	void setPrecision(int precision) {
		this.precision = precision;
	}
	
	public int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	
	public short getScale() {
		return scale;
	}
	void setScale(short scale) {
		this.scale = scale;
	}
	
	public short getRadix() {
		return radix;
	}
	void setRadix(short radix) {
		this.radix = radix;
	}
	
	public short getNullable() {
		return nullable;
	}
	void setNullable(short nullable) {
		this.nullable = nullable;
	}
}