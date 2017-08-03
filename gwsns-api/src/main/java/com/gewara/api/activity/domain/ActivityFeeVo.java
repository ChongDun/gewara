package com.gewara.api.activity.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.activity.ApiObject;

/**
 * �����
 * @author leo
 *
 */
public class ActivityFeeVo extends ApiObject{

	private static final long serialVersionUID = 2892910571679692378L;
	private Long id;
	private Long activityId;	//�id
	private Long goodsId;		//��Ʒid��ֻ��ͨ����֤�û��������շѻ�Ż��и���Ϣ������Ա���ͨ�������
	private String feeName;		//�շ�����
	private Integer price;		//�۸�
	private Timestamp beginTime;//���ۿ�ʼʱ��
	private Timestamp endTime;	//���۽�ֹʱ��
	private Integer quantity;	//Ʊ������
	private Integer orderQuantity;//�������� >= quantity
	private Integer validQuantity;//��Ʊ����
	private String isLimited;	//�Ƿ��޹���Y��N
	private Integer limitCount;	//�޹�����
	private Integer limitOrderCount;	//�޹���������
	private String islimitedOrder;//�Ƿ����ƶ�������
	private String status;		//״̬���Ƿ�ɾ�� Y_NEW,N_DELETE
	private Timestamp addTime;	//��¼���ʱ��
	private Timestamp updateTime;//��¼�޸�ʱ��
	private String isAlgorithm;
	private String algorithm;
	private String allowaddnum;
	private Integer maxbuy;
	private Integer virtualcount = 0;//������
	

	public ActivityFeeVo(){
		
	}
	
	@Override
	public Serializable realId() {
		return this.id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Timestamp getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Integer getValidQuantity() {
		return validQuantity;
	}

	public void setValidQuantity(Integer validQuantity) {
		this.validQuantity = validQuantity;
	}

	public String getIsLimited() {
		return isLimited;
	}

	public void setIsLimited(String isLimited) {
		this.isLimited = isLimited;
	}

	public Integer getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
	public Integer getLimitOrderCount() {
		return limitOrderCount;
	}

	public void setLimitOrderCount(Integer limitOrderCount) {
		this.limitOrderCount = limitOrderCount;
	}

	public boolean isJoining(){
		if (beginTime == null ) {
			return false;
		}
		Timestamp cur=new Timestamp(System.currentTimeMillis());
		return this.beginTime.after(cur);
	}

	public String getIslimitedOrder() {
		return islimitedOrder;
	}

	public void setIslimitedOrder(String islimitedOrder) {
		this.islimitedOrder = islimitedOrder;
	}

	public String getIsAlgorithm() {
		return isAlgorithm;
	}

	public void setIsAlgorithm(String isAlgorithm) {
		this.isAlgorithm = isAlgorithm;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getAllowaddnum() {
		return allowaddnum;
	}

	public void setAllowaddnum(String allowaddnum) {
		this.allowaddnum = allowaddnum;
	}
	public Integer getMaxbuy() {
		return maxbuy;
	}

	public void setMaxbuy(Integer maxbuy) {
		this.maxbuy = maxbuy;
	}

	public Integer getVirtualcount() {
		return virtualcount;
	}

	public void setVirtualcount(Integer virtualcount) {
		this.virtualcount = virtualcount;
	}
	
}
