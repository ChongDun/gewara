package com.gewara.api.terminal.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.terminal.vo.CustomPaperVo;
import com.gewara.api.terminal.vo.DpiLayoutVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;

public interface TerminalOrderVoService {
	/**
	 * ��ѯ��Ӱ����
	 * @param tradeno
	 * @return
	 */
	ResultCode<GewaOrderVo> getTicketOrderByTradeno(String tradeno);
	/**
	 * ��ѯ��Ӱ��Ʒ����
	 * @param tradeno
	 * @return
	 */
	ResultCode<GewaOrderVo> getGoodsOrderByTradeno(String tradeno);
	/**
	 * ��ѯ�ݳ�����,���ڿ���ѡ�������Σ����Է���һ�����󼯺�
	 * @param tradeno
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getDramaOrderByTradeno(String tradeno);
	/**
	 * ��ȡ���˿�Ķ�����
	 * @param goodsid
	 * @param relatedid
	 * @param addtime
	 * @return
	 */
	ResultCode<List<String>> getRefundOrderList(Timestamp refundtime);
	/**
	 * ��Ʊ�߷�ĳ���ʱ�� ������Ӱ���ݳ�
	 * @param placeid
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	ResultCode<List<Map>> getPeakPeriodByTag(Long placeid, Timestamp starttime, Timestamp endtime, String tag);
	
	/**
	 * ��ѯ�ݳ����εĴ�ӡ����
	 * @param cinemaid
	 * @param playtime
	 * @param addtime
	 * @return
	 */
	ResultCode<DpiLayoutVo> getDpiLayoutVo(Long dpid);
	/**
	 * Ʊ��ʵ����Ҫ��ӡ����Ϣ
	 * @param tradeno
	 * @return
	 */
	ResultCode<String> getDramaOrderPrintInfo(String tradeno);
	ResultCode<List<CustomPaperVo>> customPaperVoList(String tag, Date startdate, Date enddate);
	/**
	 * ��ȡ���н��׳ɹ��Ķ����ţ��������ֶ������ͣ�����ɾ�������ķ���
	 * @param addtime
	 * @return
	 */
	ResultCode<List<String>> getSuccessTradenoList(Timestamp addtime);
	/**
	 * ���ݶ����ţ���ѯ�Զ���Ʊֽ
	 * @return
	 */
	ResultCode<CustomPaperVo> getCustomPaperVoByTradeNo(String tradeno);
	/**
	 * ����ʱ�����ȡ���ж���
	 * @param addtimeFrom
	 * @param addtimeTo
	 * @return
	 */
	ResultCode<List<String>> getSuccessTradenoList(Timestamp addtimeFrom, Timestamp addtimeTo);
}
