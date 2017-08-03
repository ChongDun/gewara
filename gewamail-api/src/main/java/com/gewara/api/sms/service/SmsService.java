package com.gewara.api.sms.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.sms.request.MTRequest;
import com.gewara.api.sms.response.BatchSmsStatusResponse;
import com.gewara.api.sms.response.MTResponse;
import com.gewara.api.vo.ResultCode;

/**
 * ���Žӿڷ���
 * 
 * @author leo.li
 * Modify Time Jan 4, 2013 6:07:31 PM
 */
public interface SmsService {
	
	/**
	 * ���ŷ���ͳһ�ӿڡ�
	 * ֧�ֱ����ظ����͹��ܣ�֧�ֶ�ʱ���͡�
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Jan 4, 2013 6:07:46 PM
     * @see #sendSMS2
	 */
	@Deprecated
	public MTResponse sendSMS(MTRequest request);
	
	/**
	 * ���ŷ���ͳһ�ӿڡ�
	 * ֧�ֱ����ظ����͹��ܣ�֧�ֶ�ʱ���͡�
	 * 
	 * @param request
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Jan 4, 2013 6:07:46 PM
	 */
	public ResultCode sendSMS2(MTRequest request);
	
	/**
	 * ��ѯmongo�ֻ������ζ��ŷ���״̬
	 * @param batchId mongo�ֻ�������ID
	 * @return
     * @see #queryBatchSmsStatus2
	 */
	@Deprecated
	public BatchSmsStatusResponse queryBatchSmsStatus(String batchId);
	
	/**
	 * ��ѯmongo�ֻ������ζ��ŷ���״̬
	 * @param batchId mongo�ֻ�������ID
	 * @return
	 */
	public ResultCode<BatchSmsStatusResponse> queryBatchSmsStatus2(String batchId);
	
	/**
	 * �����Ϻ�ϵͳ���췢�͵Ķ��ż�¼��״̬
	 * @param smsIdList ����ID���������ܳ���100; ���ŷ��ͽӿڴ���ֵ��
	 * @return  Map�� key :  smsId, value: ״̬
	 * @author leo
	 * @addTime 2015��11��27������6:14:30
	 */
	public ResultCode<Map<String, String>> findYesterdayStatus4Shanghai(List<String> smsIdList);
}
