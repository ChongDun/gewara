package com.gewara.api.partner.service;

import java.util.List;

import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.partner.res.vo.BaseMemberVo;
import com.gewara.api.partner.res.vo.MemberECardVo;
import com.gewara.api.vo.ResultCode;

public interface PartnerMemberVoService {
	/**
	 * ����memberid��ȡ�û���Ϣ
	 * @param reqVo
	 * @return
	 */
	ResultCode<BaseMemberVo> getMemberByMemberid(PartnerCommonReqVo reqVo);
	/**
	 * �û���ȯ
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> bindCard(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ���ֻ��ŵĶ�̬��
	 * @param reqVo
	 * @return
	 */
	ResultCode getBindMobileDynamicNumber(PartnerCommonReqVo reqVo);
	/**
	 * �û����ֻ���
	 * @param reqVo
	 * @return
	 */
	ResultCode bindMobile(PartnerCommonReqVo reqVo);
	/**
	 * �������ֵ
	 * @param reqVo
	 * @return
	 */
	ResultCode<Integer> bindVipCard(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ�û��ĵ���ȯ�б�
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<MemberECardVo>> getMemberECardList(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡƱȯ��ϸ��ΪH5��ȯ��ϸҳʹ��
	 * @param appkey
	 * @param cardno
	 * @return
	 */
	ResultCode<MemberECardVo> getCardDetailByCardno(String appkey, String memberEncode, String remoteIp, String cardno);
	
}
