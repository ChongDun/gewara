package com.gewara.ucenter.api;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;

public interface PartnerPinganfuVoService {
	/**
	 * ƽ����������¼�ӿ�
	 * @param loginToken      ƽ�����ĵ�¼token
	 * @param uid			     �����û���ΨһID
	 * @param citycode        ���б���
	 * @param remoteIp        ��¼�û�IP
	 * @return                �û�ʵ�����
	 */
	public ResultCode<MemberVo> pinganfuLogin(String loginToken, String uid, String citycode, String remoteIp);
	
	/**
	 * 
	 * ��ȡ��ȡƽ������¼token
	 * @param memberId            �������û�id
	 * @param transactionId       ƽ�����û�Ψһ��ʶ
	 * @return                    ƽ�����û���¼token
	 */
	public ResultCode<String> getLoginToken(Long memberId, String transactionId);
}
