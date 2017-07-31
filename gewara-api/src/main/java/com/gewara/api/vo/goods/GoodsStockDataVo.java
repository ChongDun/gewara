package com.gewara.api.vo.goods;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class GoodsStockDataVo extends BaseVo {
	private static final long serialVersionUID = -5396346712368888868L;
	
	private Long goodsId;					//��ƷID
	private int sellRatio;					//��Ʒ-���۱���  
	private int allGoodsStock;				//��Ʒ-�ܿ�� (����Ŀ���п��������������)
	private int remainderGoodsStock;		//��Ʒ-ʣ����
	private int sellCount; 					//���۶���
	
	public GoodsStockDataVo(){}

	@Override
	public Serializable realId() {
		return goodsId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public int getSellRatio() {
		return sellRatio;
	}

	public void setSellRatio(int sellRatio) {
		this.sellRatio = sellRatio;
	}

	public int getAllGoodsStock() {
		return allGoodsStock;
	}

	public void setAllGoodsStock(int allGoodsStock) {
		this.allGoodsStock = allGoodsStock;
	}

	public int getRemainderGoodsStock() {
		return remainderGoodsStock;
	}

	public void setRemainderGoodsStock(int remainderGoodsStock) {
		this.remainderGoodsStock = remainderGoodsStock;
	}

	public int getSellCount() {
		return sellCount;
	}

	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	
}
