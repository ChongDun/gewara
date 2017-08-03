package com.gewara.api.sns.comment;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

public interface BootRemaitApiService {
	/**
	 * ����
	 * @param memberid
	 * @param movieid
	 * @param status
	 * @return
	 */
	ResultCode saveOrUpdate(Long memberid, Long movieid);
	/**
	 * ��Ӱ���������Ϣ
	 * @param memberid
	 * @param relatedid
	 * @param tag
	 */
	ResultCode sendMsgToUser(Long memberid, Long relatedid,Timestamp sendTime, String content);
	ResultCode sendMsgToUser(Long memberid, Long relatedid,Timestamp sendTime, String content, String contentForWeibo);
	/**
	 * ��ȡ��Ӱ���ͻ���
	 * @param memberid
	 * @param movieid
	 * @param addPointType  true����������;false��������
	 * @param afterSeen     true����Ӱ��;false�������Ƿ��Ӱ
	 * @return
	 */
	ResultCode<Integer> getMovieScore(Long memberid, Long movieid, boolean addPointType, boolean afterSeen); 
	/**
	 * ��ȡ����ָ���û��Ļظ��Ļظ�memberid
	 * @return
	 */
	ResultCode<List<Long>> getRereMemberids();
	/**
	 * �����û�д�������͵�Ӱ����
	 * @param memberid
	 * @param relatedid
	 * @return
	 */
	ResultCode saveUserWalaPresent(Long memberid, Long relatedid);
	/**
	 * �жϸ��û��Ƿ����ͨѶ¼
	 * @param memberid
	 * @param movieid
	 * @param addPointType
	 * @param afterSeen
	 * @return
	 */
	ResultCode<Boolean> checkMember(Long memberid, Long movieid, boolean addPointType, boolean afterSeen);
	/**
	 * app������������
	 * @param memberid
	 * @param score
	 */
	ResultCode saveAppScoreRemain(Long memberid, Integer score);
	/**
	 * �ж�д�����Ƿ����͹�����
	 * @param memberid
	 * @param movieid
	 * @return
	 */
	ResultCode<Boolean> checkIsPresent(Long memberid,Long movieid);
	
	/**
	 * ��ȡ�û��������ѵ�Ӱ
	 * @param memberid
	 * @return
	 */
	ResultCode<VoMap<String,Long>> getBootRemaitVoMapById(Long memberid);
	/**
	 * ��ȡapp������������
	 * @param memberid
	 * @return
	 */
	ResultCode<VoMap<String,Integer>> getAppScoreRemainVoMap(Long memberid);
	/**
	 * ��ȡ���͵���Ϣ����
	 * @param memberid
	 * @param movieid
	 * @return
	 */
	ResultCode<String> getUserMsgContent(Long memberid, Long movieid);
	/**
	 * ��ȡ��ӰȦ�㳡V˵��������������Ѷ����
	 * @param table
	 * @param type
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getRecommendWalaForSquare(String table,String type,int from, int maxnum);
	/**
	 * ��ʼ���û�app7.1.0�㳡׼������
	 * @param memberid
	 */
	ResultCode readyMemberSquareData(Long memberid);
	/**
	 * �û���ȡapp7.1.0�㳡����
	 * @param memberid
	 * @param pageNo
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getMemberSquareCommentVoList(Long memberid, Integer pageNo, Integer maxnum);
	/**
	 * ��ȡ��������
	 * @param startime
	 * @param endtime
	 * @return
	 */
	ResultCode<VoMap<String, List<Long>>> getMalaCommentList(String startime, String endtime);
	/**
	 * ��ȡ����������ʼ����ʱ��
	 * @return
	 */
	ResultCode<String> getMalaCommentFirstTime();
}

