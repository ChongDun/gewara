package com.gewara.drama.dubbo.partner;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaCloseRuleVo;

public interface PartnerCloseVoService {

	/**
	 * ��ȡ��ǰ������Ч�Ĺ��˹���
	 * @return
	 */
	ResultCode<List<DramaCloseRuleVo>> getCloseList();
	
}
