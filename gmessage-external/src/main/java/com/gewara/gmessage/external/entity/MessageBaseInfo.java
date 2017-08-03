package com.gewara.gmessage.external.entity;

import java.io.Serializable;

import com.gewara.gmessage.external.constant.MCategory;
import com.gewara.gmessage.external.constant.MType;

public abstract class MessageBaseInfo implements Serializable{
	private static final long serialVersionUID = -8305456371926741367L;
	private String title=null;
	private String content=null;
	private String releaseURL=null;
	private String releaseID=null;
	private String releaseIDType=null;
	private String releaseExt=null;
	
	private String tag=null; 
	private MCategory category=null;
	private MType type=null;
	private String optType=null;
	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getReleaseURL() {
		return releaseURL;
	}
	public String getReleaseID() {
		return releaseID;
	}
	public String getReleaseIDType() {
		return releaseIDType;
	}
	public String getTag() {
		return tag;
	}
	
	public MCategory getCategory() {
		return category;
	}
	
	public MType getType() {
		return type;
	}
	
	public String getOptType() {
		return optType;
	}
	public String getReleaseExt() {
		return releaseExt;
	}
	
	/**
	 * ��Ϣ���⣬�Ǳ���
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * ��Ϣ���ݣ�����
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * ��Ϣ��ص�URL, �Ǳ���
	 * @param releaseURL
	 */
	public void setReleaseURL(String releaseURL) {
		this.releaseURL = releaseURL;
	}
	
	/**
	 * ����Ϣ��ص�Ŀ��ID,���releaseIDTypeʹ�ã����߱���ͬʱ��д���Ǳ����ֶ�
	 * @param releaseID
	 */
	public void setReleaseID(String releaseID,String releaseIDType) {
		this.releaseID = releaseID;
		this.releaseIDType = releaseIDType;
	}
	
	/**
	 * ��Ϣ��ǩ����Ҫ������ҵ��ϵͳʵ���Լ���ҵ��ʹ�á� �Ǳ���
	 * ���tag������ [GM.WALA.MERGE]����Ϣ�������realeaseID��type��ͬ�Ļ������кϲ�����
	 * ��������������һ����¼������������Ϣ��������С������ϲ����β�ѯ֮��ģ�����ʼ��ֻ�ϲ�������Ŀǰ�Ѿ���ָ�ˣ���
	 * 
	 * 
	 * @param tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * ��Ϣ�����Լ���Ϣ���͡�����
	 * @param category
	 */
	public void setCategory(MCategory category,MType type) {
		this.category = category;
		this.type=type;
	}
	
	/**
	 * ����ֶ���������������Ϣ����ʲô��Ϊ�����ģ�������д
	 * @return
	 */
	public void setOptType(String optType) {
		this.optType=optType;
	}
	
	/**
	 * ����ֶ�������¼�͸���Ϣ��ص���չ��Ϣ�� �Ǳ���
	 * ���跢���ض���Ϣֻpushϵͳ������ֶεĸ�ʽ��������
	 * {push:{}}����{push:[]}�� json��ʽ��������push����ֶΣ���ֵ�͸�ʽ����ҵ��Ҫ���Զ��塣
	 * @param releaseExt
	 */
	public void setReleaseExt(String releaseExt) {
		this.releaseExt = releaseExt;
	}
	
	public void copyValue(MessageBaseInfo mbi){
		  this.title=mbi.getTitle();
		  this.content=mbi.getContent();
		  this.releaseURL=mbi.getReleaseURL();
		  this.releaseID=mbi.getReleaseID();
		  this.releaseIDType=mbi.getReleaseIDType();
		  this.releaseExt=mbi.getReleaseExt();
		
		  this.tag=mbi.getTag(); 
		  this.category=mbi.getCategory();
		  this.type=mbi.getType();
		  this.optType=mbi.getOptType();
	}
}
