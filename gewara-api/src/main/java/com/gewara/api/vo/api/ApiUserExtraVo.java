package com.gewara.api.vo.api;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class ApiUserExtraVo extends BaseVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -411948352145748060L;
	
	private Long id;				//��ApiUser����һ��id
	private String openDiscount;	//�Ż�״̬
	private String paymethod;		//֧�ֵ�֧����ʽ
	private String chargemethod;	//Ĭ�ϵĳ�ֵ��ʽ
	private String specialmethod;	//�����֧����ʽ��Ĭ�ϲ���ʾ���ؼۻ��ʱ����ʾ
	private String proxyqry;		//�����ѯ��url
	private String authFields;		//
	private String sourcemethod;
	private String otherinfo;
	private String supportseller;
	private String include;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOpenDiscount() {
		return openDiscount;
	}
	public void setOpenDiscount(String openDiscount) {
		this.openDiscount = openDiscount;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public String getChargemethod() {
		return chargemethod;
	}
	public void setChargemethod(String chargemethod) {
		this.chargemethod = chargemethod;
	}
	public String getSpecialmethod() {
		return specialmethod;
	}
	public void setSpecialmethod(String specialmethod) {
		this.specialmethod = specialmethod;
	}
	public String getProxyqry() {
		return proxyqry;
	}
	public void setProxyqry(String proxyqry) {
		this.proxyqry = proxyqry;
	}
	public String getAuthFields() {
		return authFields;
	}
	public void setAuthFields(String authFields) {
		this.authFields = authFields;
	}
	public String getSourcemethod() {
		return sourcemethod;
	}
	public void setSourcemethod(String sourcemethod) {
		this.sourcemethod = sourcemethod;
	}
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	public String getSupportseller() {
		return supportseller;
	}
	public void setSupportseller(String supportseller) {
		this.supportseller = supportseller;
	}
	public String getInclude() {
		return include;
	}
	public void setInclude(String include) {
		this.include = include;
	}
	@Override
	public Serializable realId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
