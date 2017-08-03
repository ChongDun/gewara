package com.gewara.mall.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;


public class SkuSpecificationVo extends BaseVo {
	private static final long serialVersionUID = 7964278333868311752L;

	/**
	 * ��������
	 */
	private Long id;
	private Long productId;								//��Ʒid
	private Long skuId;									//SKU id
	private String skey; 								//SKU Ψһ��ʾ  (productid+attributeValueId1+attributeValueId2 or productid+attributeValueId1)
	private Long attributeId1;							//��������1
	private Long attributeValueId1;						//��������ֵ1
	private Long attributeId2;							//��������2
	private Long attributeValueId2;						//��������ֵ2	
	
	public SkuSpecificationVo(){}
	
	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getAttributeId1() {
		return attributeId1;
	}
	public void setAttributeId1(Long attributeId1) {
		this.attributeId1 = attributeId1;
	}
	public Long getAttributeValueId1() {
		return attributeValueId1;
	}
	public void setAttributeValueId1(Long attributeValueId1) {
		this.attributeValueId1 = attributeValueId1;
	}
	public Long getAttributeId2() {
		return attributeId2;
	}
	public void setAttributeId2(Long attributeId2) {
		this.attributeId2 = attributeId2;
	}
	public Long getAttributeValueId2() {
		return attributeValueId2;
	}
	public void setAttributeValueId2(Long attributeValueId2) {
		this.attributeValueId2 = attributeValueId2;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getSkey() {
		return skey;
	}
	public void setSkey(String skey) {
		this.skey = skey;
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
	
	
}
