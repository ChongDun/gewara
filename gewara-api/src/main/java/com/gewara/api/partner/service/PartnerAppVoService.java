package com.gewara.api.partner.service;

import java.util.List;

import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.partner.res.vo.OpenCityVo;
import com.gewara.api.partner.res.vo.PhoneActivityVo;
import com.gewara.api.partner.res.vo.UpGradeVo;
import com.gewara.api.partner.res.vo.WeiXinAdVo;
import com.gewara.api.vo.ResultCode;

public interface PartnerAppVoService {
	/**
	 * Ϊapp��wap�����������
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> addComplain(PartnerCommonReqVo reqVo);
	/**
	 * app�����ӿ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<UpGradeVo> getUpGrade(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ�ֻ���������
	 * @param reqVo
	 * @return
	 */
	ResultCode<PhoneActivityVo> getPhoneActivity(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ�ֻ������б�
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<PhoneActivityVo>> getPhoneActivityList(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ΢�Ż�������
	 * @param reqVo
	 * @return
	 */
	ResultCode<WeiXinAdVo> getWeiXinAd(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ���Ź�Ʊ�ĳ���
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<OpenCityVo>> getOpenCity(PartnerCommonReqVo reqVo);
}
