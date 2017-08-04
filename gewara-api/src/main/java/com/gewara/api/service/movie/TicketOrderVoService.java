package com.gewara.api.service.movie;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.movie.TakeInfoVo;
import com.gewara.api.vo.order.GewaOrderVo;

public interface TicketOrderVoService {
	/**
	 * ���ݳ��β�ѯ����
	 * 
	 * @param mpid
	 * @param timeType
	 *            //ֵΪaddtimeʱ��ʾ�µ�ʱ��
	 * @return
	 */
	<T extends GewaOrderVo> ResultCode<List<T>> getTicketOrderListByMpid(Long mpid, Timestamp startTime,
			Timestamp endTime, String timeType, String openType);

	/**
	 * ���ݶ����Ż�ȡ��ӰƱ����������
	 * 
	 * @param tradeno
	 * @deprecated ��gworder�ӿ�
	 * @see com.gewara.api.gworder.service.GwOrderService.getOrderByTradeNo
	 * @return
	 */
	@Deprecated
	<T extends GewaOrderVo> ResultCode<T> getTicketOrderByTradeno(String tradeno);

	/**
	 * ��ѯ�Զ���Ʊֽ��Ϣ
	 * 
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<TakeInfoVo>> getTakeInfoList(String tradeNo);
}
