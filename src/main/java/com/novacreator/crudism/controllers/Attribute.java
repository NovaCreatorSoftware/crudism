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
	public void setTypeCatalog(String typeCatalog) {
		this.typeCatalog = typeCatalog;
	}
	
	public String getTypeSchema() {
		return typeSchema;
	}
	public void setTypeSchema(String typeSchema) {
		this.typeSchema = typeSchema;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	
	public String getAttributeTypeName() {
		return attributeTypeName;
	}
	public void setAttributeTypeName(String attributeTypeName) {
		this.attributeTypeName = attributeTypeName;
	}
	
	public int getAttributeSize() {
		return attributeSize;
	}
	public void setAttributeSize(int attributeSize) {
		this.attributeSize = attributeSize;
	}
	
	public int getDecimalDigits() {
		return decimalDigits;
	}
	public void setDecimalDigits(int decimalDigits) {
		this.decimalDigits = decimalDigits;
	}
	
	public int getNumberPrecissionRadix() {
		return numberPrecissionRadix;
	}
	public void setNumberPrecissionRadix(int numberPrecissionRadix) {
		this.numberPrecissionRadix = numberPrecissionRadix;
	}
	
	public int getNullable() {
		return nullable;
	}
	public void setNullable(int nullable) {
		this.nullable = nullable;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public String getAttributeDefinition() {
		return attributeDefinition;
	}
	public void setAttributeDefinition(String attributeDefinition) {
		this.attributeDefinition = attributeDefinition;
	}
	
	public int getCharOctetLength() {
		return charOctetLength;
	}
	public void setCharOctetLength(int charOctetLength) {
		this.charOctetLength = charOctetLength;
	}
	
	public int getOrdinalPosition() {
		return ordinalPosition;
	}
	public void setOrdinalPosition(int ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	
	public String getIsNullable() {
		return isNullable;
	}
	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}
	
	public String getScopeCatalog() {
		return scopeCatalog;
	}
	public void setScopeCatalog(String scopeCatalog) {
		this.scopeCatalog = scopeCatalog;
	}
	
	public String getScopeSchema() {
		return scopeSchema;
	}
	public void setScopeSchema(String scopeSchema) {
		this.scopeSchema = scopeSchema;
	}
	
	public String getScopeTable() {
		return scopeTable;
	}
	public void setScopeTable(String scopeTable) {
		this.scopeTable = scopeTable;
	}
	
	public short getSourceDataType() {
		return sourceDataType;
	}
	public void setSourceDataType(short sourceDataType) {
		this.sourceDataType = sourceDataType;
	}
}