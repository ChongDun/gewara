package com.gewara.api.sns.comment;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.vo.ResultCode;

/**
 * ��ѡ����
 * @author zf
 *
 */

public interface CommentSelectedApiService {
	/**
	 * ��ȡ��ѡ����
	 * @param tag
	 * @param relatedid
	 * @param beginDate
	 * @param endDate
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getCommentListByCommentSelected(String tag,Long relatedid,Timestamp beginDate,Timestamp endDate,int from, int maxnum);
	
	
	/**
	 * ��ȡ��ǰȨ�غ���ľ�ѡ����
	 * @param commentid
	 * @param beginDate
	 * @param endDate
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getNextCommentListByCommentSelected(Long commentid,Timestamp beginDate, Timestamp endDate,int maxnum);
	
	/**
	 * ��ȡ��Ӱ��ؾ�ѡ����
	 * @param tag
	 * @param relatedid
	 * @param currentid 
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getMovieCommentSelected(String tag,Long relatedid,Long currentid, int from, int maxnum);
	
	
	/**
	 * ��ȡ��ǰȨ�غ���ĵ�Ӱ��ؾ�ѡ����
	 * @param commentid
	 * @param tag
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getNextMovieCommentSelected(Long commentid,String tag,Long relatedid,int from,int maxnum);
	
	/**
	 * ��ȡ��ע��Ӱ����ؾ�ѡ����
	 * @param tag
	 * @param relatedids
	 * @param notin 
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getAttentionCommentSelected(String tag,List<Long> relatedids,List<Long> notin, int from, int maxnum);
	
	/**
	 * ��ȡ��ע��Ӱ����ؾ�ѡ����
	 * @param tag
	 * @param relatedids
	 * @return
	 */
	ResultCode<Integer> getAttentionCommentSelectedCount(String tag,List<Long> relatedids);
}
