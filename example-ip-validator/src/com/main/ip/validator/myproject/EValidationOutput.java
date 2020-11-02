package com.main.ip.validator.myproject;

public enum EValidationOutput {
 
	INVALID_PREFIX("Invalid Prefix! ","11.122.10."," must begin with."),
	INVALID_SUFFIX("Invalid Suffix! ","19-50"," must be between.");
	
	
	private String invalid;
	private String ip;
	private String message;
	
	 private EValidationOutput(String invalid, String ip, String message) {
		this.invalid = invalid;
		this.ip = ip;
		this.message = message;
	}

	public String getInvalid() {
		return invalid;
	}

	public String getIp() {
		return ip;
	}

	public String getMessage() {
		return message;
	} 
	 
}
