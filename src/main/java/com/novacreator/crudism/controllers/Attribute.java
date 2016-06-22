package com.novacreator.crudism.controllers;

public class Attribute {
	private String typeCatalog;
	private String typeSchema;
	private String typeName;
	private String attributeName;
	private int dataType;
	private String attributeTypeName;
	private int attributeSize;
	private int decimalDigits;
	private int numberPrecissionRadix;
	private int nullable;
	private String remarks;
	private String attributeDefinition;
	private int charOctetLength;
	private int ordinalPosition;
	private String isNullable;
	private String scopeCatalog;
	private String scopeSchema;
	private String scopeTable;
	private short sourceDataType;
	
	public String getTypeCatalog() {
		return typeCatalog;
	}
	void setTypeCatalog(String typeCatalog) {
		this.typeCatalog = typeCatalog;
	}
	
	public String getTypeSchema() {
		return typeSchema;
	}
	void setTypeSchema(String typeSchema) {
		this.typeSchema = typeSchema;
	}
	
	public String getTypeName() {
		return typeName;
	}
	void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getAttributeName() {
		return attributeName;
	}
	void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	public int getDataType() {
		return dataType;
	}
	void setDataType(int dataType) {
		this.dataType = dataType;
	}
	
	public String getAttributeTypeName() {
		return attributeTypeName;
	}
	void setAttributeTypeName(String attributeTypeName) {
		this.attributeTypeName = attributeTypeName;
	}
	
	public int getAttributeSize() {
		return attributeSize;
	}
	void setAttributeSize(int attributeSize) {
		this.attributeSize = attributeSize;
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
	
	public String getAttributeDefinition() {
		return attributeDefinition;
	}
	void setAttributeDefinition(String attributeDefinition) {
		this.attributeDefinition = attributeDefinition;
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
}