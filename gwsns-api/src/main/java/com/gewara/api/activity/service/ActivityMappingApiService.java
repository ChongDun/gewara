package com.gewara.api.activity.service;

import java.util.List;

import com.gewara.api.vo.ResultCode;

public interface ActivityMappingApiService {
	/**
	 * ��ȡ������Ķ����б�
	 * @param activityid �ID
	 * @param tag ���������
	 */
	public ResultCode<List<Long>> getRelatedIds(Long activityid, String tag);
}
