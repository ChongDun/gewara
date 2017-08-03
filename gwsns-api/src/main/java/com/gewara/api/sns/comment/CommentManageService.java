package com.gewara.api.sns.comment;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.sns.vo.comment.ReCommentVo;
import com.gewara.api.sns.vo.comment.ReCommentVoCommand;
import com.gewara.api.vo.ResultCode;
import com.gewara.command.CommentVoCommand;

public interface CommentManageService {
	
	ResultCode<Long> updateComment(String commentJson);
	//���������ظ�--����ӵķ���
	ResultCode<Long> saveReComment(ReCommentVoCommand reComment);
	
	ResultCode<String> saveModeratorTag(Long id, List<String> titles);
	
	ResultCode<Integer> saveFlowerMember(Long memberid, String type, Long relatedid,String source);
	
	/**
	 * ��������
	 */
	ResultCode<Integer> saveAnonymFlowerMember(String type,Long relatedid,String gwtc);
	
	ResultCode<Long> saveComment(CommentVoCommand command);
	/**
	 * ��ѯmemberid���޹��Ļظ�
	 * @param memberid
	 * @param type
	 * @param relatedids
	 * @return
	 */
	ResultCode<List<Long>> hasFlowerMemberList(Long memberid, String type, List<Long> relatedids);
	
	/**
	 * �Ƿ��������޹�
	 */
	ResultCode<Integer> hasAnonymFlowerMember(String type, Long relatedid,String gwtc);
	
	ResultCode<Integer> hasFlowerMember(Long memberid, String type, Long relatedid);
	/**
	 * �û����޲���
	 * 			beforRelatedid=0 �����
	 *          afterRelatedid=0 ��ȡ������
	 *          �����ǵ��ޱ��
	 * @param memberid
	 * @param type
	 * @param beforRelatedid
	 * @param afterRelatedid
	 * @param source
	 * @return
	 */
	ResultCode<Integer> flowerMemberOperate(Long memberid, String type, Long beforRelatedid,Long afterRelatedid,String source);
	/**
	 * ȡ������
	 * @param memberid
	 * @param type
	 * @param relatedid
	 * @return
	 */
	ResultCode<Integer> cancelFlowerMember(Long memberid, String type, Long relatedid);
	
	//����ȡ������
	ResultCode<Integer> cancelAnonymFlowerMember(String type,Long relatedid,String gwtc);
	
	ResultCode<List<CommentVo>> adminGetCommentList(Long memberid, Timestamp starttime, Timestamp endtime, String transfer, String status, String keyname, String isMicro, int from, int maxnum);	
	
	ResultCode<Integer> adminGetCommentCount(Long memberid, Timestamp starttime, Timestamp endtime, String transfer, String status, String keyname,
			String isMicro);
	
	ResultCode<Integer> deleteComment(Long commentId);
	
	

	ResultCode<Integer> deleteMicroReComment(Long mid);

	
	ResultCode<Integer> updateReComment(String recommentJson);
	
	ResultCode<List<ReCommentVo>> adminGetReCommentList(Long cid, Long memberid, Timestamp starttime, Timestamp endtime, String status, String keyname, int from,
			int maxnum) ;

	
	ResultCode<Integer> adminGetReCommentCount(Long cid, Long memberid, Timestamp starttime, Timestamp endtime, String status, String keyname);
	/**
	 * �ٱ��ظ�
	 * @param id
	 * @return
	 */
	ResultCode saveCommentReport(Long id,Long memberid);
	/**
	 * �Ƿ��Ѿٱ�
	 * @param id
	 * @param memberid
	 * @return
	 */
	ResultCode<Boolean> checkIsReportForId(Long id,Long memberid);
}
