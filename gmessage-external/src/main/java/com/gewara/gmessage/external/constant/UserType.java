package com.gewara.gmessage.external.constant;

public enum UserType {
	
	/**gewara ��Ա*/
	MEMBER("M"),
	
	/**gewara �̻�*/
	BUSINESS("B"),
	
	/**gewara ��̨��ά��Ա*/
	MAINTAIN("A");
	
	private String value=null;
	private UserType(String value){
		this.value=value;
	}
	
	public String value(){
		return this.value;
	}
	
}
