package com.gewara.api.pay.service;

import com.gewara.api.pay.request.abc.MoneyAndPointPayRequest;
import com.gewara.api.pay.request.abc.MoneyPayRequest;
import com.gewara.api.pay.request.abc.PointPayRequest;
import com.gewara.api.pay.request.abc.QueryPointRequest;
import com.gewara.api.pay.request.abc.SendSmsRequest;
import com.gewara.api.pay.response.abc.MoneyAndPointPayResponse;
import com.gewara.api.pay.response.abc.MoneyPayResponse;
import com.gewara.api.pay.response.abc.PointPayResponse;
import com.gewara.api.pay.response.abc.QueryPointResponse;
import com.gewara.api.pay.response.abc.SendSmsResponse;
import com.gewara.api.vo.ResultCode;


/**
 * ũҵ������֤֧��������ӿ�
 * @author dengyz
 *
 */
public interface AbcWapPayFastApiService {

	/**
	 * ���ֲ�ѯ
	 * @param request
	 * @return
	 */
	ResultCode<QueryPointResponse> queryPoint(QueryPointRequest request);
	
	/**
	 * ��������
	 * @param request
	 * @return
	 */
	ResultCode<PointPayResponse> pointPay(PointPayRequest request);
	
	/**
	 * ֧��������
	 * @param request
	 * @return
	 */
	ResultCode<SendSmsResponse> sendSms(SendSmsRequest request);
	
	/**
	 * �������
	 * @param request
	 * @return
	 */
	ResultCode<MoneyPayResponse> moneyPay(MoneyPayRequest request);
	
	/**
	 * ���ֿ��֧��
	 * �˽ӿ��ǰѻ���֧��+���֧�������ӿںϲ�Ϊһ
	 * �������Ҫͬʱ�������ӿڵģ������pointPay����moneyPay�ӿڡ�
	 * @param params
	 * @return
	 */
	ResultCode<MoneyAndPointPayResponse> moneyAndPointPay(MoneyAndPointPayRequest request);
}
