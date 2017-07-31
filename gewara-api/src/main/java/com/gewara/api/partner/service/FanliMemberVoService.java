package com.gewara.api.partner.service;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.partner.FanliMemberVo;

public interface FanliMemberVoService {
	/**
	 * ����id��ȡ�������û���Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<FanliMemberVo> getFanliMemberById(Long id);
	/**
	 * ���·������û���Ϣ
	 */
	ResultCode<Boolean> updateFanliMember(FanliMemberVo member);
}
