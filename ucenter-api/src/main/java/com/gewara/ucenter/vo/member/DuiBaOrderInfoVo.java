package com.gewara.ucenter.vo.member;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

@Deprecated
public class DuiBaOrderInfoVo extends BaseVo{
	private static final long serialVersionUID = 5077150442927561935L;
	private String id;
	private String memberId;
	private String credits;		//���ζһ��û������ĵĻ�����
	private String description;	//���λ������ĵ�����
	private String orderNum;	//�Ұɶ�����(���¼�����ݿ���)
	private String type;		//�һ�����:Alipay(֧����),QB(Q��),Coupon(�Ż�ȯ),Object(ʵ��),Phonebill(����),PhoneFlow(����),Virtual(������Ʒ),Turntable(��ת��),SingleLottery(��Ʒ�齱) �������Ͳ����ִ�Сд
	private String facePrice;	//�һ���Ʒ���г���ֵ����λ�Ƿ�
	private String actualPrice;	//�˴ζһ�ʵ�ʿ۳��������˻����ã���λΪ��
	private String ip;			//�û�ip
	private String waitAudit;	//�Ƿ���Ҫ���
	private String params;		//�����������ͬ�����ͣ����ز�ͬ�����ݣ��м���Ӣ��ð�ŷָ���(֧�������ʹ����ģ�����utf-8���н���)ʵ����Ʒ�������ջ���Ϣ(����:�ֻ���:ʡ��:����:����:��ϸ��ַ)֧�����������˺���Ϣ(֧�����˺�:ʵ��)���ѣ������ֻ���QB������QQ��
	private String pointId;
	private String result;		//�˴ζһ��Ƿ�ɹ���fail��ʧ�ܣ�success���ɹ���processing�������У�
	private Integer notifyCount;//֪ͨ����
	private Timestamp addtime;	//���ʱ��
	@Override
	public Serializable realId() {		
		return id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFacePrice() {
		return facePrice;
	}
	public void setFacePrice(String facePrice) {
		this.facePrice = facePrice;
	}
	public String getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(String actualPrice) {
		this.actualPrice = actualPrice;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getWaitAudit() {
		return waitAudit;
	}
	public void setWaitAudit(String waitAudit) {
		this.waitAudit = waitAudit;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getPointId() {
		return pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Integer getNotifyCount() {
		return notifyCount;
	}
	public void setNotifyCount(Integer notifyCount) {
		this.notifyCount = notifyCount;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

}
