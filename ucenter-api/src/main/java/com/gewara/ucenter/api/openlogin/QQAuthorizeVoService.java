package com.gewara.ucenter.api.openlogin;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;
import com.gewara.ucenter.vo.member.OpenResultVo;

public interface QQAuthorizeVoService {
	/**
	 * ������½��ȡ��ȨURL
	 * @param partnerName 
	 * @param callback
	 * @return
	 */
	ResultCode<String> getRedirectUrl(String partnerName, String callback);
	
	/**
	 * WAP������½�ص�
	 * @param code
	 * @param callback
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> callBackLogin(String code,String callback, String remoteIp);
	
	/**
	 * PC������½�ص�
	 * @param code
	 * @param callback
	 * @param remoteIp
	 * @return
	 */
	ResultCode<OpenResultVo> callBackWebLogin(String code, String callback, String type, String sessid, String remoteIp);
}
