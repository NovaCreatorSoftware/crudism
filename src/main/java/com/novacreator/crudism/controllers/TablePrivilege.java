package com.novacreator.crudism.controllers;

public class TablePrivilege {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String grantor;
	private String grantee;
	private String privilege;
	private String isGrantable;
	
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
	
	public String getGrantor() {
		return grantor;
	}
	void setGrantor(String grantor) {
		this.grantor = grantor;
	}
	
	public String getGrantee() {
		return grantee;
	}
	void setGrantee(String grantee) {
		this.grantee = grantee;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public String getIsGrantable() {
		return isGrantable;
	}
	void setIsGrantable(String isGrantable) {
		this.isGrantable = isGrantable;
	}
}