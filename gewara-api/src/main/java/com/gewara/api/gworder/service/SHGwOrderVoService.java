package com.gewara.api.gworder.service;

import java.sql.Timestamp;
import java.util.Map;

import com.gewara.api.gworder.vo.CinemaMerchantGoodsStatisVo;
import com.gewara.api.gworder.vo.ProcessOrderPayVo;
import com.gewara.api.gworder.vo.ValidateOpenApiPayVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.CheckAddOrderGoodsGiftRes;


public interface SHGwOrderVoService {
	/**
	 * �µ���ʱ���ڶ�����Ϣotherinfo���¼ǿ�ư󶨵��ײ�
	 * @param tradeNo
	 * @return
	 */
	ResultCode bindOrderGoodsGift(String tradeNo);
	/**
	 * �µ���ʱ���û�ѡ����ײ���Ϣ
	 * @param tradeNo
	 * @param goodsid
	 * @param quantity
	 * @return
	 */
	ResultCode addOrderGoodsGift(String tradeNo, Long goodsid, Integer quantity);
	/**
	 * ���Ӷ��������ؼۻid������otherinfo��
	 * @param spkey
	 * @param tradeNo
	 * @param mpid
	 * @return
	 */
	ResultCode addSpid2OrderOtherinfo(String spkey, String tradeNo, Long mpid);
	
	/**
	 * �������״̬�ǣ�paid_failure��ȥ���������飺<br/>
	 * 1��������֧����ȷ��֧�����Ķ������Żݣ�Ʊȯ������
	 * 2����֤�ɹ������ض���״̬��ʶ��ע������״̬����Ϊ��paid_failure_unfix
	 * 
	 * ͬʱ����ȡƱ���룬�������Ѿ��е�ֱ�ӷ��أ�û�е����ɸ�����
	 * 
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2015��8��12������4:26:15
	 */
	ResultCode<ProcessOrderPayVo> processOrderPay(String tradeNo);
	/**
	 * ����ӰԺID�����ڻ�ȡͳ������
	 * @param cinemaid
	 * @param dateStr
	 * @return
	 */
	ResultCode<Map<String, CinemaMerchantGoodsStatisVo>> getCinemaStatisData(String token, Long cinemaid, Timestamp sdate);
	
	/**
	 * ������֪ͨ����������֤��֧���������ѯ
	 * 
	 * @param appkey
	 * @param tradeno
	 * @param paidAmount
	 * @param payseqno
	 * @return
	 * @author leo
	 * @addTime 2015��9��7������4:50:01
	 */
	ResultCode<ValidateOpenApiPayVo> validateOpenApiPay(String appkey, String partnerServerIp, String tradeno, String paidAmount, String payseqno);
	
	/**
	 * ������������Ʒʱ�����ȼ��һЩ�߼���Ȼ����ݷ��ص�CheckAddOrderGoodsGiftRes��������������Ʒ������Ʒ
	 * @param tradeNo
	 * @param goodsid
	 * @param quantity
	 * @return
	 * @author leo
	 * @addTime 2016��9��12������4:10:18
	 */
	ResultCode<CheckAddOrderGoodsGiftRes> checkAddOrderGoodsGift(String tradeNo, Long goodsid, Integer quantity);
}
