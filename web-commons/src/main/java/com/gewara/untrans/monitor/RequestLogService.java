package com.gewara.untrans.monitor;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.support.ServletRequestHandledEvent;

public interface RequestLogService {

	/**
	 * ��¼��־��Ϣ
	 * @param uri
	 * @param params
	 * @param ip
	 */
	void logRequest(String ip, String uri, Map<String, String> params, HttpServletRequest req, ServletRequestHandledEvent event);
	/**
	 * @param uri
	 * @param referer
	 * @param xForwardedHost
	 * @param params
	 * @param isAjaxReq
	 * @param uvKey
	 * @param memberKey
	 */
	void logRequest(String ip, String uri, String referer, String userAgent, String xForwardedHost, Map<String, String> params, String isAjaxReq, String uvKey, String memberKey);
	
	/**
	 * ���Ե����йؼ�����
	 * @return
	 */
	void addSensitiveWords(String sensitive);
	
	/**
	 * ���Ե�uri�����uri�������*���ţ����ʾƥ��ǰ׺
	 * @return
	 */
	void addIgnoreUriList(List<String> ignoreUriList);


}
