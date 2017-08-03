package com.gewara.api.gworder.service;

import java.io.Serializable;
import java.util.List;

import com.gewara.api.gworder.vo.CreateBaoChangOrderReq;
import com.gewara.api.gworder.vo.CreateDramaOrderReq;
import com.gewara.api.gworder.vo.CreateMallOrderReq;
import com.gewara.api.gworder.vo.CreateMovieOrderReq;
import com.gewara.api.gworder.vo.CreateOrderReq;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;
import com.gewara.api.vo.pay.PubSaleVo;

public interface GwOrderService extends ContextManagerService{

	/**
	 * ���ٽ�CreateOrderReq���봦�������,ֱ�ӷ���
	 * <br>��̨�첽���������̣������ɹ���ͨ��JMS��Ϣ�첽֪ͨ
	 * <br>��������δ��������ɹ�������ResultCode.SUCCESS
	 * <br>���ʧ�ܣ�����ResultCode.Failure
	 * @param createOrderReq
	 * @return ResultCode 
	 */
	ResultCode asynCreateOrder(CreateOrderReq createOrderReq);
	
	/**
	 * ���ٽ�CreateMovieOrderReq���봦�������,ֱ�ӷ���
	 * <br>��̨�첽���������̣������ɹ���ͨ��JMS��Ϣ�첽֪ͨ
	 * <br>��������δ��������ɹ�������ResultCode.SUCCESS
	 * <br>���ʧ�ܣ�����ResultCode.Failure
	 * @param createOrderReq
	 * @return ResultCode 
	 */
	ResultCode asynCreateMovieOrder(CreateMovieOrderReq createOrderReq);
	
	/**
	 * ͬ��������Ӱ����
	 * <br>ʹ�ó������µ���С��ԭ������dubbo�ӿڣ��첽�����Ѷȴ�,�磺partner��wap����
	 * @param createOrderReq
	 * @return ResultCode���ɹ�����GewaOrderVo����
	 */
	ResultCode<GewaOrderVo> synCreateMovieOrder(CreateMovieOrderReq createOrderReq);
	/**
	 * �����̳Ƕ���
	 * @param createOrderReq
	 * @return
	 */
	ResultCode<GewaOrderVo> createMallOrder(CreateMallOrderReq createOrderReq);
	
	/**
	 * ���ٽ�CreateDramaOrderReq���봦�������,ֱ�ӷ���
	 * <br>��̨�첽���������̣������ɹ���ͨ��JMS��Ϣ�첽֪ͨ
	 * <br>��������δ��������ɹ�������ResultCode.SUCCESS
	 * <br>���ʧ�ܣ�����ResultCode.Failure
	 * @param createOrderReq
	 * @return ResultCode 
	 */
	ResultCode asynCreateDramaOrder(CreateDramaOrderReq createOrderReq);
	/**
	 * ͬ�������ݳ�����
	 * <br>ʹ�ó������µ���С��ԭ������dubbo�ӿڣ��첽�����Ѷȴ�,�磺partner��wap����
	 * @param createOrderReq
	 * @return ResultCode���ɹ�����GewaOrderVo����
	 */
	ResultCode<GewaOrderVo> synCreateDramaOrder(CreateDramaOrderReq createOrderReq);
		
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(�û����ڽ��в����Ķ������µ���ɡ�ȥ֧���ȣ�)
	 * @param id
	 * @return
	 */
	ResultCode<GewaOrderVo> getCurOrderById(Long id);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(��������ʷ���������Ƴ���δ֧������Ķ���)
	 * @param id
	 * @return
	 */
	ResultCode<GewaOrderVo> getOrderById(Long id);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(��ǰ�����Լ��ɹ���������������ʷ���������Ƴ���δ֧������Ķ���)
	 * @param idList
	 * @return
	 * @author leo
	 * @addTime 2016��7��28������2:35:15
	 */
	ResultCode<List<GewaOrderVo>> getOrderByIdList(List<Long> idList);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(������ʷ�����������������Ƴ���δ֧������Ķ���)
	 * @param id
	 * @return
	 * @author leo
	 * @addTime 2016��6��28������4:45:46
	 */
	ResultCode<GewaOrderVo> getGewaOrderAndHis(Long id);

	/**
	 * ���ݶ����Ų�ѯ������Ϣ(ȫ������)
	 * @param id
	 * @return
	 */
	ResultCode<GewaOrderVo> getAllOrderById(Long id);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(�û����ڽ��в����Ķ������µ���ɡ�ȥ֧���ȣ�)
	 * @param tradeNo
	 * @return
	 */
	ResultCode<GewaOrderVo> getCurOrderByTradeNo(String tradeNo);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(��������ʷ���������Ƴ���δ֧������Ķ���)
	 * @param tradeNo
	 * @return
	 */
	ResultCode<GewaOrderVo> getOrderByTradeNo(String tradeNo);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(���������Ƴ���δ֧������Ķ���)
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2016��8��4������5:58:01
	 */
	ResultCode<GewaOrderVo> getGewaOrderAndHis(String tradeNo);
	
	/**
	 * ���ݶ����Ų�ѯ������Ϣ(ȫ������)
	 * @param tradeNo
	 * @return
	 */
	ResultCode<GewaOrderVo> getAllOrderByTradeNo(String tradeNo);
	/**
	 * ˢ�»�������������λ
	 * @param mpid
	 * @param secid
	 */
	ResultCode refreshLockSeatList(Long mpid, String secid);

	/**
	 * ����paid_failure����
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2015��8��27������5:32:58
	 */
	ResultCode processPaidFailureOrder(String tradeNo);
	
	/**
	 * ȷ�϶����ɹ���������״̬��paid_failure��paid_failure_unfix��Ϊpaid_success
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2015��9��1������2:20:13
	 */
	ResultCode confirmSuccess(String tradeNo);
	/**
	 * ȡ������
	 * @param tradeNo
	 * @param memberId
	 * @return
	 */
	ResultCode cancelOrder(String tradeNo, Long memberId);
	
	ResultCode cancelOrder(String tradeNo, String ukey, String reason);
	
	/**
	 * ������������
	 * @param req
	 * @return
	 */
	ResultCode<GewaOrderVo> createBaoChangOrder(CreateBaoChangOrderReq req);
	/**
	 * �����̳Ƕ����ĳɱ���
	 * @param tradeNo
	 * @param totalcost
	 * @return
	 */
	ResultCode updateMallOrderTotalcost(String tradeNo, Integer totalcost);
	
	/**
	 * ���¶�����ֻ������GewaOrder����һ�������ֶε�ֵ</br>
	 * ���ر��޸ĵ��ֶθ���
	 * @param orderId		����ID
	 * @param properties	�ֶΣ�����á�,��������ֻ֧�����¼������ԣ�otherinfo,mobile,taketime,restatus
	 * @param values		ֵ
	 * @return
	 * @author leo
	 * @addTime 2016��6��7������11:26:29
	 */
	ResultCode<Integer> updateCurOrder(Long orderId, String properties, Serializable... values);
	
	/**
	 * ���¶�����ֻ������GewaOrder,PostOrder����һ�������ֶε�ֵ</br>
	 * ���ر��޸ĵ��ֶθ���
	 * @param orderId		����ID
	 * @param properties	�ֶΣ�����á�,��������ֻ֧�����¼������ԣ�otherinfo,mobile,taketime,restatus
	 * @param values		ֵ
	 * @return
	 * @author leo
	 * @addTime 2016��6��7������11:26:29
	 */
	ResultCode<Integer> updateGewaOrder(Long orderId, String properties, Serializable... values);
	
	/**
	 * ���¶�����ֻ������GewaOrder,PostOrder,HisOrder����һ�������ֶε�ֵ</br>
	 * ���ر��޸ĵ��ֶθ���
	 * @param orderId		����ID
	 * @param properties	�ֶΣ�����á�,��������ֻ֧�����¼������ԣ�otherinfo,mobile,taketime,restatus
	 * @param values		ֵ
	 * @return
	 * @author leo
	 * @addTime 2016��6��7������11:26:29
	 */
	ResultCode<Integer> updateGewaOrderAndHis(Long orderId, String properties, Serializable... values);
	
	/**
	 * ���¶�����ֻ������GewaOrder,PostOrder,HisOrder,CurFailureOrder����һ�������ֶε�ֵ</br>
	 * ���ر��޸ĵ��ֶθ���
	 * @param orderId		����ID
	 * @param properties	�ֶΣ�����á�,��������ֻ֧�����¼������ԣ�otherinfo,mobile,taketime,restatus
	 * @param values		ֵ
	 * @return
	 * @author leo
	 * @addTime 2016��6��7������11:26:29
	 */
	ResultCode<Integer> updateAllOrder(Long orderId, String properties, Serializable... values);
	
	ResultCode<Long> stopPubSale(PubSaleVo sale);
	
}
