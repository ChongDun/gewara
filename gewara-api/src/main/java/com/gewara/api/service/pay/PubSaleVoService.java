package com.gewara.api.service.pay;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.pay.PubSaleVo;


public interface PubSaleVoService {

	/**
	 * ��ȡ��������
	 * @param id
	 * @return
	 */
	ResultCode<PubSaleVo> getPubSale(Long id);
}
