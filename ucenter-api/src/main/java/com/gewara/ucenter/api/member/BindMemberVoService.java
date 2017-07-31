package com.gewara.ucenter.api.member;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberMergerHisVo;


public interface BindMemberVoService {
	/**
	 * �����û�ID���Ҹ��˻��Ƿ��кϲ��˺������¼
	 * @param memberId
	 * @return
	 */
	ResultCode<MemberMergerHisVo> checkMemberApply(Long memberId);
	/**
	 * �ϲ��˻�
	 * @param masterMemberId ���˺�
	 * @param branchMemberId ��֧�˺�
	 * @return
	 */
	ResultCode mergerMember(Long masterMemberId, Long branchMemberId);
	/**
	 * ��ѯ�ϲ���¼
	 * @param id
	 * @return
	 */
	ResultCode<MemberMergerHisVo> getMemberMergerHisVo(Long id);
	/**
	 * ����ϲ�����
	 * @param id
	 * @param bindStep
	 * @param otherinfo
	 * @return
	 */
	ResultCode updateMemberMergerHisBindStep(Long id, Long bindStep, String otherinfo);
}
