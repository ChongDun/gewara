package com.gewara.msearch.external.entity.index;

/**
 * ��Ա������Ϣ
 * @author ����
 * @createDate 2015��6��3��
 */
public class MemberIndexInfo extends IndexData{
	
	private static final long serialVersionUID = -3071643178306274317L;
	private String nick=null;
	private String field1 = "";//Ԥ����չ�ֶ�
	private String field2 = "";//Ԥ����չ�ֶ�
	
	/**
	 * ��Ա�ǳ�
	 * @return
	 */
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}
	
}
