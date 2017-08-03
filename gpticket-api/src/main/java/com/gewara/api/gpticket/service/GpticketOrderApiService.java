package com.gewara.api.gpticket.service;

import com.gewara.api.gpticket.vo.command.OrderCommandVo;
import com.gewara.api.gpticket.vo.command.OrderIdVo;
import com.gewara.api.gpticket.vo.ticket.DramaRemoteOrderVo;
import com.gewara.api.vo.ResultCode;

public interface GpticketOrderApiService {
	/**
	 * ��ȡ����������λ
	 * @param usertype
	 * @param areaseqno
	 * @return	1:1,1:2(��λ��)
	 */
	ResultCode<String> getLockSeat(final String areaseqno);
	ResultCode<String> getLockSeatByUsertype(final String usertype, final String areaseqno);
	
	/**
	 * ��ȡ����δ�����۸�����
	 * @param usertype
	 * @param areaseqno
	 * @return 1001:200,1002:200  (�۸���:δ������)
	 */
	ResultCode<String> getUnLockPrice(final String areaseqno);
	ResultCode<String> getUnLockPriceByUsertype(final String usertype, final String areaseqno);

	/**
	 * ��������
	 * @param orderCommand
	 * @return
	 */
	ResultCode<DramaRemoteOrderVo> createOrder(final OrderCommandVo orderCommand);
	
	/**
	 * �����۸�
	 * @param orderCommand
	 * @return
	 */
	ResultCode<DramaRemoteOrderVo> lockPrice(final OrderCommandVo orderCommand);
	
	/**
	 * ������λ
	 * @param orderCommand
	 * @return
	 */
	ResultCode<DramaRemoteOrderVo> lockSeat(final OrderCommandVo orderCommand);
	
	/**
	 * ȷ�϶�����Ʊ
	 * @param orderCommand
	 * @return
	 */
	ResultCode<DramaRemoteOrderVo> fixOrder(final OrderCommandVo orderCommand);
	
	/**
	 * ��������
	 * @param orderIdVo
	 * @return
	 */
	ResultCode<DramaRemoteOrderVo> unLockOrder(final OrderIdVo orderIdVo);
	
	ResultCode<DramaRemoteOrderVo> backOrder(final OrderIdVo orderIdVo);
	
	ResultCode<DramaRemoteOrderVo> qryOrder(final OrderIdVo orderIdVo);
	
	ResultCode<DramaRemoteOrderVo> checkOrder(final OrderIdVo orderIdVo);
	
	/**
	 * ��ȡ����Ʊ��
	 * @param seqno
	 * @return
	 */
	ResultCode<String> qryTicketFace(final String seqno);

	/**
	 * ��ȡ������Ʊ��Ϣ
	 * @param orderIdVo
	 * @return
	 */
	ResultCode<String> qryOrderInfo(final OrderIdVo orderIdVo);

	/**
	 * �޸Ķ������Ի�����
	 * @param orderIdVo
	 * @return
	 */
	ResultCode updateOrderGreetings(final OrderIdVo orderIdVo);
}
