package com.gewara.api.service.order;

import com.gewara.api.vo.ResultCode;

public interface TicketPassVoService {
	/**
	 * ��ȡȡƱ��������ģ��
	 * @return
	 */
	ResultCode<String> getCheckpassTemplate(String tradeNo);
}
