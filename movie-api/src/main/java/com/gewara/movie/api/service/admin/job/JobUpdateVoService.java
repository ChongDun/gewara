package com.gewara.movie.api.service.admin.job;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

/**
 * �����������Զ�ʱ���������
 */
public interface JobUpdateVoService {
	ResultCode<Integer> updateCityprice(List<Map> result, String tag);
}
