package com.gewara.push.api.service;
import com.gewara.api.vo.ResultCode;
import com.gewara.push.api.req.vo.PushNotifyNewVo;
/**
 * (���ͷ���ӿ�)
 * @author chunhui.wang
 */
public interface PushVoService {
	
	/**
	 * (���豸-��Ϣ����)
	 * @param pushNotifyVo	���Ͷ���
	 * @return
	 */
	ResultCode<String> sendPushNotify(PushNotifyNewVo pushNotifyVo);
	
	/**
	 * ������Ϣȡ��
	 * @param msgkey
	 * @return
	 */
	ResultCode<String> cancelPushNotify(String msgkey);
}