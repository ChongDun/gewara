package com.gewara.api.service.order;

import com.gewara.api.vo.ResultCode;

public interface TicketRollCallVoService {
	/**
	 * �ж��Ƿ��ǻ�ţ�û�
	 * @param memberId
	 * @param mobile
	 * @return
	 */
	ResultCode<Boolean> isTicketRollCallMember(Long memberId, String mobile);
}
