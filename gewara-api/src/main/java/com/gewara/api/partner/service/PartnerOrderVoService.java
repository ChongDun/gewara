package com.gewara.api.partner.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.partner.req.vo.PartnerAddOrderReqVo;
import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.partner.req.vo.PartnerOrderInfoReqVo;
import com.gewara.api.partner.req.vo.PartnerOrderQueryReqVo;
import com.gewara.api.partner.req.vo.PartnerOrderRefundInfoReqVo;
import com.gewara.api.partner.req.vo.PartnerSpCodeReqVo;
import com.gewara.api.partner.res.vo.OrderCardVo;
import com.gewara.api.partner.res.vo.OrderSpCodeVo;
import com.gewara.api.partner.res.vo.SpDiscountVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.BuyItemVo;
import com.gewara.api.vo.order.GewaOrderVo;
import com.gewara.api.vo.pay.OrderAddressVo;
import com.gewara.api.vo.pay.OrderExtraVo;
import com.gewara.api.vo.pay.OrderNoteVo;
import com.gewara.api.vo.pay.OrderRefundVo;
import com.gewara.api.vo.pay.PayMethodInfoVo;
import com.gewara.api.vo.pay.RouteVo;
import com.gewara.api.vo.pay.SelectPayMethodVo;

public interface PartnerOrderVoService {
	/**
	 * ������Ӱ����
	 * 
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addTicketOrder(PartnerAddOrderReqVo reqVo);
	/**
	 * ��������
	 * 
	 * @param appkey
	 * @param memberId
	 * @param tradeNo
	 * @return
	 */
	ResultCode<GewaOrderVo> getOrderDetail(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ��������
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> getGewaOrder(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��������ʱ
	 * 
	 * @param appkey
	 * @param memberId
	 * @param tradeNo
	 * @return
	 */
	ResultCode<Long> getValidTime(PartnerOrderInfoReqVo reqVo);

	/**
	 * ���ݶ����Ż�ȡ�ؼۻ�б�
	 * 
	 * @param appkey
	 * @param memberId
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<SpDiscountVo>> getDiscountList(PartnerOrderInfoReqVo reqVo);

	/**
	 * ������֧����ʽ�б�
	 * 
	 * @param appkey
	 * @param memberId
	 * @param tradeNo
	 * @return
	 */
	ResultCode<PayMethodInfoVo> showPayMethodList(PartnerOrderInfoReqVo reqVo);

	/**
	 * ����֧����ʽ��ȡ�ύ������Ϣ
	 * 
	 * @param appkey
	 * @param memberId
	 * @param tradeNo
	 * @return
	 */
	ResultCode<SelectPayMethodVo> selectPayMethod(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ������ȡƱ����
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> getOrderTakeTicketMsg(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ������״̬
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> getOrderStatus(PartnerOrderInfoReqVo reqVo);
	/**
	 * �û�ȡ������
	 * @param reqVo
	 * @return
	 */
	ResultCode cancelOrder(PartnerOrderInfoReqVo reqVo);
	/**
	 * �û�ȡ��ʹ���Ż�
	 * @param vo
	 * @return
	 */
	ResultCode cancelOrderDiscount(PartnerOrderInfoReqVo reqVo);
	/**
	 * �û����֧��
	 * @param reqVo
	 * @return
	 */
	ResultCode balancePay(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ��������ʹ�õĶһ�ȯ
	 * @param vo
	 * @return
	 */
	ResultCode<List<OrderCardVo>> getCardListByTradeNo(PartnerOrderInfoReqVo reqVo);
	/**
	 * ʹ��ȯ����
	 * @param reqVo
	 * @return
	 */
	ResultCode<OrderCardVo> useCard(PartnerOrderInfoReqVo reqVo);
	/**
	 * ȯȷ��֧��
	 * @param reqVo
	 * @return
	 */
	ResultCode<Integer> confirmCardPay(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ�û�������Ϣ�б�
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getMemberOrderList(PartnerOrderQueryReqVo reqVo);
	/**
	 * ʹ���ؼۻ��
	 * @param reqVo
	 * @return
	 */
	ResultCode<Map> useSpcode(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��ȡ�ؼۻ���б�
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<OrderSpCodeVo>> getSpCodeVoList(PartnerSpCodeReqVo reqVo);
	/**
	 * unionWapFast֧��
	 * @param reqVo
	 * @return
	 */
	ResultCode unionWapFast(PartnerCommonReqVo reqVo);

	/**
	 * �����̴����������Ǹ������û�����������¼�û�
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addPartnerUserTicketOrder(PartnerAddOrderReqVo reqVo);
	/**
	 * ��ȡ�����б�
	 * @param orderId
	 * @return
	 */
	ResultCode<List<BuyItemVo>> getItemList(PartnerOrderInfoReqVo reqVo);
	/**
	 * ���ݶ����Ų�ѯ�����˿�
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderRefundVo> getOrderRefundByTradeNo(PartnerOrderInfoReqVo reqVo);
	/**
	 * �ύ�˿�
	 * @param orderId
	 * @param tradeNo
	 * @param retback
	 * @param reasoninfo
	 * @return
	 */
	ResultCode confirmRefundOrder(PartnerOrderRefundInfoReqVo reqVo);
	/**
	 * ��鶩���ܷ��˿�
	 * @param tradeNo
	 * @return
	 */
	ResultCode checkRefundOrder(PartnerOrderInfoReqVo reqVo);
	/**
	 * ��鶩���ܷ��˿�
	 * @param tradeNo
	 * @return
	 */
	ResultCode filterRefundOrder(PartnerOrderInfoReqVo reqVo);
	/**
	 * ���ݶ����Ų�ѯ������Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<RouteVo>> getRouteVoByTradeNo(PartnerOrderInfoReqVo reqVo);
	/**
	 * ���ݶ����Ų�ѯ������չ��Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderExtraVo> getOrderExtraByTradeNo(PartnerOrderInfoReqVo reqVo);
	/**
	 * ���ݶ����Ų�ѯ��ַ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<OrderAddressVo> getOrderAddressVo(PartnerOrderInfoReqVo reqVo);

	ResultCode<GewaOrderVo> useWeixinCard(PartnerOrderInfoReqVo reqVo);
	
	ResultCode<List<OrderNoteVo>> getOrderNoteList(PartnerOrderInfoReqVo reqVo);
	
	ResultCode<List<OrderSpCodeVo>> getSpCodeVoListByMemberId(PartnerSpCodeReqVo reqVo);
	ResultCode<List<OrderSpCodeVo>> getUnoverdueSpCodeVoList(PartnerSpCodeReqVo reqVo);
	/**
	 * ʹ�û���
	 * @param tradeNo
	 * @return
	 */
	ResultCode usePoint(String memberEncode,String tradeNo,int usePoint,String ip);
	ResultCode sendVoiceCode(String tradeNo, String ip, String mobile, boolean checkSecurity);
	/**
	 * ��������ѡ����,�����������Żݷ�ʽ����Ļ״̬����Ϊ����
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<SpDiscountVo>> getShareDiscountList(PartnerOrderInfoReqVo reqVo);
	
	ResultCode<Map<String, String>> getRelatedData(GewaOrderVo order);
	/**
	 * ȡ������gewaOrder����
	 * @param reqVo
	 * @return
	 */
	ResultCode cancelBaoChangGewaOrder(PartnerOrderInfoReqVo reqVo);
	/**
	 * ԭgetMemberOrderList��ѯ��������������ѯHisOrder�Ķ�����
	 * getMemberOrderListNew��������ѯGewaOrder��PostOrder��HisOrder
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getMemberOrderListNew(PartnerOrderQueryReqVo reqVo);
	/**
	 * ���ݶ����Ż�ȡ΢������ȯ����
	 * @param tradeNo
	 * @return
	 */
	ResultCode<Map<String, String>> getWxFriendCardData(String tradeNo);
	/**
	 * �û�ɾ��������wap�ã�
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> removeOrderForWap(PartnerOrderInfoReqVo reqVo);

	/**
	 * ��ȡ������ȡƱ����
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> getTicketPassMsg(PartnerOrderInfoReqVo reqVo);

	/**
	 * ��ȡ����QQ������¼�Ķ�����Ϣ
	 * 
	 * @param tradeNo
	 * @return
	 */
	ResultCode<Map<String, String>> getQQcardConsumeInfo(String tradeNo);

	/**
	 * ��������QQ������¼�Ķ�����Ϣ����QQ��ȯ����ʱʹ��
	 * 
	 * @param tradeNo
	 * @param cardId
	 * @param code
	 * @return
	 */
	ResultCode<String> saveQQcardConsumeInfo(String tradeNo, String cardId, String code);
	/**
	 * ʹ�õ㿨(FCard)
	 * @param reqVo
	 * @return
	 */
	ResultCode<OrderCardVo> useFCard(PartnerOrderInfoReqVo reqVo);

}
