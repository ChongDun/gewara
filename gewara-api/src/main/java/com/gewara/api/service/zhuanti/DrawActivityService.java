package com.gewara.api.service.zhuanti;

import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface DrawActivityService {

	/**
	 * ����ר��ģ��id��ȡ�齱��Ϣ
	 * @param drawId
	 * @return
	 */
	ResultCode<Map> findDrawDetailById(Long drawId);

}
