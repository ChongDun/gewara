package com.gewara.api.vo.order;

import java.io.Serializable;

import com.gewara.api.vo.goods.GoodsVo;

public class CheckAddOrderGoodsGiftRes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1237001182538322948L;

	private Integer quantity;//��Ʒ����
	
	private boolean isGiftExist;//��Ʒ�Ƿ���ڣ�true:���ڣ�false:������
	
	private GoodsVo goods;//��Ʒ
	
	public CheckAddOrderGoodsGiftRes(){}
	

	public CheckAddOrderGoodsGiftRes(Integer quantity, boolean isGiftExist, GoodsVo goods){
		this.quantity = quantity;
		this.isGiftExist = isGiftExist;
		this.goods = goods;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public GoodsVo getGoods() {
		return goods;
	}

	public void setGoods(GoodsVo goods) {
		this.goods = goods;
	}


	public boolean isGiftExist() {
		return isGiftExist;
	}


	public void setGiftExist(boolean isGiftExist) {
		this.isGiftExist = isGiftExist;
	}
}
