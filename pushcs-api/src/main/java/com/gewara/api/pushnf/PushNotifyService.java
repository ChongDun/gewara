package com.gewara.api.pushnf;

import com.gewara.api.vo.PushNotifyVo;
import com.gewara.api.vo.ResultCode;

public interface PushNotifyService {
	public ResultCode<String> sendPushNotify(PushNotifyVo pushNotify);

	/**
	 * ������ϢΨһ��ʶȡ������
	 * 
	 * @param tradeNo
	 */
	public ResultCode<String> cancelPushNotify(String msgKey);

	public void sentPushNotify(PushNotifyVo notifyVo);
}
