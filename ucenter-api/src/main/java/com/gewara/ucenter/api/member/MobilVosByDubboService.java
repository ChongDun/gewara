package com.gewara.ucenter.api.member;
import com.gewara.support.ErrorCode;
/*
 * �����ֻ��š�tagУ����֤����dubboʵ�ֶ���Ľӿ�
 * ���
 * 2014��10��28��
 */
public interface MobilVosByDubboService {
	public ErrorCode<String> validateMobileCheckByTag(String mobile, String tag, String checkpass);
	public ErrorCode<String> sendMobileCheckByTag(String mobile, String tag,String ip);
  
}
