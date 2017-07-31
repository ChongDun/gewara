package com.gewara.ucenter.api.openlogin;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.OpenResultVo;

public interface BaiduAuthorizeVoService {
	
	/**
	 * �ٶ�������½��ȡ��ȨURL
	 * @param partnerName 
	 * @param callback
	 * @return
	 */
	ResultCode<String> getRedirectUrl(String callback);
	/**
	 * �ٶ�Web������½�ص�
	 * @param code
	 * @param callback
	 * @param remoteIp
	 * @return
	 */
	ResultCode<OpenResultVo> callBackWebLogin(String code, String callback, String remoteIp);
}
