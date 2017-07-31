package com.gewara.ucenter.api.openlogin;

import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;

/**
 * APP΢��������½���API
 * 
 */
public interface OpenApiMobileWeixinVoService {

	ResultCode<MemberVo> getUserByCodeForApp(String code,Long partnerid,String remoteIp);

	ResultCode<Map<String, Object>> getWeixinUser(String userid,Long partnerid);
	/**
	 * AndroidTV ɨ��
	 */
	ResultCode<Map<String,Object>> loginScan(String deviceId, String code, String state,String callBack, String remoteIp);
}
