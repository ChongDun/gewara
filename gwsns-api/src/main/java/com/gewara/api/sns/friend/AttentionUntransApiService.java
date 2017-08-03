package com.gewara.api.sns.friend;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;



public interface AttentionUntransApiService {

	/**
	 * ��ע�û�
	 * @param memberid 
	 * @param attentionid ����ע���û�id
	 */
	ResultCode addAttention(Long memberid, Long attentionid);
	
	/**
	 * ȡ����ע
	 * @param memberid
	 * @param attentionid ��ȡ�����û�id
	 */
	ResultCode cancelAttention(Long memberid, Long attentionid);
	/**
	 * ��ע�� ��˿�� ������˿��
	 * @param memberid
	 * @return key: total(��ע) betotal(��˿) count(����)
	 */
	ResultCode<VoMap<String,Integer>> getUserAttentionTotalVoMap(Long memberid);
	/**
	 * �Ƿ��ע�˸��û�
	 * @param memberid
	 * @param attentionid
	 * @return
	 */
	ResultCode<Boolean> hasAttention(Long memberid, Long attentionid);
	/**
	 * ��ע�б�
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List> getUserAttention(Long memberid, int from, int maxnum);
	/**
	 * ��˿�б�
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List> getUserBeAttention(Long memberid, int from, int maxnum);
	/**
	 * �û���ϵ
	 * @param memberid   ��ǰ�û�id
	 * @param memberids  ƥ���û�id
	 * @return
	 */
	ResultCode<VoMap<Long,String>> relationShipVoMap(Long memberid, List<Long> memberids);
	/**
	 * �Ƿ����ҵķ�˿
	 * @param memberid
	 * @param attentionid
	 * @return
	 */
	ResultCode<Boolean> hasBeAttention(Long memberid, Long attentionid);
	/**
	 * �����û���ϵ
	 * @param memberid
	 * @param attentionid
	 * @return
	 */
	ResultCode<String> relationShip(Long memberid, Long attentionid);
	/**
	 * ��ȡ�û�д��������
	 * @param memberid
	 * @return
	 */
	ResultCode<List<Long>> getMemberTagCommentList(Long memberid);
	/**
	 * ������ע�û�
	 * @param memberid 
	 * @param attentionid ����ע���û�id
	 */
	ResultCode addAttentions(Long memberid, List<Long> attentionid);
	/**
	 * �����û��������ӿ�
	 * @param memberid
	 * @param beMemberid
	 * @return
	 */
	ResultCode addBlackForUser(Long memberid, Long beMemberid);
	/**
	 * ȡ���û��������ӿ�
	 * @param memberid
	 * @param beMemberid
	 * @return
	 */
	ResultCode cancelBlackForUser(Long memberid, Long beMemberid);
	/**
	 * �Ƿ�����
	 * @param memberid
	 * @param beMemberid
	 * @return
	 */
	ResultCode<Boolean> checkIsBlackUser(Long memberid,Long beMemberid); 
	/**
	 * ��ȡָ���û��ĺ������û�
	 * @param memberid
	 * @return
	 */
	ResultCode<List<Long>> getBlackUserByMemberid(Long memberid);
}
