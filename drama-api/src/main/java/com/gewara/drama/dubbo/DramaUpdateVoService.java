package com.gewara.drama.dubbo;

import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.order.DramaOrderContainerVo;

public interface DramaUpdateVoService {

	/**
	 * ����ͳ��
	 * @param orderid
	 * @return
	 */
	ResultCode<DramaOrderContainerVo> updateStatistics(String tradeno);
	
	/**
	 * ����ͳ�ƣ��£�
	 * @param orderid
	 * @return
	 */
	ResultCode updateDramaStatistics(String tradeno);
	
	/**
	 * ����ͳ�ƣ�openapi��
	 * @param tag
	 * @param relatedid
	 * @param data
	 * @return
	 */
	ResultCode updateDramaData(String tag, Long relatedid, Map<String, Integer> data);
}
