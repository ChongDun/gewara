package com.gewara.ucenter.api.openlogin;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.OpenResultVo;

/**
 * APP��֧������½���API
 * 
 */
public interface OpenApiMobileAliVoService {
	
	ResultCode<OpenResultVo> aliUserDetail(String authcode, String userid,
			String appId, String remoteIp);
	/**
	 * ֧����Ǯ���û���¼ 
	 * @param accessToken
	 * @param remoteIp
	 * @return
	 */
	ResultCode<OpenResultVo> alipayLogin(String accessToken, String remoteIp);

}
