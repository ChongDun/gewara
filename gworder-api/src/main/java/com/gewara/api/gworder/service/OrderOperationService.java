package com.gewara.api.gworder.service;

import com.gewara.api.gworder.vo.CreateGoodsOrderReq;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;
import com.gewara.api.vo.pay.OtherFeeDetailVo;

public interface OrderOperationService {
	
	/**
	 * ������Ʒ����
	 * @param req ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2016��8��3������5:32:42
	 */
	ResultCode<GewaOrderVo> createGoodsOrder(CreateGoodsOrderReq req);
	
	/**
	 * �����ݷ���Ϣ
	 * @param orderid ������Ϊ��
	 * @param otherfee ������Ϊ��
	 * @param expressPrice ������Ϊ��,��ݷ�
	 * @param express ������Ϊ��
	 * @param otherFeeDetail ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2016��8��3������5:32:56
	 */
	ResultCode<OtherFeeDetailVo> saveExpressFee(Long orderid, int otherfee, int expressPrice, String express, OtherFeeDetailVo otherFeeDetail);
	
	/**
	 * Drama,��������
	 * ��Ʒƴ�Ź�������ʱ�����ÿ��express
	 * 
	 * @param orderid
	 * @param express
	 * @return
	 * @author leo
	 * @addTime 2016��8��3������6:23:29
	 */
	ResultCode changeDramaPreTypeTExpress(Long orderid, String express);
	

	/**
	 * ��������Ϣ
	 * @param orderId ������Ϊ��
	 * @param takemethodID ����Ϊ��
	 * @param express ����Ϊ��
	 * @param otherfee ����Ϊ�գ����ڵ�0ʱ���޸�
	 * @param otherFeeDetailId ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2016��8��4������2:20:19
	 */
	ResultCode clearExpressFee(Long orderId, String takemethodID, String express, int otherfee, Long otherFeeDetailId);
	
	/**
	 * ���������֧�����֪ͨ
	 * @param appkey ������key
	 * @param partnerServerIp ������IP
	 * @param tradeno
	 * @param paidAmount
	 * @param payseqno
	 * @return
	 * @author leo
	 * @addTime 2016��8��8������2:26:57
	 */
	ResultCode partnerPayNotify(String appkey, String partnerServerIp, String tradeno, String paidAmount, String payseqno);
	
	/**
	 * �������״̬��STATUS_NEW�����޸ĳ�STATUS_NEW_CONFIRM</br>
	 * ͬʱ�޸�payMethodΪgewaPay
	 * @param orderid
	 * @return
	 * @author leo
	 * @addTime 2016��9��5������16:05:32
	 */
	ResultCode gewaPayToConfirm(Long orderid);
	
	/**
	 * �˵�ӰƱ
	 * 
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2016��9��12������10:49:33
	 */
	ResultCode cancelRemoteTicket(String tradeNo);
	
	/**
	 * ɾ����Ӱ����BuyItem
	 * @param memberid
	 * @param itemid
	 * @return
	 * @author leo
	 * @addTime 2016��9��12������2:32:10
	 */
	ResultCode<GewaOrderVo> removeTicketOrderBuyItem(Long memberid, Long itemid);
}
