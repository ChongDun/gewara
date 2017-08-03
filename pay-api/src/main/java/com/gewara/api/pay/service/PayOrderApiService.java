package com.gewara.api.pay.service;

import com.gewara.api.pay.request.GetPayOrderRequest;
import com.gewara.api.pay.request.GetPayRecordByTradeNoRequest;
import com.gewara.api.pay.request.GetPayRecordRequest;
import com.gewara.api.pay.request.GetPayRepeatTradeRequest;
import com.gewara.api.pay.response.GetPayOrderResponse;
import com.gewara.api.pay.response.GetPayRecordResponse;
import com.gewara.api.pay.response.GetPayRepeatTradeResponse;
import com.gewara.api.vo.ResultCode;

public interface PayOrderApiService {

	/**
	 * ͨ��tradeNo��ȡ֧��������Ϣ
	 * @param request
	 * @return
	 */
	ResultCode<GetPayOrderResponse> get(GetPayOrderRequest request);
	
	/**
	 * ͨ��tradeNo��ȡ������ˮ��Ϣ��Ϣ
	 * @param request
	 * @return
	 */
	ResultCode<GetPayRecordResponse> getPayRecordByTradeNo(GetPayRecordByTradeNoRequest request);
	
	/**
	 * ��ȡһ��ʱ���ڵģ��ظ�������Ӧ��PayRecord
	 * @return
	 */
	ResultCode<GetPayRecordResponse> getPayRecord(GetPayRecordRequest request);
	
	/**
	 * ��ȡһ��ʱ���ڣ��ظ�֧��������ˮ��Ϣ
	 * ע�⣺1����ʼʱ���������������ܳ���10�죻 2��list�����¼�����Ϊ1000���ܼ�¼����¼��total��
	 * @param request
	 * @return
	 */
	ResultCode<GetPayRepeatTradeResponse> getPayRepeatTrade(GetPayRepeatTradeRequest request);
	
	/**
	 * ��ȡһ��ʱ����,ָ��gatewayCode��merchantCode��Ӧ��������ˮ��Ϣ��Ϣ
	 * @return
	 */
	ResultCode<GetPayRecordResponse> queryPayRecord(GetPayRecordRequest request);
}
