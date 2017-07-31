package com.gewara.msearch.external.entity.index;

import java.util.List;

/**
 * ��Ӱ����Ϣ
 * 
 * @author ����
 * @createDate 2015��6��3��
 */
public class MovieIndexInfo  extends IndexData {

	private static final long serialVersionUID = 7074469411495043856L;
	
	private String name = null;//��������
	private String ename = null;//Ӣ������
	private List<String> aliases=null;//��Ӱ����
	

	private List<String> directors = null; //�����б�
	private List<String> protagonists = null;//��Ա�б�
	private List<String> actors = null;//��ɫ�б�
	private String desc = null;//��Ӱ���
	
	
	/**
	 * ӰƬ�ı���
	 * @return
	 */
	public List<String> getAliases() {
		return aliases;
	}

	
	
	/**
	 * ӰƬ��������
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * ӰƬӢ������
	 * @return
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * ӰƬ�ĵ����б�
	 * @return
	 */
	public List<String> getDirectors() {
		return directors;
	}

	/**
	 * ӰƬ����Ա�б�
	 * @return
	 */
	public List<String> getProtagonists() {
		return protagonists;
	}

	/**
	 * ӰƬ�Ľ�ɫ�б�
	 * @return
	 */
	public List<String> getActors() {
		return actors;
	}

	/**
	 * ӰƬ�ļ��
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

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public void setProtagonists(List<String> protagonists) {
		this.protagonists = protagonists;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}

}
