package com.gewara.api.pay.service;

import com.gewara.api.pay.request.abc.PointPayRequest;
import com.gewara.api.pay.response.abc.PointPayResponse;
import com.gewara.api.vo.ResultCode;


/**
 * ũҵ������֤֧��������ӿ�
 * @author dengyz
 *
 */
public interface AbcPointPayFastApiService {
	
	/**
	 * ��������
	 * @param request
	 * @return
	 */
	ResultCode<PointPayResponse> pointPay(PointPayRequest request);
}
