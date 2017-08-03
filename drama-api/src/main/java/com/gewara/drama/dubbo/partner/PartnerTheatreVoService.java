package com.gewara.drama.dubbo.partner;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.TheatreVo;
import com.gewara.drama.vo.partner.req.PartnerCommonReqVo;
import com.gewara.drama.vo.partner.req.PartnerTheatreReqVo;

public interface PartnerTheatreVoService {

	/**
	 * ��ȡ��ǰ��Ŀ�ݳ����еĳ���
	 * @param reqVo
	 * @return
	 */
	ResultCode<TheatreVo> getCurTheatreVo(PartnerCommonReqVo reqVo);
	
	/**
	 * ��ȡ��ǰ��Ŀ�ɹ�Ʊ����
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<TheatreVo>> getBookingTheatreList(PartnerTheatreReqVo reqVo);
}
