package com.gewara.api.service.gewacity;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.common.GewaCityVo;

/**
 * ����������Service
 *
 */
public interface GewaCityVoService {
	/**
	 * ����CityCode�����ȡGewaCity�б�
	 * @param cityCodes
	 * @return
	 */
	ResultCode<List<GewaCityVo>> getGewaCityListByCityCodes(String cityCodes);
	
	
	/**
	 * ��ȡ���г��б���
	 * @return
	 */
	ResultCode<List<String>> getCityCodes();
	
	/**
	 * ��ȡ��������
	 * @return
	 */
	ResultCode<Integer> getGewaCityCount();
	
}
