package com.gewara.api.service.goods;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.goods.PreSalesOrderParams;
import com.gewara.api.vo.order.GewaOrderVo;

public interface GoodsOrderVoService {
	
	ResultCode<GewaOrderVo> addActivityGoodsOrder(Long goodsid, Long memberid, String realname, String address, String mobile, String origin, Integer quantity, String citycode);
	/**
	 * ����partnerkey����
	 * @param goodsid
	 * @param memberid
	 * @param realname
	 * @param address
	 * @param mobile
	 * @param origin
	 * @param quantity
	 * @param citycode
	 * @param partnerkey
	 * @return
	 */
	ResultCode<GewaOrderVo> addActivityGoodsOrderWithParnter(Long goodsid, Long memberid, String realname, String address, String mobile, String origin, Integer quantity, String citycode, String partnerkey);	

	/**
	 * ����Ԥ�۲�Ʒ  (���в����������ֶ�)
	 * @param goodsid must
	 * @param memberid must
	 * @param addressId ��ַid, optional
	 * @param category ����, optional
	 * @param realname �û��� optional
	 * @param address  �ͻ���ַ optional
	 * @param remark ��ע
	 * @param mobile  must
	 * @param origin  ��Դ�������, optional
	 * @param quantity must
	 * @param citycode must
	 * @return
	 * @throws Exception 
	 */
	ResultCode<GewaOrderVo> addPreGoodsOrder(PreSalesOrderParams params);
	
	/**
	 * Ԥ���µ�
	 * @param params
	 * @return
	 */
	ResultCode<GewaOrderVo> addPreGoodsOrderForWap(PreSalesOrderParams params);
	/**
	 * ��Ʒ���׳ɹ���������
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode<Integer> getPaidSuccessOrderCount(String tag, Long relatedid);
	/**
	 * ��Ʒ���׳ɹ����˿�Ķ���
	 * @param activityid
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getPaidSuccessAndReturnOrderList(String tag, Long activityid, Timestamp starttime, Timestamp endtime);
	
	/**
	 * ȡ����һ��δ֧������Ʒ����
	 * @param params
	 * @return
	 */
	ResultCode cancelLastNotPaidGoodsOrder(Long memberid);
	/**
	 * ������Ʒid���û�id��ȡ������Ϣ
	 * @param goodsId
	 * @param memberid
	 * @return
	 */
	ResultCode<GewaOrderVo> getGewaOrderByGoods(Long goodsId, Long memberid);
	/**
	 * ��ѯ�����ɹ�����
	 * @param goodsId
	 * @param memberid
	 * @param status
	 * @return
	 */
	ResultCode<Integer> getGewaOrderCount(Long goodsId, Long memberid, String status);
	/**
	 * ���ݶ����Ų�ѯ������Ϣ
	 * @param tradeNo
	 * @deprecated ��gworder�ӿ�
	 * @see com.gewara.api.gworder.service.GwOrderService.getOrderByTradeNo
	 * @return
	 */
	@Deprecated
	ResultCode<GewaOrderVo> getGewaOrderByTradeNo(String tradeNo);
	/**
	 * ��Ʒ���׳ɹ��Ķ���
	 * @param tag
	 * @param activityid
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getPaidSuccessOrderList(String tag, Long activityid, Timestamp starttime, Timestamp endtime);
	/**
	 * ��ѯ������Ϣ
	 * @param goodsId
	 * @param status
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getOrderList(List<Long> goodsId, String status,String mobile, Integer from,Integer maxnum);
}
