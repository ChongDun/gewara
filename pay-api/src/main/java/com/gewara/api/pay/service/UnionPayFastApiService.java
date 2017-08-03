package com.gewara.api.pay.service;

import com.gewara.api.pay.request.ActivationQueryRequest;
import com.gewara.api.pay.request.GetBindParamsRequest;
import com.gewara.api.pay.request.SendPayRequest;
import com.gewara.api.pay.request.SendSmsRequest;
import com.gewara.api.pay.response.ActivationQueryResponse;
import com.gewara.api.pay.response.GetBindParamsResponse;
import com.gewara.api.pay.response.SendPayResponse;
import com.gewara.api.pay.response.SendSmsResponse;
import com.gewara.api.vo.ResultCode;

/**
 * ������֤֧��2.0������ӿ�
 * 
 * @author leo.li
 * Modify Time Nov 6, 2013 2:43:00 PM
 */
public interface UnionPayFastApiService {

	/**
	 * ������֤֧��2.0�����Ͷ�����֤�����
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Nov 6, 2013 2:42:24 PM
	 */
	ResultCode<SendSmsResponse> sendSms(SendSmsRequest request);
	
	/**
	 * ����ͨ״̬��ѯ
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Nov 6, 2013 3:26:55 PM
	 */
	ResultCode<ActivationQueryResponse> activationQuery(ActivationQueryRequest request);
	
	/**
	 * ��ȡ���������
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Nov 6, 2013 4:20:34 PM
	 */
	ResultCode<GetBindParamsResponse> getBindParams(GetBindParamsRequest request);
	
	/**
	 * ����֧������
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Nov 6, 2013 4:20:57 PM
	 */
	ResultCode<SendPayResponse> sendPay(SendPayRequest request);
	
	
	
}
