package com.gewara.weixin.friendcard;

import java.io.Serializable;

public class Img2Text implements Serializable{
	private static final long serialVersionUID = -7882425815550750870L;
	private String image_url;		//ͼƬ���ӣ���������ϴ�ͼƬ�ӿ��ϴ�ͼƬ������ӣ����ڴ����룬���򱨴� 
	private String text;			//ͼ��������5000������ 
	public Img2Text(){
		
	}
	public Img2Text(String image_url, String text){
		this.image_url = image_url;
		this.text = text;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
