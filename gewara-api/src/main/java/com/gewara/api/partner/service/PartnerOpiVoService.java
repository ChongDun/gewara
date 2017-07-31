package com.gewara.api.partner.service;

import java.util.Map;

import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.partner.res.vo.OpiSeatVo;
import com.gewara.api.vo.ResultCode;

public interface PartnerOpiVoService {
	/**
	 * ��ȡ������λͼ
	 * @param reqVo
	 * @return
	 */
	ResultCode<OpiSeatVo> getOpiCacheSeat(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡʵʱ��λͼ
	 * @param reqVo
	 * @return
	 */
	ResultCode<OpiSeatVo> getOpiSeat(PartnerCommonReqVo reqVo);
	
	ResultCode<Map<String, String>> getCachedRemoteLockSeat(Long mpid, String secid);
}
