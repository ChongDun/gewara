package com.gewara.msearch.external.entity.index;

/**
 * �������Ϣ,
 * @author ����
 * @createDate 2015��6��3��
 */
public class ActionIndexInfo extends IndexData{
	
	private static final long serialVersionUID = -4506948954048617634L;
	
	private String name=null;
	private String content=null;
	private String movieID=null;
	private String cityID=null;
	
	
	/**
	 * �����
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * �����
	 * @return
	 */
	public String getContent() {
		return content;
	}
	/**
	 * ������ĵ�ӰID
	 * @return
	 */
	public String getMovieID() {
		return movieID;
	}
	
	/**
	 * �����ĳ���ID�����μ�ģ��������ֻ�������о�ȷ����
	 * @return
	 */
	public String getCityID() {
		return cityID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
}
