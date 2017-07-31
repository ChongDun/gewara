package com.gewara.api.terminal.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class MachineAdVo extends BaseVo {
	public static final String FILE_TYPE_WALLPAPER = "wallpaper";
	public static final String FILE_TYPE_SCREENSAVER = "screensaver";
	
	private static final long serialVersionUID = 8091397268335515143L;
	private Long id;			
	private String placeid;		//����id
	private String adversion;	//�汾
	private String zipurl;		//ѹ������ַ
	private String remark;		//����
	private Timestamp addtime;
	private Timestamp startTime; //�����Ч��ʼʱ��
	private Timestamp endTime; //�����Ч����ʱ��
	private String type;//��������
	private String nickName;//�����id
	private String filetype;	// ��ֽor����
	@Override
	public Serializable realId() {
		return id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaceid() {
		return placeid;
	}
	public void setPlaceid(String placeid) {
		this.placeid = placeid;
	}
	public String getAdversion() {
		return adversion;
	}
	public void setAdversion(String adversion) {
		this.adversion = adversion;
	}
	public String getZipurl() {
		return zipurl;
	}
	public void setZipurl(String zipurl) {
		this.zipurl = zipurl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	
}
