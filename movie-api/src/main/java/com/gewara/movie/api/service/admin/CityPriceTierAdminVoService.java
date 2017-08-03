package com.gewara.movie.api.service.admin;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface CityPriceTierAdminVoService {
	
	/**
	 * ����idɾ�������������
	 * @param cityCode
	 * @return
	 */
	ResultCode removeCityPriceTierById(String cityCode);
	
	/**
	 * ����/���³����������
	 * @param cityPriceTier
	 */
	ResultCode saveOrUpdateCityPriceTier(Map cityPriceTier);
	
	/**
	 * ��ȡ���г����������
	 * @return
	 */
	ResultCode<List<Map>> getAllCityPriceTier();
	
	/**
	 * ����id(citycode)��ѯ�����������
	 * @param citycode
	 * @return
	 */
	ResultCode<Map> getCityPriceTierById(String citycode);
}
