package com.gewara.api.gpticket.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface GptbsApiService {
	/**
	 * ��ȡ������Ϣ�������޿���(���еĶ���)
	 * @param tOrderNo
	 * @param entry
	 * @return
	 */
	ResultCode<Map> getOrderPrintInfo2(String tOrderNo);
	
	/**
	 * ���ݸ���ʱ��������ȡ������Ϣ�������޿���(���еĶ���)
	 * @param updatetime
	 * @param endtime
	 * @param entry
	 * @return
	 */
	ResultCode<List<Map>> getOrderPrintInfo(Timestamp updatetime, Timestamp endtime);
	/**
	 * ����Ʊ�棬�����޿���(���еĳ���Ʊ��)
	 * @param scheduleId
	 * @return
	 */
	ResultCode<String> getTicketFaceExp(String scheduleId);
	
	/**
	 * ͨ������ʱ���ȡ������Ϣ
	 * @param updatetime
	 * @return
	 */
	ResultCode<List<Map>> getStadiumListByUpdate(Timestamp updatetime);
	
	/**
	 * ֪ͨ����ȡ״̬
	 * @param requestData
	 * @return
	 */
	ResultCode updateTakeTicketStatus(String requestData);
}
