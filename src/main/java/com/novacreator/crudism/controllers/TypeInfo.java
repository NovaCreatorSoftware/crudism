package com.novacreator.crudism.controllers;

public class TypeInfo {
	private String typeName;
	private String dataType;
	private int precission;
	private String literalPrefix;
	private String literalSuffix;
	private String createParams;
	private short nullable;
	private boolean caseSensitive;
	private boolean searchable;
	private boolean unsignedAttribute;
	private boolean fixedPrecissionScale;
	private boolean autoIncrement;
	private String localTypeName;
	private short minimumScale;
	private short maximumScale;
	private int numberPrecissionRadix;
	
	public String getTypeName() {
		return typeName;
	}
	void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getDataType() {
		return dataType;
	}
	void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public int getPrecission() {
		return precission;
	}
	void setPrecission(int precission) {
		this.precission = precission;
	}
	
	public String getLiteralPrefix() {
		return literalPrefix;
	}
	void setLiteralPrefix(String literalPrefix) {
		this.literalPrefix = literalPrefix;
	}
	
	public String getLiteralSuffix() {
		return literalSuffix;
	}
	void setLiteralSuffix(String literalSuffix) {
		this.literalSuffix = literalSuffix;
	}
	
	public String getCreateParams() {
		return createParams;
	}
	void setCreateParams(String createParams) {
		this.createParams = createParams;
	}
	
	public short getNullable() {
		return nullable;
	}
	void setNullable(short nullable) {
		this.nullable = nullable;
	}
	
	public boolean isCaseSensitive() {
		return caseSensitive;
	}
	void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	
	public boolean isSearchable() {
		return searchable;
	}
	void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
	
	public boolean isUnsignedAttribute() {
		return unsignedAttribute;
	}
	void setUnsignedAttribute(boolean unsignedAttribute) {
		this.unsignedAttribute = unsignedAttribute;
	}
	
	public boolean isFixedPrecissionScale() {
		return fixedPrecissionScale;
	}
	void setFixedPrecissionScale(boolean fixedPrecissionScale) {
		this.fixedPrecissionScale = fixedPrecissionScale;
	}
	
	public boolean isAutoIncrement() {
		return autoIncrement;
	}
	void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
	
	public String getLocalTypeName() {
		return localTypeName;
	}
	void setLocalTypeName(String localTypeName) {
		this.localTypeName = localTypeName;
	}
	
	public short getMinimumScale() {
		return minimumScale;
	}
	void setMinimumScale(short minimumScale) {
		this.minimumScale = minimumScale;
	}
	
	public short getMaximumScale() {
		return maximumScale;
	}
	void setMaximumScale(short maximumScale) {
		this.maximumScale = maximumScale;
	}
	
	public int getNumberPrecissionRadix() {
		return numberPrecissionRadix;
	}
	void setNumberPrecissionRadix(int numberPrecissionRadix) {
		this.numberPrecissionRadix = numberPrecissionRadix;
	}
}
