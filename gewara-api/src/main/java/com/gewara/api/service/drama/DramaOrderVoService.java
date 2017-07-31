package com.gewara.api.service.drama;

import java.util.List;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.cmd.order.OrderParamsVo;
import com.gewara.api.vo.order.BuyItemVo;
import com.gewara.api.vo.order.GewaOrderVo;
import com.gewara.api.vo.pay.OrderOtherVo;
import com.gewara.drama.vo.cmd.AreaSeatParamsVo;
import com.gewara.drama.vo.cmd.ItemSeatMapVo;

public interface DramaOrderVoService {
	
	public ResultCode<ItemSeatMapVo> getChooseSeat(AreaSeatParamsVo paramsVo) ;
	/**
	 * ��ѯ�ݳ�����
	 * @param command
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getDramaOrderVoList(OrderParamsVo command, int from, int maxnum);
	
	/**
	 * ��ȡ�����б�				
	 * @param orderId ����id
	 * @return
	 * @author ����ӥ
	 * @date 2014��10��23�� 14:37:58
	 */
	ResultCode<List<BuyItemVo>> getItemList(Long orderId);
	
	/**
	 * ��ѯ�ݳ�����
	 * @param orderid
	 * @deprecated ��gworder�ӿ�
	 * @see com.gewara.api.gworder.service.GwOrderService.getOrderById
	 * @return
	 */
	@Deprecated 
	ResultCode<GewaOrderVo> getDramaOrderVo(Long orderid);
	
	ResultCode<GewaOrderVo> getLastUnpaidDramaOrder(Long memberid, String ukey, Long areaid);
	
	ResultCode<List<String>> getDramaOrderSeatLabelList(Long orderid);
	
	
	/*****
	 * 
	* @Title: 
	* @Description: ��ȡ����
	* @param orderid
	* @return
	* @return ResultCode<OrderOtherVo>
	 */
	ResultCode<OrderOtherVo> getDramaOrderOtherData(Long orderid);
	
	/**
	 * ��֤�û�Ʊȯ����
	 * @param dramaid
	 * @param memberid
	 * @return 
	 * @see DramaPrioritizeVoService.checkDramaPrioritize
	 */
	@Deprecated 
	ResultCode checkPriorizite(Long dramaid, Long memberid);
	
	/**
	 * ����Զ�̴�Ʊ��Ϣ
	 * @param orderid
	 * @param remotePrintInfo
	 * @return
	 */
	ResultCode saveOrderPrintInfo(Long orderid, String remotePrintInfo);
	
	/**
	 * ���涩�������Ϣ
	 * @param orderid
	 * @param addressid
	 * @return
	 */
	ResultCode<Integer> saveOrderAddress(Long orderid, Long addressid);
}
