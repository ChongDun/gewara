package com.gewara.api.service.common;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.common.CountyVo;
import com.gewara.api.vo.common.GewaCityVo;

public interface CommonVoService {
	ResultCode<List<GewaCityVo>> getAllGewaCityList();

	/**
	 * ��ȡ������Ϣ
	 * @param citycode
	 * @return
	 */
	ResultCode<List<CountyVo>> getCountyListByCitycode(String citycode);
	/**
	 * �õ��Ƿ��ؼ���
	 * @param content
	 * @return
	 */
	ResultCode<String> filterContentKey(String content);
	
	/**
	 * ����id��ȡ��ͼģ��
	 * @param id
	 * @return
	 */
	ResultCode<Map> getDataById(String id);
	/**
	 * ����id��ȡ����ģ��
	 * @param id
	 * @return
	 */
	ResultCode<Map> getFanPingDataById(String id);

	ResultCode<List<GewaCityVo>> getAllGewaCity();
}
