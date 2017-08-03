/** 
 */
package com.gewara.api.sns.friend;

import java.util.List;

import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

/**
 * @author Zhicheng.Peng   Johnny.Resurgam@Gmail.com
 *  
 *  Jun 18, 2015  7:27:37 PM
 */
public interface FriendsApiService {
	
	/**
	 * ��ȡ����Ȧ����
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getMyFriendsCommentList(Long memberid, int from, int maxnum);
	
	/**
	 * ��ȡ����Ȧ��������
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getMyFriendsCommentsIdsCount(Long memberid);
	
	/**
	 * ��ȡ�ҹ�ע�ĺ�����Tag�µ�����
	 * @param mid
	 * @param tag
	 * @param relateId
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getMyFriendsCommentsForTag(Long mid, String tag, Long relateId, int from, int maxnum);
	/**
	 * ��ȡ�ҵĺ��ѹ�ע�ĵ�Ӱ
	 * @param tag
	 * @param relatedid
	 * @param memberId
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getMyFriendsTreasureList(String tag,Long relatedid, Long memberId, int from, int maxnum);
	/**
	 * ��ȡ�ҵĺ��ѹ�ע������
	 * @param tag
	 * @param relatedid
	 * @param memberId
	 * @return
	 */
	ResultCode<Integer> getMyFriendsTreasureCount(String tag,Long relatedid, Long memberId);
	
	/**
	 * ��ȡ�ҹ�ע�ĺ�����Tag�µ�����������
	 * @param mid
	 * @param tag
	 * @param relateId
	 * @return
	 */
	ResultCode<Integer> getMyFriendsCommentsIdsForTagCount(Long mid, String tag, Long relateId);

	/**
	 * ��ȡ������Ȧ�����ѵ�������������㣩
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getMyFriendsWalaCount(Long memberid);
	
	/**
	 * ��ȡ���ѵĺ���˵����
	 * @param memberid
	 * @param tag
	 * @param relateIds
	 * @return
	 */
	ResultCode<VoMap<Long,Integer>> getMyFriedsSayCountVoMapByList(Long memberid,String tag,List<Long> relateIds);
	/**
	 * �ҹ�ע�ĺ���
	 * @param mid
	 * @param tag
	 * @param relateId
	 * @return
	 */
	ResultCode<VoMap<String, String>> getMyFriendsCommentsIdsForTag(Long mid, String tag, Long relateId);
	ResultCode<Integer> getMyFriedsSayUnreadCount(Long mid, String tag, Long relateId);
	
	
}
