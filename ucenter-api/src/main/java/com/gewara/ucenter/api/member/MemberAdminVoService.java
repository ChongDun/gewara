package com.gewara.ucenter.api.member;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberOperationVo;
import com.gewara.ucenter.vo.member.MemberVo;

public interface MemberAdminVoService {
	/**
	 * ��ȡ�û���Ϣ��˼�¼
	 * @param memberid
	 * @return
	 */
	ResultCode<List<MemberOperationVo>> getMemberOperationVoList(MemberOperationVo queryVo, Integer startIndex, Integer pageSize);
	ResultCode<String> getFixedKeywords();
	ResultCode<String> getManualKeywords();
	ResultCode<String> getMemberKeywords();
	/**
	 * ����˼�¼����
	 * @param queryVo
	 * @return
	 */
	ResultCode<Integer> getApplyMemberOperationCount();
	
	ResultCode saveOrUpdateMemberOperationVo(MemberOperationVo memberOperationVo);
	
	ResultCode<MemberVo> updateMemberPassword(MemberOperationVo mo, Long auditUserid, String remoteIp);
}
