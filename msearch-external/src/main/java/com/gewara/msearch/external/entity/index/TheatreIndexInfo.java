package com.gewara.msearch.external.entity.index;

/**
 * ��Ժ������Ϣ
 */
public class TheatreIndexInfo extends IndexData{
	
	private static final long serialVersionUID = -5353503091696102130L;
	private String name=null;
	private String address=null;
	private String briefname=null;
	private String cityID=null;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * ���ڵĳ���ID�����μ�ģ��������ֻ�������о�ȷ����
	 * @return
	 */
	public String getCityID() {
		return cityID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getBriefname() {
		return briefname;
	}

	public void setBriefname(String briefname) {
		this.briefname = briefname;
	}
	
}
