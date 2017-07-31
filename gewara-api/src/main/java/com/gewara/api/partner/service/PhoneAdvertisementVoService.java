package com.gewara.api.partner.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.partner.res.vo.PhoneAdvertisementVo;
import com.gewara.api.vo.ResultCode;

public interface PhoneAdvertisementVoService {
	/**
	 * ��ѯ�Ƽ��
	 * @param id �ID
	 * @return
	 */
	ResultCode<PhoneAdvertisementVo> getPhoneAdverVo(Long id);
	/**
	 * �������β�ѯ�����б�
	 * @param batchid ����ID
	 * @return
	 */
	ResultCode<Map<String, Long>> getCitycodesByBatchid(String batchid);
	/**
	 * ���ݹ���ID��ȡ���й����
	 * @param adverId
	 * @param sourceId
	 * @return
	 */
	ResultCode<List<Map<String, String>>> getLinkedListBySourceId(Long adverId, Long sourceId);
	/**
	 * ȡ��ͬ�ȼ���а�����citycode�ĻID
	 * @param adverId
	 * @param citycode
	 * @return
	 */
	ResultCode<Long> getSameLevelIdByCitycode(Long adverId, String citycode);
	
	/**
	 * ��ѯ����б�
	 * @param apptype
	 * @param osType
	 * @param citycode
	 * @param advtype
	 * @return
	 */
	ResultCode<List<PhoneAdvertisementVo>> getPhoneAdvertList(String apptype, String osType,String citycode,String advtype);
	
}
