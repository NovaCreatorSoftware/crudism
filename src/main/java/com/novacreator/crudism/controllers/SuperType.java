package com.novacreator.crudism.controllers;

public class SuperType {
	private String typeCatalog;
	private String typeSchema;
	private String superTypeCatalog;
	private String superTypeSchema;
	private String superTypeName;
	
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
	
	public String getSuperTypeCatalog() {
		return superTypeCatalog;
	}
	void setSuperTypeCatalog(String superTypeCatalog) {
		this.superTypeCatalog = superTypeCatalog;
	}
	
	public String getSuperTypeSchema() {
		return superTypeSchema;
	}
	void setSuperTypeSchema(String superTypeSchema) {
		this.superTypeSchema = superTypeSchema;
	}
	
	public String getSuperTypeName() {
		return superTypeName;
	}
	void setSuperTypeName(String superTypeName) {
		this.superTypeName = superTypeName;
	}
}
