package com.gewara.partner2.dubbo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.partner2.vo.AdvertCommendVo;
import com.gewara.partner2.vo.CinemaConstraintVo;
import com.gewara.partner2.vo.DistributionPartnerVo;
import com.gewara.partner2.vo.PartnerVo;
import com.gewara.partner2.vo.PaymethodIconVo;
import com.gewara.partner2.vo.ShareBenefitVo;
import com.gewara.partner2.vo.WpConfigVo;

/**
 * (wapվ Զ�̷���)
 * @author chunhui.wang
 */
public interface WpVoService {
	/**
	 * (��ȡ����֧����ʽ��ͼ��)
	 * @return
	 */
	ResultCode<List<PaymethodIconVo>> getPaymethodIconsVoList();
	
	/**
	 * (����֧����ʽ��ȡ֧��ͼ��)
	 * @param params	�������
	 * @return
	 */
	ResultCode<String> getPayIconByPayMethod(Map<String, Object> params);
	
	ResultCode<WpConfigVo> getWpConfig(Serializable id);
	
	PartnerVo loadAdminPartnerByAppkey(String appkey, boolean reload);
	
	ResultCode<List<AdvertCommendVo>> getAdvertCommendList(String appkey, String citycode);
	
	/**
	 * ��ȡ����ϵͳ������ (��partnerIdΪ0 �����partnerKey��ѯ,�������partnerID��ѯ)
	 * @param partnerid	������ID[�ز� Ĭ��ֵ��0]
	 * @param partnerKey	������key[��ѡ �����]
	 * @return
	 */
	ResultCode<DistributionPartnerVo> getPartnerByIdOrKey(long partnerId,String partnerKey);
	
	/**
	 * ��ȡ���к�����
	 * @return
	 */
	ResultCode<List<DistributionPartnerVo>> gainDistributionPartnerList();
	
	/**
	 * ��ȡ����Լ��
	 * @param partnerKey	������key
	 * @param hidetype		�������͡����գ�������partnerkey��ѯ��	1 ӰԺ  2 �߼� 3 ʱ��
	 * @return
	 */
	ResultCode<List<CinemaConstraintVo>> getCinemaConstraintList(String partnerKey, String hidetype);
	
	/**
	 * �����¼
	 * @param shareBenefitVo
	 * @return
	 */
	ResultCode<String> shareBenefitRecord(ShareBenefitVo shareBenefitVo);
}