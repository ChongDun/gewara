package com.gewara.mall.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.cons.OrderConstant;
import com.gewara.api.vo.BaseVo;
import com.gewara.mall.constant.MallOrderConstant;


public class MallOrderVo extends BaseVo{

	/**
	 * ����
	 */
	private static final long serialVersionUID = -551269625866654797L;
	private Long id;
	private String mobile;							//��Ա�绰
	private Integer totalFee;						//�����ܽ��
	private Integer totalCost;						//�����ɱ��ܽ��	
	private Integer usedPoint;						//ʹ�õĻ�������
	private Integer shippingFee;					//���˷���
	private Long memberId;							//��Աid
	private Long partnerId;							//��Դ
	private String memberRemark;					//�û���ע
	private String remark;							//ϵͳ��ע
	private String description;						//��������
	private Timestamp validTime;					//��Ч��
	
	private String status;							//mall����״̬,�ȶ��������Ķ���״̬��ϸ��
	private String category;						//�����������֣�product,presell_deposit,presell_retainage
	private Long parentMallOrderId;					//��������������ID,�磺Ԥ�۵�β������Ķ���
	private String otherInfo;						//������Ϣ json��ʽ
	//�����ǹ���������������
	/** ����id��mallϵͳ���������ݸ��Ϻ�ϵͳrelatedid */
	private Long shOrderId;							//�Ϻ�ϵͳ����id
	private String shStatus;						//�Ϻ�ϵͳ����״̬
	private String tradeNo;							//�Ϻ�������ˮ��
	
	private String expressStatus;					//����״̬(��ѯ������ʹ��)
	public MallOrderVo() {
		
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getDue(){
		return totalFee+shippingFee;
	}
	public Long getShOrderId() {
		return shOrderId;
	}
	public void setShOrderId(Long shOrderId) {
		this.shOrderId = shOrderId;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(Integer shippingFee) {
		this.shippingFee = shippingFee;
	}
	
	public String getMemberRemark() {
		return memberRemark;
	}
	public void setMemberRemark(String memberRemark) {
		this.memberRemark = memberRemark;
	}
	public Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
	public String getShStatus() {
		return shStatus;
	}
	public void setShStatus(String shStatus) {
		this.shStatus = shStatus;
	}
	public Long getParentMallOrderId() {
		return parentMallOrderId;
	}
	public void setParentMallOrderId(Long parentMallOrderId) {
		this.parentMallOrderId = parentMallOrderId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Timestamp getValidTime() {
		return validTime;
	}
	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
	}
	public boolean isTimeout(){
		return validTime!=null && validTime.before(new Timestamp(System.currentTimeMillis()));
	}
	public boolean isNew(){
		return StringUtils.startsWith(shStatus, "new") && !isTimeout();
	}
	public boolean isNeedPaidRetainage(){
		return StringUtils.startsWith(status, MallOrderConstant.MALL_STATUS_PAID_DEPOSIT);
	}
	public Integer getUsedPoint() {
		return usedPoint;
	}
	public void setUsedPoint(Integer usedPoint) {
		this.usedPoint = usedPoint;
	}
	//�Ƿ��Ѿ�����
	public boolean isPaid(){
		return StringUtils.startsWith(shStatus, "paid");
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExpressStatus() {
		return expressStatus;
	}
	public void setExpressStatus(String expressStatus) {
		this.expressStatus = expressStatus;
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
	
	
	public String getFullStatus(){
		if(status.startsWith(OrderConstant.STATUS_NEW) && isTimeout()) {
			return OrderConstant.STATUS_TIMEOUT;
		}
		return status;
	}
	public String getStatusText(){
		if(StringUtils.equals(shStatus, MallOrderConstant.STATUS_PAID_SUCCESS)){
			if(!StringUtils.equals(expressStatus, MallOrderConstant.EXP_STATUS_INIT)){
				return MallOrderConstant.expStatusMap.get(expressStatus);
			}
			if(StringUtils.equals(status, MallOrderConstant.MALL_STATUS_PAID_DEPOSIT)){
				return MallOrderConstant.orderStatusMap.get(status);
			}else if(StringUtils.equals(status, MallOrderConstant.MALL_STATUS_PAID_RETAINAGE)){
				return MallOrderConstant.orderStatusMap.get(status);
			}
		}
		String fullStatus = getFullStatus();
		return MallOrderConstant.orderStatusMap.get(fullStatus);
	}
}
