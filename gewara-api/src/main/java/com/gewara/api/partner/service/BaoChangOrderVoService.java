package com.gewara.api.partner.service;

import com.gewara.api.partner.req.vo.PartnerAddOrderReqVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;

public interface BaoChangOrderVoService {
	/**
	 * �������Σ���������ѡ���µ���ϵͳ���֧��
	 * @param reqVo
	 * @return
	 */
	ResultCode<GewaOrderVo> addBaoChangTicketOrder(PartnerAddOrderReqVo reqVo);
	/**
	 * �������Σ�����ǰ35���ӣ�δ��������λϵͳ�Զ��µ������ȷ��
	 * @param mpid
	 * @param secid
	 * @param seatLabel
	 * @param remoteIp
	 * @return
	 */
	ResultCode<GewaOrderVo> addBaoChangTicketOrder4Remain(Long mpid, String secid, String seatLabel, String remoteIp);
}
