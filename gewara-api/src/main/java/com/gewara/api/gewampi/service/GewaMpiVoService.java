package com.gewara.api.gewampi.service;

import java.util.List;

import com.gewara.api.gewampi.vo.GoodsGiftVo;
import com.gewara.api.gewampi.vo.PartnerCloseRuleVo;
import com.gewara.api.vo.ResultCode;

public interface GewaMpiVoService {
	/**
	 * ��ȡ���γ��εĹ���
	 * @return
	 */
	ResultCode<PartnerCloseRuleVo> getPartnerCloseRuleVoById(Long id);
	/**
	 * ��ȡ�󶨵��ײ��б�
	 * @return
	 */
	ResultCode<List<GoodsGiftVo>> getGoodsGiftList();
	/**
	 * ��ȡ�󶨵��ײ�
	 * @param id
	 * @return
	 */
	ResultCode<GoodsGiftVo> getGoodsGiftById(Long id);
}
