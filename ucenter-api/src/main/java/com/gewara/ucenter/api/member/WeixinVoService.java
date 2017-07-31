package com.gewara.ucenter.api.member;

import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;
import com.gewara.ucenter.vo.member.WeixinUserVo;

public interface WeixinVoService {
	/**
	 * ��΢���˻����Ѵ��ڵĸ������˻�
	 * ��Ҫ����¼����
	 * @param appkey
	 * @param userid
	 * @param unionid
	 * @param username
	 * @param password
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> bindWeixin2Gewa(String appkey, String userid, String unionid, String username, String password, String remoteIp);
	/**
	 * ͨ��code��ѯ�Ƿ�󶨸������˻�
	 * ��Ҫ����¼����
	 * @param appkey
	 * @param code
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> getUserByCode(String appkey, String code, String remoteIp);
	
	/**
	 * ����code
	 * @param appkey
	 * @param code
	 * @return
	 */
	ResultCode<WeixinUserVo> getWeixinUserByCodeOnlyGet(String appkey, String code);
	/**
	 * ����code��¼��������΢���û���Ϣ
	 * @param appkey
	 * @param code
	 * @return
	 */
	ResultCode<WeixinUserVo> getWeixinUserByCode(String appkey, String code);
	/**
	 * ����userid��ȡ΢���û�
	 * @return
	 */
	ResultCode<WeixinUserVo> getWeixinUserByUserid(String appkey, String userid, String unionid);
	/**
	 * ȡ����
	 * @return
	 */
	ResultCode cancelWeixinUser(String appkey, String userid);
	
	/***
	 * ����openmember����¼
	 * ��Ҫ����¼����
	 * @param openid ������¼�ش�
	 * @param unionid ������¼�ش�
	 * @param headiPic
	 * @param nickname
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> createMemberAndBindWeixinUser(String openid, String unionid, String headiPic, String nickname, String remoteIp) ;
	/***
	 * ��΢���˻�
	 * ��Ҫ����¼����
	 * @param username
	 * @param password
	 * @param openid
	 * @param unionid
	 * @param headiPic
	 * @param nickname
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> bindOpenMember2Member (String username,String password, String openid, String unionid, String headiPic, 
			String nickname, String remoteIp);
	
	ResultCode<MemberVo> createOpenmemberByCodeOnlyOpenid(String code, String citycode, String appkey, String remoteIp);
	/**
	 * ���˻�
	 * ��Ҫ����¼����
	 * @param appkey
	 * @param code
	 * @param uuid ���ڻص���Ϣ��ѯ��
	 * @param remoteIp
	 * @return
	 */
	ResultCode<Map<String, Object>> bindMemberByCode(String appkey, String code,String uuid, String remoteIp);

	/**
	 * �˻��ϲ�
	 * @param uuid currentMemberId
	 * @param unionid bandMemberId
	 * @return
	 */
	ResultCode<Map<String,Object>> mergerMember(String uuid,String unionid,String remoteIp);
	
}
