package com.novacreator.crudism.controllers;

public class ProcedureColumn {
	private String procedureCatalog;
	private String procedureSchema;
	private String procedureName;
	private String columnName;
	private short columnType;
	private int dataType;
	private String typeName;
	private int precission;
	private int length;
	private short scale;
	private short radix;
	private short nullable;
	private String remarks;
	private String columnDefaultValue;
	private int charOctetLength;
	private int ordinalPosition;
	private String isNullable;
	private String specificName;
	
	public String getProcedureCatalog() {
		return procedureCatalog;
	}
	void setProcedureCatalog(String procedureCatalog) {
		this.procedureCatalog = procedureCatalog;
	}
	
	public String getProcedureSchema() {
		return procedureSchema;
	}
	void setProcedureSchema(String procedureSchema) {
		this.procedureSchema = procedureSchema;
	}
	
	public String getProcedureName() {
		return procedureName;
	}
	void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
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
	
	public int getPrecission() {
		return precission;
	}
	void setPrecission(int precission) {
		this.precission = precission;
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
	
	public String getRemarks() {
		return remarks;
	}
	void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getColumnDefaultValue() {
		return columnDefaultValue;
	}
	void setColumnDefaultValue(String columnDefaultValue) {
		this.columnDefaultValue = columnDefaultValue;
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
	
	public String getSpecificName() {
		return specificName;
	}
	void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
}