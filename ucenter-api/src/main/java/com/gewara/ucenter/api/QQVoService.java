package com.gewara.ucenter.api;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;
import com.gewara.ucenter.vo.sns.QQUserVo;

public interface QQVoService {
	/**
	 * QQ���ں��ֶ��󶨸������˺�
	 */
	ResultCode<MemberVo> bindQQGewa(String appkey, String userid, String unionid, String username, String password, String remoteIp);
	
	/**
	 * ����code��ȡQQ�û���Ϣ
	 */
	ResultCode<MemberVo> getUserByCode(String appkey, String code, String remoteIp);
	
	ResultCode<QQUserVo> getQQUserByCode(String appkey, String code);
	
	ResultCode<QQUserVo> getQQUserByUserid(String appkey, String userid, String unionid);
	
	/**
	 * ȡ����
	 */
	ResultCode cancelQQUser(String appkey, String userid);
	
	/**
	 * ��ȡQQ���ںŻỰtoken
	 */
	ResultCode<String> getAccessToken(String appkey);

}
