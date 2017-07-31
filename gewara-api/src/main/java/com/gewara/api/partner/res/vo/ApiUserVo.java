package com.gewara.api.partner.res.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class ApiUserVo extends BaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9050518635941028420L;
	public static final String STATUS_OPEN = "open";	//����ʹ��
	public static final String STATUS_PAUSE = "pause";	//��ͣʹ��
	public static final String STATUS_STOP = "stop";	//ֹͣʹ��

	private Long id;
	private String partnername;		//�����������
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
	public String getPartnername() {
		return partnername;
	}
	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}
	
	
}
