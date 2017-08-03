package com.gewara.movie.vo;


import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class EffectInfoVo extends BaseVo{
	private static final long serialVersionUID = -8456969167272896454L;
	private String key; //����key OR ͼƬ·��picPath
	private Integer value; //�������
	private String description; //һ�仰����
	private String picPathListJson; //[{key:picPath,value:picOrderNumber},{key:picPath,value:picOrderNumber}] key=ͼƬ·�� value=�����
	private String walaids;
	private Integer showNumber; //��ʾ�������ϵ����
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicPathListJson() {
		return picPathListJson;
	}
	public void setPicPathListJson(String picPathListJson) {
		this.picPathListJson = picPathListJson;
	}
	public String getWalaids() {
		return walaids;
	}
	public void setWalaids(String walaids) {
		this.walaids = walaids;
	}
	
	public Integer getShowNumber() {
		return showNumber;
	}
	public void setShowNumber(Integer showNumber) {
		this.showNumber = showNumber;
	}
	@Override
	public Serializable realId() {
		return key;
	}
	

}
