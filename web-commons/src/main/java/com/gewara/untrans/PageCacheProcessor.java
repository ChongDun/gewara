package com.gewara.untrans;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface PageCacheProcessor {
	/**
	 * ���淢�Ͷ���
	 * @param params
	 */
	void sendMsgToDst(Map<String, String> params);
	/**
	 * �����ҳ��ǰ׺
	 * @return
	 */
	String getKeyPre();
	/**
	 * �Ƿ�����������Ȩ��
	 * @param request
	 * @return
	 */
	boolean canClear(HttpServletRequest request);
}
