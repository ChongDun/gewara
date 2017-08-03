package com.gewara.api.sms.service;

import java.sql.Timestamp;

import com.gewara.api.vo.ResultCode;

public interface VoiceCodeVoService {
	/**
	 * ��������������֤��
	 * @param mobile
	 * @param checkcode
	 * @param memberid
	 * @param ip
	 * @param validtime
	 * @param tag
	 * @return
	 */
	ResultCode sendVoiceCode(String mobile, String checkcode, Long memberid, String ip, Timestamp validtime);
	ResultCode sendVoiceCode(String mobile, String checkcode, Long memberid, String ip, Timestamp validtime, String tag);
	
}
