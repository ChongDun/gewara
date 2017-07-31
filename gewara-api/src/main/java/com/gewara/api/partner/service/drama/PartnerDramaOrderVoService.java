package com.gewara.api.partner.service.drama;

import com.gewara.api.partner.req.drama.vo.PartnerDramaOrderMultiPriceReqVo;
import com.gewara.api.partner.req.drama.vo.PartnerDramaOrderPriceReqVo;
import com.gewara.api.partner.req.drama.vo.PartnerDramaOrderSeatReqVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;

public interface PartnerDramaOrderVoService {

	/**
	 * ѡ���µ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addDramaOrderBySeat(PartnerDramaOrderSeatReqVo reqVo);
	
	/**
	 * ѡ��һ�۸��µ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addDramaOrderBySimplePrice(PartnerDramaOrderPriceReqVo reqVo);
	
	/**
	 * ѡ��֧�ֶ���۸��µ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addDramaOrderByMultiPrice(PartnerDramaOrderMultiPriceReqVo reqVo);
}
