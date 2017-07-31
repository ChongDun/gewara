package com.gewara.ucenter.api.member;

import com.gewara.api.vo.ResultCode;

public interface BindMobileVoService {
	/**
	 * δ��¼ǰ����֤��
	 * @param tag
	 * @param mobile
	 * @param ip
	 * @return
	 */
	ResultCode refreshDynamicCode(String tag, String mobile, String ip);
	/**
	 * ����ˢ����֤��
	 * @param tag
	 * @param mobile
	 * @return
	 */
	ResultCode refreshDynamicCode(String tag, String mobile, String ip, Long memberid);
	
	ResultCode refreshBindMobile1(String mobile, Long memberid, String ip);
	ResultCode refreshBindMobile2(String mobile, Long memberid, String ip, String msgTemplate);
	ResultCode refreshChangeMobile(String newmobile, Long memberid, String ip);
	
	/**
	 * ���Գɹ������ֱ������
	 * @param tag
	 * @param mobile
	 * @param checkpass
	 * @return ERRORCODE�����֣������Ի�ʧЧ��ǰ̨����
	 */
	ResultCode checkBindMobile(String tag, String mobile, Long memberid, String checkpass);
	/**
	 * δע�ᣨ��δ��¼ǰ������֤���
	 * @param tag
	 * @param mobile
	 * @param checkpass
	 * @return
	 */
	ResultCode checkDynamicCode(String tag, String mobile, String checkpass);
	/**
	 * Ԥ�ȼ�⣬������1
	 * @param tag
	 * @param mobile
	 * @param checkpass
	 * @return
	 */
	ResultCode preCheckBindMobile(String tag, String mobile, Long memberid, String checkpass);

	ResultCode<Boolean> getAndUpdateToken(String type, String ip, int checkcount);
	ResultCode<Boolean> isNeedToken(String type, String ip, int checkcount);

	/**
	 * �˺Żظ�������֤
	 * @param mobile
	 * @param ip
	 * @return
	 */
	ResultCode refreshSMSValid(String mobile, String ip);
	/**
	 * ����ˢ����֤��(drama)
	 * @param tag
	 * @param mobile
	 * @param ip
	 * @param memberid
	 * @param type
	 * @return
	 */
	ResultCode refreshDynamicCode(String tag, String mobile, String ip, Long memberid, String type);

}
