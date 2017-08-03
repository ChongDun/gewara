package com.gewara.weixin.friendcard;

import java.io.Serializable;

public class AdvancedAbstact implements Serializable{
	private static final long serialVersionUID = 3468254563155003748L;
	private String abstract1;			//�Ż�����ժҪ�ֶνṹ������ 
	private String[] icon_url_list;		//����ͼƬ�б���֧������һ������ͼƬ���ӣ��ϴ�ͼƬ�ӿ��ϴ���ȡͼƬ������ӣ���д��CDN���ӻᱨ�����ڴ����롣����ͼƬ�ߴ�����850*350 
	public AdvancedAbstact(){
		
	}
	public AdvancedAbstact(String abstract1, String[] icon_url_list){
		this.abstract1 = abstract1;
		this.icon_url_list = icon_url_list;
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
}
