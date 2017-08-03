package com.gewara.api.sns.comment;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.sns.vo.comment.RecommendVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;
import com.gewara.command.CommentVoCommand;


public interface CommentApiService {

	/**
	 * ����ID��ȡ��������
	 * 
	 * @param commentId
	 * @param model
	 * @return
	 */
	
	ResultCode<CommentVo> getCommentId(Long commentId);

	/**
	 * ��ȡcomment�б�
	 * 
	 * @return xml�ַ���
	 */
	
	ResultCode<List<CommentVo>>  getCommentList(String tag, Long relatedid, String status, Long memberid, Long transferid, String key, String flag, String order, String isAsc,
			String startTime, String endTime, Long mincommentid, int from, int maxnum);
	
	/**
	 * ��ȡ����comment�б�
	 * 
	 * @return xml�ַ���
	 */
	
	ResultCode<List<CommentVo>> getHotCommentList(String tag, Long relatedid, String status, Long memberid, Long transferid, String key, String flag,
			String startTime, String endTime, String bodyLength, String topic, String order, int from, int maxnum);
	/**
	 * ��ȡ������comment�б�
	 * 
	 * @return xml�ַ���
	 */
	
	ResultCode<List<CommentVo>> getNotHotCommentList(String tag, Long relatedid, String status, Long memberid, Long transferid, String key, String flag,
			String startTime, String endTime, String topic, String order, int from, int maxnum);

	
	ResultCode<Integer> getCommentCount(String tag, Long relatedid, String status, String flag, Long memberid, Long transferid, String body, String startTime,
			String endTime);

	
	ResultCode<List<CommentVo>> getCommentListByTags(String tag, Long memberid, boolean isTransfer, int from, int maxnum);
	
	ResultCode<Integer> getCommentCountByTags(String tag, Long memberid, boolean isTransfer);
	
	ResultCode<Integer> getLongCommentCount(String tag, Long relatedid, String status);

	ResultCode<Integer> getCommentCount(String tag, Long relatedid, Long memberid, String body, String status, String beginDate, String endDate);
	ResultCode<List<CommentVo>> getCommentList(String tag, Long relatedid, Long memberid, String body, String status, String beginDate, String endDate, int from, int maxnum);


	
	ResultCode<List<CommentVo>> getHotCommentList(int from, int maxnum);

	
	ResultCode<Integer> searchCommentCount(String searchkey, String type, String memberids);

	
	ResultCode<List<CommentVo>> searchCommentList(String searchkey, String type, String memberids, int from, int maxnum);
	
	ResultCode<List<CommentVo>> getReplyMeCommentList(Long memberid, int from, int maxnum);

	ResultCode<List<CommentVo>> getLongCommentList(String tag, Long relatedid, String status, int from, int maxnum);
	
	ResultCode<List<CommentVo>> getCommentLisyByIDs(String ids);

	ResultCode<Integer> getCommentCountByTopic(String topic) ;
	
	ResultCode<List<CommentVo>> getCommentListByTagMemberids(String tag, String ids, String startTime, String endTime, int from, int maxnum);

	
	ResultCode<CommentVo> getLastComment(Long memberid);

	
	ResultCode<List<CommentVo>> pointByFreeBackCommentList(String tag, int from, int maxnum);

	
	ResultCode<List<CommentVo>> getRelateItemCommentList(Long memberid, int from, int maxnum);

	
	ResultCode<Integer> getReplyMeCommentCount(Long memberid);
	
	ResultCode<List<Long>> getToFilmfestIntresetMember(String moderator, String tag, int from, int maxnum);

	ResultCode<Integer> pointByFreeBackCommentCount(String tag);

	ResultCode<List<CommentVo>> getCommentListByTransfer(Long commentId, int from, int maxnum);
	ResultCode<List<CommentVo>> searchCommentListByTopic(String topic, String type, List<Long> memberidList, Timestamp starttime, Timestamp endtime, String order, String isAsc, int from, int maxnum);

	
	ResultCode<Integer> getCommentCountByTransfer(Long commentId);
	/**
	 * �������������û�id����
	 * 
	 * @param model
	 * @param maxnum
	 * @param tag
	 * @return
	 */
	
	ResultCode<String> getCreatedCommentMaxMemberIds(Integer maxnum, String tag);
	
	//������Ժ�Ҫɾ��,ͳһ�������ѯ
	ResultCode<List<CommentVo>> getCommentList(CommentVoCommand command);
	
	ResultCode<Integer> getCommentCount(CommentVoCommand command);
	
	ResultCode<String> getCommentBody(Long commentid);
	
	/**
	 * ��ȡ�Ƽ�����
	 */
	ResultCode<List<CommentVo>> getCommentVoListByRecomment(String signname, Long relatedid, String citycode, String order, boolean isAsc, int from, int maxnum);
	/**
	 * ��ȡ�Ƽ�����
	 */
	ResultCode<List<CommentVo>> getCommentVoListByRecomment(String signname, Long relatedid, String citycode, String order,HashMap<String,Object> paramet,boolean isAsc, int from, int maxnum);
	/**
	 * ����Ȩ������ȡ����
	 */
	ResultCode<List<CommentVo>> getWeightCommentList(Long moderatorid, Long mtid, String tag, Long relatedid, boolean isQa, Boolean isRead, int from, int maxnum);
	/**
	 * �û��齱
	 */
	ResultCode<String> getLottery(Long commentid, Long memberid, String source, String citycode, String ip);
	/**
	 * ��ȡ�����Ƽ�
	 */
	ResultCode<List<RecommendVo>> getRecommentList(String signname, Long relatedid, String citycode, String order, boolean isAsc, int from, int maxnum);
	
	/**
	 * ���û�����
	 * ��bindMemberId�ϵ������󶨵�memberId��
	 * @param 
	 * @return
	 */
	ResultCode bindMemberComment(Long memberId,Long bindMemberId);
	/**
	 * ����������ȡ����
	 * @param tags
	 * @param paramet
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getCommentListByParamet(String[] tags,Timestamp startTime, Timestamp endTime,HashMap<String, Object> paramet,int from, int maxnum);
	/**
	 * ����������ȡ��������
	 * @param tags
	 * @param paramet
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<Integer> getCommentListByParametCoun(String[] tags,Timestamp startTime, Timestamp endTime,HashMap<String, Object> paramet);
	/**
	 * ����ID��ȡ�Ƽ�����
	 * @param recommendId
	 * @return
	 */
	ResultCode<RecommendVo> getRecommendVoById(Long recommendId);
	/**
	 * ����IDɾ������
	 * @param commentid
	 * @return
	 */
	ResultCode<String> deleteComment(Long commentid,Long memberid);

	/**
	 * ��ѯ��ע�ĵ�Ӱ/Ӱ��/�/ӰԺ����
	 * @param params key = tag,value = relatedid list 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode<Integer> getCommentListCountByTags(Map<String, List<Long>> params, Timestamp startTime, Timestamp endTime,List<Long> memberids);

	/**
	 * ��ѯ��ע�ĵ�Ӱ/Ӱ��/�/ӰԺ����
	 * @param params key = tag,value = relatedid list 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode<List<Long>> getCommentListByTags(Map<String, List<Long>> params, Timestamp startTime, Timestamp endTime, int from, int maxnum);
	
	/**
	 * ����������ȡӰ������
	 * @param tags
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getStarCommentList(String tag,Timestamp startTime, Timestamp endTime,Long relatedid,int from, int maxnum);
	
	/**
	 * �����ӰȦ�Ƽ�����
	 * @param memberid
	 * @param friendCids
	 * @param attentionCids
	 * @param allids
	 */
	ResultCode saveFriendRecommendComment(Long memberid,List<Long> friendCids,List<Long> attentionCids,List<Long> allids);
	
	/**
	 * ��ѯ�û������ĵ�ӰȦ����
	 * @param memberid
	 * @param fieldName
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getRecommendCommentIds(Long memberid, String fieldName, int from, int maxnum);
	
	/**
	 * ��ѯ�Ƽ���ͶƱ
	 * @param startTime
	 * @param endTime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> queryDebateRecommendComment(Timestamp startTime, Timestamp endTime, Integer from, Integer maxnum);
	/**
	 * �����������url
	 * @param id
	 * @param redUrl
	 * @return
	 */
	ResultCode saveWalaRedUrl(Long id, String redUrl);
	/**
	 * ��ȡ������Ӧ�ĺ��url
	 * @param ids
	 * @return
	 */
	ResultCode<VoMap<Long, String>> getWalaRedUrlVoMapByIds(List<Long> ids);
	/**
	 * ��ȡ���������ĺ��url
	 * @param id
	 * @return
	 */
	ResultCode<String> getWalaRedUrlById(Long id);
	
	
	ResultCode saveWalaRedUrl(Long id, String redUrl,String redTag, String redToken);
	
	ResultCode<CommentVo> updateOtherInfo(Long commentid , Map otherInfoMap);
	/**
	 * �Ƿ��̨��ʶ����Ƶ����
	 * @param commentid
	 * @return
	 */
	ResultCode<Boolean> isVideoComment(Long commentid);
	/**
	 * ��ȡ��Ƶ��Ϣ
	 * 
	 * @param commentid
	 * @return
	 */
	ResultCode<VoMap<String,Object>> getCommenthVideoInfoVoMap(Long commentid);
	
	/**
	 * ��������ˢѡӰ������
	 * @param tags
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getStarCommentByScreenTypeList(String tag,Timestamp startTime, Timestamp endTime, Long relatedid,Integer screenType, int from,int maxnum);
	/**
	 * ����id��ȡ������Ϣ�����������
	 * @param commentId
	 * @return
	 */
	ResultCode<CommentVo> getCommentAndRedById(Long commentId);
	/**
	 * Ӱ��ˢѡ��������
	 * @param tag
	 * @param startTime
	 * @param endTime
	 * @param relatedid
	 * @param screenType
	 * @return
	 */
	ResultCode<VoMap<String,Integer>> getStarCommentCountVoMap(String tag, Timestamp startTime,Timestamp endTime, Long relatedid, Integer screenType);  
	
	ResultCode<List<VoMap<String,Object>>> getTaskCommentVoMapList();  
	ResultCode<List<VoMap<String,Object>>> getCountVoMapByMovieIdAddDate(String movieIds, Timestamp beginDate, Timestamp endDate);  
	ResultCode<List<VoMap<String,String>>> getCountVoMapByMovieIds(String movieIds, Timestamp date, String type);  
	ResultCode<VoMap<String,Object>> getCommentBodyVoMap(Long commentid);  
	ResultCode<VoMap<Long, Map<String,String>>> getWalaRedlVoMapByIds(List<Long> ids);  
	ResultCode<VoMap<String,String>> getWalaRedVoMapById(Long id);  
	
	/**
	 * ����ID��ȡ�Ƽ�����
	 * @param recommendId
	 * @return
	 */
	ResultCode<List<RecommendVo>> getRecommendVoByIds(List<Long> recommendIds);
	/**
	 * V˵/��������/��Ѷ�����б�
	 * @return
	 */
	ResultCode<List<CommentVo>> getCommentListForType(String type,int from, int maxnum);
}
