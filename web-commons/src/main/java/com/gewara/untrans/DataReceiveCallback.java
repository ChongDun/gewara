package com.gewara.untrans;

import com.gewara.web.component.mon.DataReceiveController;

/**
 * ���ݽ���callback�����ɸ���ϵͳ�Լ�ʵ�ַ����߼�<br>
 * �����ַ���:<br>http://ip:{port}/data/receive.xhtml<br>
 * <p>
 * �������<p>{@link DataReceiveController#dataReceive(String, javax.servlet.http.HttpServletRequest)})}
 * @author quzhuping
 *
 */
public interface DataReceiveCallback {
	/**
	 * ��������
	 * <p>��ϵͳ���յ����ݺ���Ҫͨ���첽��������߼�
	 * @param jsonData
	 */
	void receiveData(String jsonData);
}
