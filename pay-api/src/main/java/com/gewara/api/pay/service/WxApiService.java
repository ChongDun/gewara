package com.gewara.api.pay.service;

import com.gewara.api.pay.request.wx.CheckfirstbindByTradeNoRequest;
import com.gewara.api.pay.response.wx.CheckfirstbindByTradeNoResponse;
import com.gewara.api.vo.ResultCode;

/**
 * ΢�ŷ���ӿ�
 * @author leo
 *
 */
public interface WxApiService {

	/**
	 * ���ݶ����ż���Ƿ��״ΰ�����øýӿڽ��������أ������jms�첽֪ͨ
	 * 
	 * jms��Ϣ��������wxCheckfirstbindQueue
	 * ���ز�����
	 * 	tradeNo : ������
	 * 	retcode ��ִ�н����0���ɹ�����0ʱ����Ӧ������
	 * 	isFirstBind ���Ƿ���0��Ϊ�״ΰ󶨣�1�����״ΰ�
	 *  retmsg ��retcode��0ʱ�Ĵ�����ʾ
	 * 
	 * @param request
	 * @return
	 * @author leo
	 * @addTime 2014��6��4������4:24:51
	 */
	ResultCode<CheckfirstbindByTradeNoResponse> checkfirstbindByTradeNo(CheckfirstbindByTradeNoRequest request);
	
}
