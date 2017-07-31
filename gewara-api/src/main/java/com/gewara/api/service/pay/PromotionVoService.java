package com.gewara.api.service.pay;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.pay.PromotionVo;

public interface PromotionVoService {
	/**
	 * ��ѯ�����Żݷ���
	 * @param relatedid
	 * @return
	 */
	ResultCode<PromotionVo> getSpecialDiscount(Long relatedid);
	/**
	 * ��ѯ�����Żݷ���
	 * @param relatedid
	 * @return
	 */
	ResultCode<PromotionVo> getSpecialDiscountByFlag(String flag);
	/**
	 * �ֻ����Ƽ����ؼۻ
	 * @param citycode
	 * @param partnerid
	 * @return
	 */
	ResultCode<List<PromotionVo>> getDefaultMobileSpecialDiscountList(String citycode, Long partnerid);
	/**
	 * ����tag�Ϳ������Ͳ�ѯ�ؼۻ
	 * @param tag
	 * @param opentype
	 * @return
	 */
	ResultCode<List<PromotionVo>> getSpecialDiscountList(String tag, String opentype);
	/**
	 * ��ѯһ��
	 * @param relatedid
	 * @return
	 */
	ResultCode<List<PromotionVo>> getSpecialDiscountListByIds(Long ... relatedid);
	
	/**
	 * ��ѯһ��
	 * @param relatedid
	 * @return
	 */
	ResultCode<List<PromotionVo>> getSpecialDiscountListByIdList(List<Long> idList);
	
}
