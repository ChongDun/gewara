package com.gewara.api.service.movie;

import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface CityRoomCharacteristicVoService {
	/**
	 * ����id(cityCode)��ѯ����Ӱ����ɫ
	 * @param cityCode
	 * @return
	 */
	ResultCode<Map<String,String>> getCharacteristicRoomById(String cityCode);
}
