package com.gewara.api.service.goods;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.goods.GoodsStockDataVo;

public interface GoodsUntransVoService {
	/**
	 * ������Ŀ��������Ʒ���Ͳ�ѯ��ĿID����
	 * @param itemtype
	 * @param smalltype
	 * @return
	 */
	ResultCode<List<Long>> getItemIdListByItemtype(String itemtype, String smalltype);
	/**
	 * ������ƷID�����Ʒ�����Ϣ
	 * @param goodsId
	 * @return
	 */
	ResultCode<GoodsStockDataVo> getGoodsStockDataVoByGoodsId(Long goodsId);
}
