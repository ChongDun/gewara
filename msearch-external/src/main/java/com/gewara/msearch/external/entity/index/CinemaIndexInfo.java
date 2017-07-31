package com.gewara.msearch.external.entity.index;

/**
 * ӰԺ������Ϣ
 * @author ����
 * @createDate 2015��6��3��
 */
public class CinemaIndexInfo extends IndexData{
	
	private static final long serialVersionUID = -5353503091696102130L;
	private String name=null;
	private String address=null;
	private String desc=null;
	private String cityID=null;
	
	/**
	 * ӰԺ������
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * ӰԺ�ĵ�ַ
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * ӰԺ�ļ��
	 * @return
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * ӰԺ���ڵĳ���ID�����μ�ģ��������ֻ�������о�ȷ����
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
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	
}
