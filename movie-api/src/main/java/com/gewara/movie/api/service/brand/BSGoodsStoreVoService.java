package com.gewara.movie.api.service.brand;


import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.brand.BSGoodsStoreVo;

public interface BSGoodsStoreVoService {
	
	/**
	 * ���桰��Ʒ-�ŵꡱ��������
	 * @return
	 */
	ResultCode save(List<BSGoodsStoreVo> list);
	
	/**
	 * ��ȡ����Ʒ-�ŵꡱ��������
	 * @return
	 */
	ResultCode<List<BSGoodsStoreVo>> getBSGoodsStoreListByGoodsId(Long goodsId);
	
}
