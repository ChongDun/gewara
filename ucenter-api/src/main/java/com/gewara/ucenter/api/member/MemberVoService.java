package com.gewara.ucenter.api.member;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.ChargeVo;
import com.gewara.ucenter.vo.member.EncodeDataVo;
import com.gewara.ucenter.vo.member.MemberAccountVo;
import com.gewara.ucenter.vo.member.MemberInfoVo;
import com.gewara.ucenter.vo.member.MemberVo;
import com.gewara.ucenter.vo.member.PersonDescribes;

/**
 * �û���Ϣ�ӿ�
 * @author user
 *
 */
public interface MemberVoService {
	/**
	 * ��ѯ�û���Ϣ
	 * �˷�����ֳ� �����getUserInfo2�� gewara-api.jar TicketRollCallVoService.isTicketRollCallMember ���������
	 * @param mobile
	 * @return
	 */
	ResultCode<Map<String, Object>> getUserInfo2(Long memberid, String mobile, String email);
	ResultCode<MemberVo> getMemberVo(Long memberid);
	
	/**
	 * ������ѯ�û���Ϣ
	 * memberids<=1000
	 * @param memberids
	 * @return
	 */
	ResultCode<List<MemberVo>> getMemberVoList(Long... memberids);
	
	/**
	 * ��ѯ�û���Ϣ
	 * @param memberid
	 * @return
	 */
	ResultCode<MemberInfoVo> getMemberInfoVo(Long memberid);
	
	/**
	 * ��ѯ�û��б���Ϣ��memberids<=1000
	 * @param memberids
	 * @return
	 */
	ResultCode<List<MemberInfoVo>> getMemberInfoVoList(Long ... memberids);
	
	/**
	 * ��ȡ�ʻ��û���Ϣ
	 * @param memberid
	 * @return
	 */
	ResultCode<MemberAccountVo> getMemberAccountVoByMemberid(Long memberid);
	
	ResultCode updateMemberCount(Long memberid, String key, int value, boolean isAdd);
	
	/**
	 * ��ȡ�û���ͷ��
	 * @param memberid
	 * @return
	 */
	ResultCode<String> getCacheMemberHeadpic(Long memberid);
	/**
	 * ��ȡ�û�ͷ�񼯺� memberidList<=1000
	 * @param memberidList
	 * @return
	 */
	ResultCode<Map<Long, String>> getCacheHeadpicMap(Collection<Long> memberidList);
	/**
	 * ��ȡ�û�����Ϣ memberidList<=1000
	 * @param memberidList
	 * @return
	 */
	ResultCode<Map<Long, Map>> getCacheMemberInfoMap(Collection<Long> memberidList);
	ResultCode<Map> getCacheMemberInfo(Long memberid);
	/**
	 * ˢ���û�����
	 * @param memberid
	 * @return
	 */
	ResultCode<Map> resetMemberCache(Long memberid);
	/**
	 * �Ƿ�Ϊ��Ʊ�û�
	 * @param memberid
	 * @param tag
	 * @param id
	 * @return
	 */
	ResultCode<Boolean> isPlayMemberByTagAndId(Long memberid, String tag, Long id);
	ResultCode<Map> getPlayMemberByTagAndId(Long memberid, String tag, Long id);
	/**
	 * �����ֻ��Ż�ȡ�û��ǳơ���Աid
	 * mobileList.size()<=1000
	 */
	ResultCode<Map<Long, Map>> getMemberByMobile(List<String> mobileList);
	
	ResultCode<Integer> getUserChargeCount(Long memberid, Timestamp starttime, Timestamp endtime);
	ResultCode<List<ChargeVo>> getUserCharge(Long memberid, Timestamp starttime, Timestamp endtime, int from, int maxnum);
	/**
	 * @param mobile
	 * @return
	 */
	ResultCode<MemberInfoVo> getMemberInfoByMobile(String mobile);
	/**
	 * ��ȡ�����û��ĸ��˼��
	 * @param memberid
	 * @return
	 */
	ResultCode<String> getPersonDescribe(Long memberid);
	/**
	 * ��ȡһ���û��ĸ��˼��,memberidList.size()<=1000
	 * @param memberidList
	 * @return
	 */
	ResultCode<Map<Long,String>> getPersonDescribeByMemberidList(List<Long> memberidList);
	/**
	 * ������˼��
	 * @param memberid
	 * @param describe
	 * @return
	 */
	ResultCode savePersonDescribe(Long memberid, String describe, String source);
	
	ResultCode<PersonDescribes> getPersonDescribeMap(Long memberid);
	
	/**
	 * �����ֻ������ȡ�û���Ϣ
	 * @param mobile �û��ֻ�����
	 */
	ResultCode<MemberVo> getMemberVoByMobile(String mobile);
	
	/**
	 * ���������ַ��ȡ�û���Ϣ
	 * @param email ע�������ַ
	 */
	ResultCode<MemberVo> getMemberVoByEmail(String email);
	
	/**
	 *  �Ƿ���Ҫ�ֻ����Ű�ȫ��֤
	 * @param securityCode
	 * @param deviceId
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> isMobileSecurityVerify(String securityCode, String deviceId, Long memberid);
	/**
	 * �����ֻ����Ű�ȫ��֤
	 * @author qilun
	 * Feb 23, 2016
	 * @param deviceId
	 * @param memberid
	 * @return
	 */
	ResultCode<String> addMobileSecurityVerify(String deviceId, Long memberid);
	/**
	 * ��ȡ�ֻ����ж��������Ϣ�������룬����룩
	 * @param deviceId
	 * @param memberid
	 * @return
	 */
	ResultCode<Map<String, String>> getMobileSecurityUpdata(String deviceId, Long memberid);
	/**
	 * ͨ���������еķ�ʽ�����ֻ����Ű�ȫ��֤
	 * @param deviceId
	 * @param memberid
	 * @return
	 */
	ResultCode<String> addMobileSecurityVerify4MobileUpdata(String deviceId, Long memberid);

	/**
	 * @function �û��ֻ���Ψһ�Լ��
	 */
	boolean isMemberMobileExists(String mobile); 
	
	/**
	 * ���ֻ�
	 * @param member
	 * @param mobile
	 * @param checkpass
	 * @param ip
	 * @return
	 */
	ResultCode<MemberVo> bindMobile(Long memberid, String mobile, String checkpass, String remoteIp, boolean isInitBind);

	/**
	 * ����ֻ���
	 * @param member
	 * @param dynamicCode
	 * @param remoteIp
	 * @return
	 */
	ResultCode unbindMobile(Long memberid, String checkpass, String remoteIp);

	/**
	 * �ж��Ƿ���Emai���ǳ���ͬ���û�
	 * @param emailOrNicknameOrMobile
	 * @param memberId
	 * @return
	 */
	ResultCode<Boolean> isMemberExistsByEmail(String emailOrNickname, Long memberId);


	/**
	 * �ǲ��ܽ�������ֻ���
	 * @param member
	 * @return
	 */
	ResultCode<Boolean> canChangeMobile(Long memberid);
	
	/**
	 * ͨ��emailȡ�û�
	 * @param email
	 * @return
	 */
	ResultCode<MemberVo> getMemberByEmail(String email);
	
	ResultCode<MemberVo> isValidMemberPass(String loginName, String plainPass, String ip, String userAgent, String ckcitycode, String port);

	/**
	 * ��������
	 */
	ResultCode<MemberInfoVo> saveNewTask(Long memberid, String newtask);
	
	/**
	 * �����ֻ������ѯ�û�
	 * @param mobile
	 * @return
	 */
	ResultCode<MemberVo> getMemberByMobile(String mobile);
	
	ResultCode<Integer> getInviteCountByMemberid(Long memberid, Timestamp startTime, Timestamp endTime);
	
	ResultCode updateMemberInfo(Long memberid, String nickname, String sex, String realname);

	ResultCode<MemberInfoVo> updateHeadPic(Long memberid, String headpic);
	
	/**
	 * �޸��û�����
	 * @param member
	 * @param password  ���������
	 * @param remoteIp  IP
	 * @param isBind2Gewara  ������¼�û���Gewara�˺�
	 * @param from  ��Դ
	 * @return 
	 */
	ResultCode changePassword(Long memberid, String password, String remoteIp, String from);

	ResultCode<MemberInfoVo> addMemberOtherInfo(Long memberid, String tag, String value);	
	/**
	 * �޸��û���Ҫ���ж�����֤
	 * @param memberid
	 * @return
	 */
	ResultCode updateMemberNeedValidSetY(Long memberid);
	/**
	 * �ɹ�������Ѵ����������Ѱ��ֻ�
	 * @return
	 */
	ResultCode<Integer> getInviteCount(String invitetype, Long inviteid);
	/**
	 * ����ԭ�����޸�������
	 * @param memberid		�û�id
	 * @param password		ԭ����
	 * @param password1		������
	 * @param password2		ȷ��������
	 * @param ip		
	 * @param from			����mapping
	 * @param encodeOrSessid ˢ��
	 * @return
	 */
	ResultCode changePasswordByOldpass(Long memberid, String password, String password1, String password2, String ip, String from, String encodeOrSessid);
	/**
	 * 
	 * @param tag
	 * @param mobile
	 * @param checkpass
	 * @param newpwd
	 * @param repassword
	 * @param ip
	 * @param from
	 * @param encodeOrSessid
	 * @return
	 */
	ResultCode<MemberVo> changePasswordByMobileCode(String tag, String mobile, String checkpass, String newpwd, String repassword, String ip, String from, String encodeOrSessid);
	/**
	 * �Ƿ���������Ч����֤
	 * @param memberEncode
	 * @param doValidate
	 * @return
	 */
	ResultCode<EncodeDataVo> getMemberEncodeDataVo(String memberEncode, boolean doValidate);
	/**
	 * �����ʼ�encode�޸�����
	 * @param memberid 	�û�id
	 * @param email		������
	 * @param random		���ܲ���
	 * @param encode		
	 * @param ip
	 * @param encodeOrSessid
	 * @return
	 */
	ResultCode exchangeEmail(Long memberid, String email, String random, String encode, String ip, String encodeOrSessid);
	/**
	 * ���������޸��ʼ�
	 * @param memberid
	 * @param email1
	 * @param email2
	 * @param password
	 * @param ip
	 * @return
	 */
	ResultCode sendExchangeEmail(Long memberid, String type, String email1, String email2, String password, String ip);
}
