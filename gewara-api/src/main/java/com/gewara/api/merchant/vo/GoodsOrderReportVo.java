package com.gewara.api.merchant.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class GoodsOrderReportVo extends BaseVo {
	private static final long serialVersionUID = -103046049017884416L;
	private String tradeNo;    //������
	private String goodsname; //�ײ�����
	private Timestamp addtime;		//�û��µ�ʱ��
	private Timestamp taketime;    //�û�ȡƱʱ��
	private int costprice;//����
	private int quantity; //Ʊ�� ������
	private int totalcost;//���
	
	public GoodsOrderReportVo(){}
	
	public GoodsOrderReportVo(String tradeNo,String goodsname,Timestamp addtime,int costprice,int quantity){
		this.tradeNo = tradeNo;
		this.goodsname = goodsname;
		this.addtime = addtime;
		this.quantity = quantity;
		this.costprice = costprice;
		this.totalcost = this.quantity * this.costprice;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Timestamp getTaketime() {
		return taketime;
	}

	public void setTaketime(Timestamp taketime) {
		this.taketime = taketime;
	}

	public int getCostprice() {
		return costprice;
	}

	public void setCostprice(int costprice) {
		this.costprice = costprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}

	@Override
	public Serializable realId() {
		return tradeNo;
	}

}
