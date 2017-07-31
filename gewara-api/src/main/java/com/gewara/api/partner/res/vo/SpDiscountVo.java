package com.gewara.api.partner.res.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class SpDiscountVo extends BaseVo{
	private static final long serialVersionUID = 1706595364713204120L;
	private Long id;
	private String title;				
	private String description;
	private Integer isenable;			//��֧�ִ˳��λ  1֧��  0��֧��
	private String validUrl;			//��֤url �������뿨��
	private Integer needBindMobile;		//��Ҫ���ֻ���
	private Long usedDiscountId;		//�Ѿ�ʹ�ò������ۿ�id
	private String cancelable;			//�Ƿ���ȡ��
	private String paymethod;			//֧����ʽ
	private Integer needSpcode;			//�Ƿ���Ҫ�ؼۻ��
	private Integer discount;           
	private String discountType;
	private String otherinfo;
	public SpDiscountVo(){
		
	}
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIsenable() {
		return isenable;
	}
	public void setIsenable(Integer isenable) {
		this.isenable = isenable;
	}
	public String getValidUrl() {
		return validUrl;
	}
	public void setValidUrl(String validUrl) {
		this.validUrl = validUrl;
	}
	public Integer getNeedBindMobile() {
		return needBindMobile;
	}
	public void setNeedBindMobile(Integer needBindMobile) {
		this.needBindMobile = needBindMobile;
	}
	public Long getUsedDiscountId() {
		return usedDiscountId;
	}
	public void setUsedDiscountId(Long usedDiscountId) {
		this.usedDiscountId = usedDiscountId;
	}
	public String getCancelable() {
		return cancelable;
	}
	public void setCancelable(String cancelable) {
		this.cancelable = cancelable;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public Integer getNeedSpcode() {
		return needSpcode;
	}
	public void setNeedSpcode(Integer needSpcode) {
		this.needSpcode = needSpcode;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	
}
