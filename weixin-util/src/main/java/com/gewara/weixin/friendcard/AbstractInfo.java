package com.gewara.weixin.friendcard;

import java.io.Serializable;

public class AbstractInfo implements Serializable{
	private static final long serialVersionUID = -4922262696501830877L;
	private String abstract1;			//�Ż�����ժҪ�ֶνṹ������
	private String[] icon_url_list;		//����ͼƬ�б���֧������һ������ͼƬ���ӣ��ϴ�ͼƬ�ӿ��ϴ���ȡͼƬ������ӣ���д��CDN���ӻᱨ�����ڴ����롣����ͼƬ�ߴ�����850*350 
	private String text_image_list;		//ͼ���б���ʾ��������ҳ���Ż�ȯȯ�����������ٴ���һ��ͼ���б� 
	public AbstractInfo(){
		
	}
	public String getAbstract1() {
		return abstract1;
	}
	public void setAbstract1(String abstract1) {
		this.abstract1 = abstract1;
	}
	public String[] getIcon_url_list() {
		return icon_url_list;
	}
	public void setIcon_url_list(String[] icon_url_list) {
		this.icon_url_list = icon_url_list;
	}
	public String getText_image_list() {
		return text_image_list;
	}
	public void setText_image_list(String text_image_list) {
		this.text_image_list = text_image_list;
	}
	
}
