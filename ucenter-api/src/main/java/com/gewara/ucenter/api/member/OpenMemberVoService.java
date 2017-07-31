package com.gewara.ucenter.api.member;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.support.ErrorCode;
import com.gewara.ucenter.vo.member.MemberRegInfoVo;
import com.gewara.ucenter.vo.member.MemberVo;
import com.gewara.ucenter.vo.member.OpenMemberVo;

/**
 * �ⲿ�̼Һ�����¼�˺���Ϣ�ӿ�
 * 
 * @author shenlibin
 */
public interface OpenMemberVoService {
	/**
	 * ����source,loginName��ѯ������¼�û�
	 * 
	 * @param source
	 * @param loginName
	 * @return
	 */
	ResultCode<OpenMemberVo> getOpenMemberByLoginname(String source, String loginName);

	/**
	 * ������������¼�ӿ�
	 * 
	 * @param source
	 * @param citycode
	 * @param loginName
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> partnerJointLogin(String source, String citycode, String loginName, String remoteIp);
	/**
	 * ����memberid��ȡ���������˻�
	 * @param memberid
	 * @return
	 */
	ResultCode<List<OpenMemberVo>> getOpenMemberListByMemberid(Long memberid);
	/**
	 * ����udi��ȡ���������˻�
	 * uidList.size()<=1000
	 * @param source
	 * @param 
	 * @return
	 */
	ResultCode<Map<Long, Map>> getOpenMemberByUidList(String source, List<String> uidList);
	/**
	 * ����memberid��ȡ���������˻�
	 * @param memberid
	 * @param source
	 * @return
	 */
	ResultCode<List<OpenMemberVo>> getOpenMemberListByMemberidSource(Long memberid, String source);
	
	/**
	 * �޸Ŀ����˻���Ϣ
	 * @param openMemberVo
	 * @param unionid
	 * @param cloumn ��� ����Ҫ�޸ĵĶ��������б�
	 * @return
	 */
	ResultCode<OpenMemberVo> updateOpenMember(OpenMemberVo openMemberVo,String unionid, String [] cloumn);
	@Deprecated
	ErrorCode<MemberRegInfoVo> regMemberWithMobile1(String nickname, String mobile, String password, String checkpass, Long inviteid, String invitetype, String regfrom, String ip);
	@Deprecated
	ErrorCode<MemberRegInfoVo> createMemberWithBindMobile1(String mobile, String checkpass, String ip);
	
	ResultCode<MemberRegInfoVo> regMemberWithMobile2(String nickname, String mobile, String password, String checkpass, Long inviteid, String invitetype, String regfrom, String ip);
	
	ResultCode<MemberRegInfoVo> createMemberWithBindMobile2(String mobile, String checkpass, String ip);	
	
	/**
	 * �������˻������
	 * @param memberid �û�id
	 * @param source ��������ʶ
	 * @param reson  ԭ��
	 * @param adminid  ��̨������id
	 * @param adminname   ��̨����������
	 * @return
	 */
	ResultCode cancelOpenMemberBySource(Long memberid, String source, String reson, Long adminid, String adminname);
}
