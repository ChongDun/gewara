package com.gewara.gmessage.external.constant;

public enum MCategory{
	/**ϵͳ*/
	SYS(1),
	
	/**����*/
	INTERACT(2),
	
	/**��ʱ*/
	INSTANT(3),
	
	/**�Ƽ�*/
	RECOMMEND(4),
	
	/**����*/
	COMMENT(5);
	
	private int value=0;
	private MCategory(int value){
		this.value=value;
	}
	
	public int value(){
		return this.value;
	}
	
	public static MCategory valueOf(int value){
		switch(value){
			case 1:return SYS;
			case 2:return INTERACT;
			case 3:return INSTANT;
			case 4:return RECOMMEND;
			case 5:return COMMENT;
		}
		return null;
	}
}
