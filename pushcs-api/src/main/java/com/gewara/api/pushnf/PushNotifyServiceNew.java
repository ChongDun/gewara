package com.gewara.api.pushnf;

import com.gewara.api.vo.PushNotifyVo;
import com.gewara.api.vo.ResultCode;

public interface PushNotifyServiceNew {
	public ResultCode<String> sendPushNotify(PushNotifyVo pushNotify);
	/**
	 * ������ϢΨһ��ʶȡ������
	 * @param tradeNo
	 */
	public ResultCode<String> cancelPushNotify(String msgKey);
}
