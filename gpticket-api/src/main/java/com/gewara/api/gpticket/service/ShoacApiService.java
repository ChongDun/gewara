package com.gewara.api.gpticket.service;

import com.gewara.api.vo.ResultCode;

public interface ShoacApiService {
	/**
	 * ��ȡ���ճ���Ʊ����Ϣ
	 * @param sceneid
	 * @return
	 */
	ResultCode<String> getPrintContent(String sceneid);

}
