package com.gewara.msearch.external.entity.index;

import java.util.List;

/**
 * Ӱ��������Ϣ
 * @author ����
 * @createDate 2015��6��3��
 */
public class ActorIndexInfo extends IndexData{
	
	private static final long serialVersionUID = -4373138388897459750L;
	private String name=null;
	private String ename=null;
	private List<String> aliases=null;
	private List<String> shows=null;
	private List<String> directors=null;
	private String desc=null;
	
	
	/**
	 * �������������������ȵ�
	 * @return
	 */
	public List<String> getAliases() {
		return aliases;
	}
	
	/**
	 * Ӱ����������
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ӱ��Ӣ������
	 * @return
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * �μ��ݳ����ĵ�Ӱ�����б�
	 * @return
	 */
	public List<String> getShows() {
		return shows;
	}
	/**
	 * ���ݹ��ĵ�Ӱ�����б�
	 * @return
	 */
	public List<String> getDirectors() {
		return directors;
	}
	/**
	 * Ӱ�˵ļ��
	 * @return
	 */
	public String getDesc() {
		return desc;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setShows(List<String> shows) {
		this.shows = shows;
	}
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	
	
	
	
}
