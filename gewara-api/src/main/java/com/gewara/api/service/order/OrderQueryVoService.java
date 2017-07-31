package com.gewara.api.service.order;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;
import com.gewara.api.vo.cmd.order.OrderParamsVo;
import com.gewara.api.vo.cmd.order.ParamsVo;
import com.gewara.api.vo.cmd.order.SearchOrderCommandVo;
import com.gewara.api.vo.order.BuyItemVo;
import com.gewara.api.vo.order.GewaOrderMapVo;
import com.gewara.api.vo.order.GewaOrderVo;
import com.gewara.api.vo.pay.OrderAddressVo;
import com.gewara.api.vo.pay.OrderExtraVo;
import com.gewara.api.vo.pay.OrderNoteVo;

public interface OrderQueryVoService {
	/**
	 * ��ѯӰƱ����
	 * @param clazz
	 * @param command
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getTicketOrderList(ParamsVo param);
	
	/**
	 * ��ѯ��ӰƱ������
	 * @param soc
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> searchTicketOrderList(SearchOrderCommandVo soc);

	/**
	 * ��ȡ������ַ�б�
	 * @param tradeNoList
	 * @return
	 */
	ResultCode<List<OrderAddressVo>> getOrderAddressVoList(List<String> tradeNoList);
	
	/**
	 * ��ȡ�����б�
	 * @param orderId
	 * @return
	 */
	ResultCode<List<BuyItemVo>> getItemList(Long orderId);

	/**
	 * ��ȡ������Ϣ�б�
	 * @param orderId
	 * @return
	 */
	ResultCode<List<OrderNoteVo>> getNoteList(Long orderId);
	
	/**
	 * ��ѯ��������
	 * @param command
	 * @return
	 */
	ResultCode<Integer> getOrderCount(OrderParamsVo command);
	
	/**
	 * ��ѯ�����б�
	 * @param param
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getOrderList(ParamsVo param);
	
	/**
	 * ��ѯ��ʱȡ������
	 * @param param
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getCurFailureOrderList(ParamsVo param);
	
	/**
	 * ����������ѯ����
	 * @param orderId
	 * @return
	 */
	ResultCode<GewaOrderVo> getGewaOrder(Long orderId);
	
	/**
	 * ���ݶ����Ų�ѯ��ַ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderAddressVo> getOrderAddressVo(String tradeNo);
	
	/**
	 * ��ȡ��Ʒ�����б�
	 * @param param
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getGoodsOrderList(ParamsVo param);
	
	/**
	 * ���ݵ绰��ѯ��������
	 * @param param
	 * @return
	 */
	ResultCode<Integer> getGewaorderCountByMobile(ParamsVo param);
	
	/**
	 * ��ѯ�����Ƿ�֧�ֿ��
	 * @param tradeno
	 * @return
	 */
	ResultCode<Boolean> isTakeByTradeno(String tradeno);
	
	/**
	 * ���ݶ����Ų�ѯ����
	 * @param tradeNo
	 * @return
	 */
	ResultCode<GewaOrderVo> getGewaOrderByTradeNo(String tradeNo);
	
	/**
	 * ��ѯ����Map
	 * @param orderMap
	 * @return
	 */
	ResultCode<GewaOrderMapVo> getGewaOrderMap(GewaOrderMapVo orderMap);
	
	/**
	 * ���ݶ����Ų�ѯ������չ��Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderExtraVo> getOrderExtraByTradeNo(String tradeNo);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderNoteVo> getOrderNodeByTradeNo(String tradeNo);
	
	
	/**
	 * ��ȡ�û���Ʊ����
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getOrderMemberHis(Long memberid);
	
	/**
	 * ��ȡ�û���Ʊ����
	 * @param memberid
	 * @param ordertype
	 * @return
	 */
	ResultCode<Integer> getOrderMemberHisWithType(Long memberid, String ordertype);
	
	ResultCode<List<GewaOrderMapVo>> getGewaOrderMapList(List<GewaOrderVo> orderList);
	
	/**
	 * �����û�ID��ȡ������Ϣ
	 * @param memberid
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getHisOrderListByMemberid(ParamsVo param);
	
	/**
	 * �����û�ID��ȡ������Ϣ
	 * @param memberid
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getGewaOrderListByTradenoList(List<String> tradenos);
	
	/**
	 * ����mpid��ѯ�����ڣ�������Ϣ
	 * @param mpid
	 * @return
	 */
	ResultCode<VoMap> getOpiMapByMpid(Long mpid, Timestamp playtime);
}
