package com.gewara.api.vo.common;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;


public class RedEnvelopeManagerVo extends BaseVo {
	
	private static final long serialVersionUID = 5486510291048700966L;

	@Override
	public Serializable realId() {
		return url;
	}
	//�����ʼʱ��
	private String starttime;
	//�������ʱ��
	private String endtime;
	//���ͼƬ
	private String logo;
	//�������
	private String title;
	//���url
	private String url;
	//�Ƿ������ɺ�� Y:�������ɺ�� N:��ʾ�������ɺ�� 
	private String valid;
	//�������
	private String shareTitle;
	//��������
	private String shareContent;
	//����ͼƬ
	private String sharePic;
	//��������
	private String dialogTitle;
	//��������
	private String dialogContent;
	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getShareTitle() {
		return shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}
	public String getShareContent() {
		return shareContent;
	}
	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}
	public String getSharePic() {
		return sharePic;
	}
	
	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}
	
	public String getDialogTitle() {
		return dialogTitle;
	}
	
	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}
	
	public String getDialogContent() {
		return dialogContent;
	}
	
	public void setDialogContent(String dialogContent) {
		this.dialogContent = dialogContent;
	}
	
}
