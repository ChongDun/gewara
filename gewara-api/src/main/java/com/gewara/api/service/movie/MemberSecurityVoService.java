package com.gewara.api.service.movie;

import com.gewara.api.vo.ResultCode;

public interface MemberSecurityVoService {
	/**
	 * �Ƿ���Ҫ��ȫ��֤
	 * @param memberid
	 * @return
	 */
	ResultCode<Boolean> isSecurityVerify(String memberEncode, String remoteIp);
	/**
	 * ��ȡ��̬��֤��
	 * @param memberid
	 * @param mobile
	 * @param ip
	 * @return
	 */
	ResultCode getSecurityVerifyCode(String memberEncode, String mobile, String remoteIp);
	/**
	 * ��֤��̬����
	 * @param memberid
	 * @param mobile
	 * @param checkcode
	 * @param ip
	 * @return
	 */
	ResultCode preCheckBindMobile(String memberEncode, String mobile, String checkcode, String remoteIp);
	/**
	 * ��Ӱ�ȫ��֤ͨ����ʶ
	 * @param memberid
	 * @param checkCode
	 * @return
	 */
	ResultCode addMemberSecurityVerify(String memberEncode, String checkCode, String remoteIp);
	/**
	 * δ���ֻ��û������ֻ�����ȡ��֤��
	 * @param memberid
	 * @param mobile
	 * @param remoteIp
	 * @return
	 */
	ResultCode getSecurityVerifyCode4NotBindMobile(String memberEncode, String mobile, String remoteIp);
	/**
	 * ���ֻ��û�����ȡ��֤��
	 * @param memberid
	 * @param mobile
	 * @param remoteIp
	 * @return
	 */
	ResultCode getSecurityVerifyCode4BindMobile(String memberEncode, String mobile, String remoteIp);
	/**
	 * ��û�а��ֻ�����û��֧������ʱ�����а�æ�ֻ���֤��ʹ�ð��ֻ��߼�
	 * @param memberid
	 * @param mobile
	 * @param checkpass
	 * @param remoteIp
	 * @param sessid
	 * @return
	 */
	ResultCode checkSecurityVerify4Mobile(String memberEncode, String mobile, String checkpass, String remoteIp);
	
}
