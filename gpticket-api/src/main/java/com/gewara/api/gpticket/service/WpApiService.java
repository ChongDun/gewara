package com.gewara.api.gpticket.service;

import com.gewara.api.vo.ResultCode;

public interface WpApiService {
	/**
	 * ��ȡ��Ŀ����
	 * @param onlineid
	 * @return
	 */
	ResultCode<String> getItem(String onlineid);
	/**
	 * ��ȡ��������
	 * @param venueid
	 * @return
	 */
	ResultCode<String> getVenue(String venueid);
}
