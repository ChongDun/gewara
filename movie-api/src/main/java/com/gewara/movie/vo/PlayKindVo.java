package com.gewara.movie.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class PlayKindVo extends BaseVo {
	private static final long serialVersionUID = -5154633937499593360L;
	private Long id; //Ψһ��ʾ
	private String kindName; //��ӳ�������
	private Integer orderNumber; //�������
	private Timestamp addtime; //���ʱ��
	private Timestamp updatetime;	//�޸�ʱ�� 
	private Integer status; //�Ƿ�ɾ�� 1=ɾ�� 0=δɾ��
	private String isCur; //�Ƿ��ǵ��� y=��  n=��
	private String belongToKind;//�����ĸ���� ����ҵor�¾��� ���ڵ�ֵ�� newBusiness newClassics;
	private String belongToKindPattern;//�����¾���ʲôģʽ,���� ��Ƭģʽ(singular)��չӳģʽ()
	private String isRecommend;//�Ƿ��Ƽ�y=��  n=��
	public String getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
	public PlayKindVo(){}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIsCur() {
		return isCur;
	}

	public void setIsCur(String isCur) {
		this.isCur = isCur;
	}

	@Override
	public Serializable realId() {
		return id;
	}
	public String getBelongToKind() {
		return belongToKind;
	}
	public void setBelongToKind(String belongToKind) {
		this.belongToKind = belongToKind;
	}
	public String getBelongToKindPattern() {
		return belongToKindPattern;
	}
	public void setBelongToKindPattern(String belongToKindPattern) {
		this.belongToKindPattern = belongToKindPattern;
	}
	

}
