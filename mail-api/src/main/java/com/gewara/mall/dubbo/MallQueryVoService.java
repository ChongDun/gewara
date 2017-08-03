package com.gewara.mall.dubbo;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.mall.vo.MallOrderItemVo;
import com.gewara.mall.vo.MemberUsefulAddressVo;
import com.gewara.mall.vo.OrderDetailShowVo;
import com.gewara.mall.vo.OrderParamsVo;
import com.gewara.mall.vo.ProductVo;
import com.gewara.mall.vo.ShipperOrderVo;
import com.gewara.mall.vo.SkuVo;

public interface MallQueryVoService {
	/**
	 * ��ȡ��Ʒ��Ϣ
	 * @param productId ��ƷId
	 * @return
	 */
	ResultCode<ProductVo> getProductVo(Long productId);
	/**
	 * ��ȡ���������ÿ����Ŀ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<MallOrderItemVo>> getMallOrderItemVoList(String tradeNo);
	/**
	 * ��ȡ��Ʒ�б�
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<ProductVo>> getProductVoList(String tradeNo);
	/**
	 * ��ȡSKU��Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<SkuVo> getSkuVo(Long id);
	
	/**
	 * ��ȡSKU��Ϣ�б�
	 * @param id
	 * @return
	 */
	ResultCode<List<SkuVo>> getSkuVoList(List<Long> idList);
	/**
	 * ���Ӷ����Ż�ȡsku�б�
	 * @param tradeNo
	 * @return
	 */
	ResultCode<List<SkuVo>> getSkuVoList(String tradeNo);
	
	/**
	 * ��ȡ�̳��ܶ���
	 * @param command
	 * @return
	 */
	ResultCode<List<OrderDetailShowVo>> getOrderDetailShowVoList(OrderParamsVo command,int from,int maxnum);
	/**
	 * ��ȡ�̳ǲ�ֶ���
	 * @param mallOrderId
	 * @param shipperOrderNo
	 * @return
	 */
	ResultCode<List<ShipperOrderVo>> getShipperOrderVoList(Long mallOrderId,String shipperOrderNo);
	
	/**
	 * ��ȡ�̳ǲ�ֶ�����ϸ
	 * @param shipperOrderId
	 * @return
	 */
	ResultCode<OrderDetailShowVo> getOrderDetailShowVo(Long shipperOrderId);
	/**
	 * ��ȡ�̳Ƕ�����ϸ
	 * @param mallOrderId
	 * @return
	 */
	ResultCode<OrderDetailShowVo> getOrderDetailShowVoByMallOrderId(Long mallOrderId);
	/**
	 * ��ȡ�����Ŀ�ݵ�ַ
	 * @param mallOrderId
	 * @return
	 */
	ResultCode<MemberUsefulAddressVo> getMemberUsefulAddressByMallOrderId(Long mallOrderId);
}
