package com.gewara.api.partner.service;

import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.vo.ResultCode;

public interface PartnerWandaVoService {
	/**
	 * ��ȡ���ѡ����ַ2
	 */
	ResultCode<String> getSeatInfo2(PartnerCommonReqVo reqVo);
	/**
	 * ����µ�2
	 */
	ResultCode<String> createOrder2(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ�ؼۻ�Ĺ�����ʾ����صĹ������ƣ�
	 * @param sdid
	 * @return
	 */
	ResultCode<String> getSdRemark(PartnerCommonReqVo reqVo);
}
