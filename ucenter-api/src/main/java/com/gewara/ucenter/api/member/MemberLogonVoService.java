package com.gewara.ucenter.api.member;

import java.sql.Timestamp;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberVo;

public interface MemberLogonVoService {
	/**
	 * ����sessid��ip��½
	 * @param sessid
	 * @param ip
	 * @return
	 */
	ResultCode<MemberVo> getLogonMemberBySessid(String sessid, String ip);
	/**
	 * TODO:������ĺϲ�
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> getLogonMemberByMemberEncodeAndIp(String memberEncode, String remoteIp); 
	/**
	 * ����memberEncode��½
	 * @param memberEncode
	 * @return
	 */
	ResultCode<Long> getMemberIdByMemberEncode(String memberEncode);
	/**
	 * ͨ���û����������½
	 * @return
	 */
	ResultCode<MemberVo> loginByNameAndPwd(String appkey, String citycode, String username, String password, String remoteIp);
	/**
	 * �ֻ���ע��
	 * @return
	 */
	ResultCode<MemberVo> mobileReg(String appkey, String citycode, String mobile, String password, String dynamicNumber, String remoteIp);
	/**
	 * ��ȡע���ֻ��Ŷ�̬��
	 * @return
	 */
	ResultCode getRegDynamicNumber(String mobile, String remoteIp);
	/**
	 * ��ȡ�һ�֧�����붯̬��
	 * @return
	 */
	ResultCode getModifyPwdDynamicNumber(String mobile, String remoteIp);
	/**
	 * ͨ���ֻ���̬���޸�����
	 * @return
	 */
	ResultCode modifyPwdByDynamicNumber(String mobile, String password, String dynamicNumber, String remoteIp);
	/**
	 * ��̬���¼
	 * @param mobile
	 * @param ip
	 * @return
	 */
	ResultCode<String> sendLoginDynamiccode(String mobile, String ip);
	/**
	 * ���ݶ�̬���¼
	 * @param mobile
	 * @param checkpass
	 * @param ip
	 * @param citycode
	 * @return
	 */
	ResultCode<MemberVo> loginByDynamiccode(String mobile, String checkpass, String ip, String citycode);
	/**
	 * ����΢��������½
	 * @param reqVo
	 * @return
	 */
	ResultCode<MemberVo> openMemberLoginBySina(String userid, String accessToken, String remoteIp);
	/**
	 * ����������½
	 * @param userid(���ܵ�userid����Ҫ��������)
	 * @return
	 */
	ResultCode<MemberVo> openMemberLoginByBankcomm(String userid, String remoteIp);
	
	/**
	 * ����������½�û�ͨ��json
	 * @param requestJson
	 * @return
	 */
	ResultCode<MemberVo> openMemberLoginByJson(String source, String requestJson, String remoteIp);
	/**
	 * ����������½�û�ͨ��3des����
	 * @param content_encrypt
	 * @return
	 */
	ResultCode<MemberVo> openMemberLoginByEncrypt(String appkey, String content_encrypt, String remoteIp);
	/**
	 * �����û�������¼
	 */
	ResultCode<MemberVo> chubaoMemberLogin(String userid, String remoteIp);
	/**
	 * ����MemberEncode���µ�¼
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> doLoginByMemberEncode(String memberEncode, String remoteIp);
	/**
	 * @deprecated systemSource unused, get it from dubbo filter
	 * @param memberEncode
	 * @param remoteIp
	 * @param systemSource
	 * @return
	 */
	ResultCode<MemberVo> doLoginByMemberEncode(String memberEncode, String remoteIp, String systemSource);
	/**
	 * �û���¼
	 * @param username
	 * @param password
	 * @return
	 */
	ResultCode<MemberVo> doMemberLogin4Api(String username, String password, String remoteIp);
	/**
	 * @deprecated systemSource unused, get it from dubbo filter
	 * @param username
	 * @param password
	 * @param remoteIp
	 * @param systemSource
	 * @return
	 */
	ResultCode<MemberVo> doMemberLogin4Api(String username, String password, String remoteIp, String systemSource);
	/**
	 * TODO ���ڹ����ھۣ����ṩdubbo
	 * �û���¼  ���򵥴���
	 * @param omid openmemberid(����)
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> doLoginByOpenMember(Long omid, String remoteIp);
	/**
	 * �޸��û���Ϣˢ��
	 * encodeOrSessid
	 * memberid
	 */
	ResultCode updateMemberAuth(String encodeOrSessid, Long memberid);
	/**
	 * �ǳ�
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode doLogout(String memberEncode, String remoteIp);
	/**
	 * ������������½MD5��ʽ
	 * @param appkey
	 * @param pukey
	 * @param timestamp
	 * @param sign
	 * @param extraInfo
	 * @param remoteIp
	 * @return
	 */
	ResultCode<MemberVo> openMemberLoginByMD5(String appkey, String pukey, Timestamp timestamp, String sign, String extraInfo, String remoteIp);
}
