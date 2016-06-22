package com.novacreator.crudism.controllers;

public class ClientInfo {
	private String name;
	private int maxLength;
	private String defaultValue;
	private String description;
	
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	public int getMaxLength() {
		return maxLength;
	}
	void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	
	public String getDefaultValue() {
		return defaultValue;
	}
	void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
}