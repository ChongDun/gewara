package com.gewara.drama.dubbo.partner;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.partner.req.PartnerCommonReqVo;
import com.gewara.drama.vo.partner.res.OdiTheatreSeatExtraVo;

public interface PartnerDpiVoService {
	
	/**
	 * ��ȡ����۸���λͼ��Ϣ
	 * @param reqVo
	 * @return
	 */
	ResultCode<OdiTheatreSeatExtraVo> getCacheSeatByTheatreSeatArea(PartnerCommonReqVo reqVo);
	
	/**
	 * ��ȡ����۸���λͼ��Ϣ
	 * @param reqVo
	 * @return
	 */
	ResultCode<OdiTheatreSeatExtraVo> getOpenTheatreSeatByTheatreSeatArea(PartnerCommonReqVo reqVo);
}
