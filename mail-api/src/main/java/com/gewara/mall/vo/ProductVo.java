package com.gewara.mall.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.util.JsonUtils;

public class ProductVo extends BaseVo {
	private static final long serialVersionUID = 3124980986021558566L;
	private Long id;
	private Integer version;					//���°汾
	private String name;						//����
	private String fullName;					//ȫ��
	private String logo;						//ͼƬ
	private String introduction;				//����
	private String productCode;				//��Ʒ����
	private String note;						//ע������
	private String source;					//��Ʒ��Դ
	private Long categoryId;					//��Ʒ����
	private String categoryPath;				//����·��
	private Long attributeId1;				//��������1
	private Long attributeId2;				//��������2
	private Integer skuCount;					//sku����
	private Integer stock;					//���
	private Integer sold;						//������
	private Integer price;					//�۸�
	private Long brandId;						//Ʒ��
	private String status;					//״̬
	private String parameter;					//��Ʒ���� json��ʽ���ݣ�{"����":"����","�䳤","����"}
	
	private String people;					//����   ���������̾���
	private String crowd;						//��Ⱥ   ͬ�¡����ۡ�����
	
	//�������и���������
	private String tag;						//movie,drama
	private Long relatedId;					//��Ӱid,�ݳ�id
	private String otherInfo;					//������Ϣ
	private String keywords;					//�ؼ���
	
	private String sevenDayRefund;			//7���˻�
	private String packageList;				//��װ�嵥
	private String afterSaleService;			//�ۺ����
	private Long shippingTemplateId;			//�˷�ģ��ID
	private Long vendorId;					//��Ӧ��id
	private Long shipperId;					//������ID
	private String elecard;					//1)���õĵ���ȯ����D��2) M��ʾ�����̼������Żݻ
	private Long boughtMovieId;				//�����ĳ����Ӱ�ģ��ſ��Թ���
	private Integer limitBuyQty;				//���ɹ�������
	
	private String saleModel;					//����ģʽ
	private Timestamp onSaleTime;				//��ʱ�ϼ�ʱ��
	private Timestamp offSaleTime;			//��ʱ�¼�ʱ��
	private String sellType;				//�ֽ��ֽ�+���֡�����
	private Integer point;					//����
	
	public ProductVo(){}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryPath() {
		return categoryPath;
	}
	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}
	public Long getAttributeId1() {
		return attributeId1;
	}
	public void setAttributeId1(Long attributeId1) {
		this.attributeId1 = attributeId1;
	}
	public Long getAttributeId2() {
		return attributeId2;
	}
	public void setAttributeId2(Long attributeId2) {
		this.attributeId2 = attributeId2;
	}
	public Integer getSkuCount() {
		return skuCount;
	}
	public void setSkuCount(Integer skuCount) {
		this.skuCount = skuCount;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Long getRelatedId() {
		return relatedId;
	}
	public void setRelatedId(Long relatedId) {
		this.relatedId = relatedId;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getSevenDayRefund() {
		return sevenDayRefund;
	}
	public void setSevenDayRefund(String sevenDayRefund) {
		this.sevenDayRefund = sevenDayRefund;
	}
	public String getPackageList() {
		return packageList;
	}
	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}
	public String getAfterSaleService() {
		return afterSaleService;
	}
	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}
	//--------------------------------------
	public Map<String, String> gainParameter(){
		return JsonUtils.readJsonToMap(parameter);
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Long getShippingTemplateId() {
		return shippingTemplateId;
	}
	public void setShippingTemplateId(Long shippingTemplateId) {
		this.shippingTemplateId = shippingTemplateId;
	}
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getElecard() {
		return elecard;
	}
	public void setElecard(String elecard) {
		this.elecard = elecard;
	}
	public Long getBoughtMovieId() {
		return boughtMovieId;
	}
	public void setBoughtMovieId(Long boughtMovieId) {
		this.boughtMovieId = boughtMovieId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getSold() {
		return sold;
	}
	public void setSold(Integer sold) {
		this.sold = sold;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getCrowd() {
		return crowd;
	}
	public void setCrowd(String crowd) {
		this.crowd = crowd;
	}
	public Integer getLimitBuyQty() {
		return limitBuyQty;
	}
	public void setLimitBuyQty(Integer limitBuyQty) {
		this.limitBuyQty = limitBuyQty;
	}
	public void addSold(int qty){
		this.sold = this.sold + qty;
	}
	public void addStock(int qty){
		this.stock = this.stock + qty;
	}
	public Long getShipperId() {
		return shipperId;
	}
	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}
	public String getSaleModel() {
		return saleModel;
	}
	public void setSaleModel(String saleModel) {
		this.saleModel = saleModel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getOnSaleTime() {
		return onSaleTime;
	}
	public void setOnSaleTime(Timestamp onSaleTime) {
		this.onSaleTime = onSaleTime;
	}
	public Timestamp getOffSaleTime() {
		return offSaleTime;
	}
	public void setOffSaleTime(Timestamp offSaleTime) {
		this.offSaleTime = offSaleTime;
	}
	public String getSellType() {
		return sellType;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	public boolean canUseCard(){
		return StringUtils.contains(this.elecard, "D");
	}
}
