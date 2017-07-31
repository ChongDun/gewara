package com.gewara.api.service.common;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.common.CityVo;
import com.gewara.api.vo.common.CountyVo;
import com.gewara.api.vo.common.IndexareaVo;
import com.gewara.api.vo.common.ProgramInfoVo;
import com.gewara.api.vo.common.ProvinceVo;

public interface PlaceVoService {
	/**
	 * ��ȡʡ���б�
	 * @return
	 */
	ResultCode<List<ProvinceVo>> getProvinceList();
	/**
	 * ����ʡ�ݻ�ȡ�����б�
	 * @return
	 */
	ResultCode<List<CityVo>> getCityListByProvincecode(String provincecode);
	/**
	 * ͨ�����б����ȡ��ͨ·��(key=id, value=name)
	 * @param citycode
	 * @return
	 */
	ResultCode<Map<String, String>> getSubwaylineMap(String citycode);
	
	/**
	 * ��ȡ��Ŀ��Ϣ
	 * @deprecated ����Ŀ�Լ�ʵ��
	 * @param category
	 * @param categoryid
	 * @return
	 */
	ResultCode<ProgramInfoVo> getProgramInfo(String category, Long categoryid);
	
	
	/**
	 * ���ݳ��л�ȡ�����б�
	 * 
	 * @param appkey
	 * @param citycode
	 * @return
	 */
	ResultCode<List<CountyVo>> countyList(String citycode);

	/**
	 * �������ر����ȡ��������
	 * 
	 * @param appkey
	 * @param countyCodes
	 * @return
	 */
	ResultCode<List<CountyVo>> countyListBycodes(List<String> countyCodes);

	/**
	 * ���е�������Ȧ
	 * 
	 * @param appkey
	 * @param citycode
	 * @return
	 */
	ResultCode<List<IndexareaVo>> hotIndexareaList(String citycode);
	
	/**
	 * �����̿��ŵĳ����б�
	 * 
	 * @param appkey
	 * @return
	 */
	ResultCode<Map<String, List<CityVo>>> cityList(String appkey);
	
	/**
	 * ��ȡʡ��
	 * @return
	 */
	ResultCode<ProvinceVo> getProvince(String provincecode);
}
