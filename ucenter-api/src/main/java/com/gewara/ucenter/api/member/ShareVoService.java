package com.gewara.ucenter.api.member;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.ShareMemberVo;



public interface ShareVoService {
	/**
	 * ���Ҫ�������Ϣ
	 * @param tag
	 * @param tagid
	 * @param memberid
	 * @param category
	 * @return
	 */
	ResultCode sendShareInfo(String tag, Long tagid, Long memberid, String category);
	/**�Զ����������
	 * @param tag
	 * @param tagid
	 * @param memberid
	 * @param content
	 * @param picUrl
	 * @return
	 */
	ResultCode sendShareInfo(String tag, Long tagid, Long memberid, String content, String picUrl);
	/**
	 * ������Դ��ȡ����ͬ���û�
	 * @param source
	 * @param memberid
	 * @return
	 */
	ResultCode<List<ShareMemberVo>> getShareMemberByMemberid(List<String> source, Long memberid);
	/**
	 * ����sharemember
	 * @param memberid
	 * @param source
	 * @param loginname
	 * @param token
	 * @param tokensecret
	 * @param expires
	 * @return
	 */
	ResultCode createShareMember(Long memberid, String source, String loginname, String token, String tokensecret, String expires);
	/**
	 * �޸�otherinfo��ز���
	 * @param shareMemberid
	 * @param otherinfoKey
	 * @param otherinfoValue
	 * @return
	 */
	ResultCode updateShareMemberRights(Long shareMemberid, String otherinfoKey, String otherinfoValue);
	/**
	 * �Ƴ�
	 * @param shareMemberid
	 * @return
	 */
	ResultCode removeShareMember(Long shareMemberid);
}
