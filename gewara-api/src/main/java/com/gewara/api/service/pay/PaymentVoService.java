package com.gewara.api.service.pay;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.pay.BSCardVo;
import com.gewara.api.vo.pay.DiscountVo;
import com.gewara.api.vo.pay.ElecCardBatchVo;
import com.gewara.api.vo.pay.ElecCardVo;
import com.gewara.api.vo.pay.OtherFeeDetailVo;
import com.gewara.api.vo.pay.PayMethodInfoVo;
import com.gewara.api.vo.pay.PayMethodVo;
import com.gewara.api.vo.pay.SpCodeVo;
import com.gewara.api.vo.pay.SpecialDiscountTagVo;

public interface PaymentVoService {
	
	/**
	 * ���ݶ���ID��ѯ�ۿ�
	 * @param orderId
	 * @return
	 */
	ResultCode<List<DiscountVo>> getDiscountByOrderId(Long orderId);
	
	/**
	 * ���ݶ����Ų�ѯ�ۿ�
	 * @param orderId
	 * @return
	 */
	ResultCode<List<DiscountVo>> getDiscountByTradeNo(String tradeNo);
	

	/**
	 * ���ݶ���ID��ѯ����������ϸ
	 * @param orderId
	 * @return
	 */
	ResultCode<List<OtherFeeDetailVo>> getOtherFeeDetailByOrderId(Long orderId);
	
	
	/**
	 * ��ѯ�û�ȯ����
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getCardCountByMemberid(Long memberid, String tag);
	
	/**
	 * ��ѯ���õ�ȯ����
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getSpCodeCountByMemberid(Long memberid);
	/**
	 * ��ѯ�ؼۻ�Ƿ�ʼ
	 * @param spid
	 * @return
	 */
	ResultCode<String> getSpdEnabledCommon(String citycode,Long spid);
	/**
	 * ��ȡ�û���Ч�Ļ��
	 * @param memberid
	 * @param spid
	 * @param fromnum
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<SpCodeVo>> getSpCodeList(Long memberid, Long spid, int fromnum, int maxnum);
	
	/**
	 * ��ѯ�û�ȯ�б�
	 * @param memberid
	 * @param spid
	 * @param fromnum
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<ElecCardVo>> getCardListByMemberid(Long memberid, String tag, int fromnum, int maxnum);
	
	/**
	 * ��ѯ�Ż�ȯ
	 * @param cardid
	 * @return
	 */
	ResultCode<ElecCardVo> getElecCardVo(Long cardid);
	/**
	 * ��ѯ���
	 * @param spCodeid
	 * @return
	 */
	ResultCode<SpCodeVo> getSpCodeVo(Long spCodeid);
	/**
	 * ��ѯ�ؼۻ�Ŀ��µ�����
	 * @param spid
	 * @return
	 */
	ResultCode<Integer> getSpecialDiscountAllowaddnum(Long spid);
	
	/**
	 * ��ѯ�ؼۻ�Ŀ��µ�����
	 * @param spid
	 * @return
	 */
	ResultCode<Integer> getSpecialDiscountAllowaddnumByFlag(String flag);
	
	/**
	 * ��ȡ֧����ʽ��ʹ���Żݣ�
	 * @param appkey
	 * @param tradeNo
	 * @param discountId
	 * @param ukey
	 * @param remoteIp
	 * @param commonMap
	 * @return
	 */
	ResultCode<PayMethodInfoVo> showPayMethodList(String appkey, String tradeNo, Long discountId, String ukey, String remoteIp, Map<String, String> commonMap);
	
	ResultCode<PayMethodVo> getPayMethodById(String id);
	
	ResultCode<List<PayMethodVo>> getPayMethodListByIdList(String ... ids);
	
	/**
	 * ����ؼۻ�ɹ�������
	 * @param appkey		appkey
	 * @param discountid	�ID
	 * @param citycode		���д���
	 * @param quantity		��������
	 * @return
	 */
	ResultCode<Integer> checkSpdiscountQuantity(String appkey, Long discountid, String citycode, Integer quantity);
	/**
	 * ���㵱ǰѡ�����λ�۸�
	 * @param mpid
	 * @param seatLabel
	 * @param goodsid
	 * @param quantity
	 * @param discountid
	 * @return
	 */
	ResultCode<Integer> computerSeatAmount(String appkey,Long mpid, String seatLabel, Long goodsid, Integer quantity, Long discountid);
	/**
	 *  ѡ��λ�����ͨ���Ż�Ƶ�����룬ѡ��λʱ����У�� ����۸�
	 * @param appkey
	 * @param mpid
	 * @param seatLabel
	 * @param discountid
	 * @param memberEncode
	 * @return
	 */
	ResultCode<Integer> validateSpdiscountIsUse(String appkey, Long mpid, String seatLabel, Long discountid, String mobile, Integer totalfee,String secid, String encodeOrSessid, String remoteIps);
	/**
	 * ͨ��΢�Ź��ں�֧�������û���ֵ
	 * @param toMemberid
	 * @param fromMemberid
	 * @param amount
	 * @param remoteIp
	 * @return
	 */
	ResultCode<Map<String, String>> getWxChargeParams(Long toMemberid, Long fromMemberid, Integer amount, String remoteIp);
	/**
	 * ��ȡSpecialDiscountTagList
	 * @return
	 */
	ResultCode<List<SpecialDiscountTagVo>> getSpecialDiscountTagList();
	
	/**
	 * ���ܼ�������ȡ�������Ż�ȯ
	 * @param ebatchidList
	 * @return
	 */
	ResultCode<Map<String, String>> getDelayElecCardNoMap(List<Long> ebatchidList);
	
	/**
	 * ����ʵ���۳��������������
	 * spidList<=1000
	 * @param spidList
	 * @param citycode
	 * @return
	 */
	ResultCode<Map<Long, String>> spcounterSpecialDiscountStatus(List<Long> spidList, String citycode);
	
	/**
	 * ���ص���ȯ�����б�
	 * spidList<=1000
	 * @param spidList
	 * @param citycode
	 * @return
	 */
	ResultCode<List<ElecCardBatchVo>> getElecCardBatchList(List<Long> batchidList);
	/**
	 * �����û�ID��ȡ�̻�����ȯ
	 * @param memberid
	 * @return
	 */
	ResultCode<List<BSCardVo>> getBsCardListByMemberid(Long memberid, int fromnum, int maxnum);
	/**
	 * �����û�ID��ȡ�̻�����ȯ
	 * @param id
	 * @return
	 */
	ResultCode<BSCardVo> getBsCardById(Long id);
	
	/**
	 * �����ؼ۵��޸�ʱ�䣬��ѯ�ؼ�
	 * @param updateStartTime
	 * @param updateEndTime
	 * @return
	 * @author leo
	 * @addTime 2015��11��24������2:56:48
	 */
	ResultCode<List<Map<String, Object>>> findPromotionList(Timestamp updateStartTime, Timestamp updateEndTime);
	/**
	 * ���ݿ����ҿ�
	 * @param cardpass
	 */
	ResultCode<ElecCardVo> getElecCardByPass(String cardpass); 
	/**
	 * ���ݿ����ҿ�
	 * @param cardno
	 */
	ResultCode<ElecCardVo> getElecCardByNo(String cardno);
}
