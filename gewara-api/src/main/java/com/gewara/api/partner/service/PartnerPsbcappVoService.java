package com.gewara.api.partner.service;

import com.gewara.api.vo.ResultCode;

public interface PartnerPsbcappVoService {
	/**
	 * ��֤�ʴ����ж���
	 * 
	 * @param userid   �����̶����û�Ψһ��ʶ
	 * @param seatcount ��λ��
	 * @return
	 */
	ResultCode<Boolean> validPsbcappOrder(String userid, Integer seatcount);
}
