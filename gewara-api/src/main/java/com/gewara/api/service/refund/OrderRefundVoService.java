package com.gewara.api.service.refund;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.cmd.order.SearchRefundCommandVo;
import com.gewara.api.vo.pay.OrderRefundVo;

public interface OrderRefundVoService {
	
	/**
	 * ��ѯ�����˿��б�
	 * @param command
	 * @param order
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<OrderRefundVo>> getOrderRefundList(SearchRefundCommandVo command, String order, int from, int maxnum);
	
	/**
	 * ��ѯ�����˿�����
	 * @param command
	 * @return
	 */
	ResultCode<Integer> getOrderRefundCount(SearchRefundCommandVo command);
	
	/**
	 * ���ݶ����Ų�ѯ�����˿�
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderRefundVo> getOrderRefundByTradeNo(String tradeNo);
	
	ResultCode<List<String>> getRefundTemplateList2();
}
