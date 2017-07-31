package com.gewara.api.partner.service;

import java.util.List;

import com.gewara.api.partner.res.vo.PartnerCloseRuleVo;
import com.gewara.api.vo.ResultCode;



/**
 * �̻��رչ���
 */
public interface PartnerCloseRuleVoService {
	
	/**
	 * ��ȡ���ڵ�ǰʱ����̻��رչ���
	 * @return
	 */
	ResultCode<List<PartnerCloseRuleVo>> getCloseRuleListByCurrentTime();
	
	/**
	 * ����ID��ѯ�̻��رչ���
	 * @param ruleId
	 * @return
	 */
	ResultCode<PartnerCloseRuleVo> getCloseRuleByRuleId(Long ruleId);
}
