package com.gewara.api.sns.qa;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.gewara.api.sns.vo.qa.GewaAnswerVo;
import com.gewara.api.sns.vo.qa.GewaQaExpertVo;
import com.gewara.api.sns.vo.qa.GewaQaPointVo;
import com.gewara.api.sns.vo.qa.GewaQuestionVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;
import com.gewara.command.QuestionCommand;

public interface QaApiService {


	ResultCode<List<GewaQuestionVo>> getQuestionListByQuestionstatus(String citycode, String questionstatus, String order, int from,
			int maxnum);

	ResultCode<Integer> getQuestionCountByQuestionstatus(String citycode, String questionstatus);

	ResultCode<List<GewaQuestionVo>> getQuestionListByStatus(String status, Date fromDate, Date endDate, int from, int maxnum);

	ResultCode<Integer> getQuestionCountByStatus(String status, Date fromDate, Date endDate);

	ResultCode<List<GewaQuestionVo>> getQuestionListByHotvalue(String citycode, int hotvalue, int from, int maxnum);

	ResultCode<List<GewaAnswerVo>> getAnswerListByQuestionid(Long questionid);

	ResultCode<Integer> getAnswerCount(Long questionid);

	ResultCode<List<GewaAnswerVo>> getAnswerListByQuestionId(int start, int maxnum, Long questionid);

	ResultCode<List<GewaAnswerVo>> getAnswerListByQuestionAndMemId(int start, int maxnum, Long questionid, Long memberId);

	/**
	 * ���������ѯ�ظ� status=Y_NEW
	 */
	ResultCode<Integer> getAnswerCountByQuestionId(Long questionid);

	/**
	 * Ta�ش�����������
	 * 
	 * @param mid
	 * @return
	 */
	ResultCode<Integer> getAnswerCountByMemberidAndNStatus(Long mid);

	/**
	 * Ta�ش�����ⱻ���ɵ�����
	 * 
	 * @param mid
	 * @return
	 */
	ResultCode<Integer> getBestAnswerCountByMemberid(Long mid);

	/**
	 * �û��Ƿ�����������
	 * 
	 * @param memberid
	 * @param maxdays
	 * @return
	 */
	ResultCode<Boolean> isQuestion(Long memberid, Integer maxdays);

	/**
	 * �û��Ƿ��Ѿ��ش����������
	 * 
	 * @param qid
	 * @param mid
	 * @return
	 */
	ResultCode<Boolean> isAnswerQuestion(Long qid, Long mid);

	/**
	 * �������Ѵ�
	 * 
	 * @param qid
	 * @return
	 */
	ResultCode<GewaAnswerVo> getBestAnswerByQuestionid(Long qid);

	/**
	 * �û��Ƿ���ר��
	 * 
	 * @param mid
	 * @return
	 */
	ResultCode<GewaQaExpertVo> getQaExpertByMemberid(Long mid);

	/**
	 * ����������ȶ�
	 * 
	 * @param id
	 * @param hotvalue
	 * @return 2009-10-29
	 */
	ResultCode<Boolean> updateQAHotValue(Long id, Integer hotvalue);

	/**
	 * �޸�ר����Ϣ�ȶ�
	 * 
	 * @param id
	 * @param hotvalue
	 * @return 2009-10-30
	 */
	ResultCode<Boolean> updateQAExpertHotValue(Long id, Integer hotvalue);

	/**
	 * ��ѯר����Ϣ����
	 * 
	 * @return 2009-10-29
	 */

	ResultCode<Integer> getQAExpertCount();

	/**
	 * ��ѯר����Ϣ
	 * 
	 * @return 2009-10-29
	 */
	ResultCode<List<GewaQaExpertVo>> getQaExpertList();

	/**
	 * ��������
	 * 
	 * @param tag
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestionByTagAndRelatedid(String citycode, String tag, Long relatedid, int from, int maxnum);

	/**
	 * ��������
	 * 
	 * @param category
	 * @param categoryid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestionByCategoryAndCategoryid(String citycode, String category, Long categoryid, int from,
			int maxnum);

	ResultCode<List<GewaQuestionVo>> getQuestionByCategoryAndCategoryid(String citycode, String category, Long categoryid,
			boolean status, String questionstatus, int from, int maxnum);

	ResultCode<Integer> getQuestionCountByCategoryAndCid(String citycode, String category, Long categoryid);

	/**
	 * �û���Ѵ𰸶�������
	 * 
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<VoMap<String,Object>>> getTopMemberVoMapListByBestAnswer(int from, int maxnum);

	ResultCode<Integer> getTopMemberCountByBestAnswer();

	/**
	 * ��ѯר����Ϣ���״̬
	 * 
	 * @return 2009-10-30
	 */
	ResultCode<GewaQaExpertVo> getQaExpertStatusById(Long id);

	ResultCode<List<GewaAnswerVo>> getAnswerByMemberId(Long id);

	/**
	 * �û��ش������������
	 * 
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<VoMap<String,Object>>> getTopMemberVoMapListByAnswer(int from, int maxnum);

	ResultCode<Integer> getTopMemberCountByAnswer();

	/**
	 * �û�����ֵ��������
	 */
	ResultCode<List<VoMap<String,Object>>> getTopMemberVoMapListByPoint(int from, int maxnum);

	ResultCode<Integer> getTopMemberCountByPoint();


	ResultCode<List<GewaQuestionVo>> getQuestionListByMemberid(Long memberid, int from, int maxnum);

	/**
	 * @param tag
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<VoMap<String,Object>>> getQuestionVoMapListByTagGroup(String tag, int from, int maxnum);

	/**
	 * @param category
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<VoMap<String,Object>>> getQuestionVoMapListByCategoryGroup(String category, int from, int maxnum); 

	ResultCode<List<GewaQaExpertVo>> getExpertList(Integer hotvalue, int from, int maxnum);

	ResultCode<GewaQaPointVo> getGewaQaPointByQuestionidAndTag(Long qid, String tag);

	/**
	 * �û��ۼƵ��ʴ���ֵ
	 * 
	 * @param mid
	 * @return
	 */
	ResultCode<Integer> getPointByMemberid(Long mid);

	ResultCode<List<GewaQuestionVo>> getQuestionByQsAndTagList(String citycode, String qs, String tag, String order, int maxnum);

	ResultCode<List<GewaQuestionVo>> getQuestionListByQsAndTagAndRelatedid(String tag, Long relatedid, String qs, String order,
			int maxnum);

	/**
	 * ��ѯ����������
	 * 
	 * @param citycode
	 *            ���д���
	 * @param tag
	 *            ��������
	 * @param relatedid
	 *            ��������id
	 * @param status
	 *            ����״̬,��ѡֵ:N(�����),Y(�ѽ��),Z(����),noproper(�������)
	 * @return
	 */
	ResultCode<Integer> getQuestionCount(String citycode, String tag, Long relatedid, String status);

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param citycode
	 *            ���д���
	 * @param tag
	 *            ��������
	 * @param relatedid
	 *            ��������id
	 * @param status
	 *            ����״̬,��ѡֵ:N(�����),Y(�ѽ��),Z(����),noproper(�������)
	 * @param order
	 *            ����
	 * @param from
	 *            ҳ��
	 * @param maxnum
	 *            �������
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestionList(String citycode, String tag, Long relatedid, String status, String order,
			int from, int maxnum);

	/**
	 * ����hotvalue��ѯ֪������
	 */
	ResultCode<Integer> getQuestionCountByHotvalue(String citycode, Integer hotvalue);

	/**
	 * ��ȡ�ݳ�������Ա�ظ���memberid;
	 * 
	 * @return
	 */
	ResultCode<Long> getGewaraAnswerByMemberid();

	/**
	 * ��ѯ����
	 * @param memberId
	 * @param answerstatus
	 * 
	 * @return
	 */
	ResultCode<List<GewaAnswerVo>> queryAnswersByMemberIdAndAnswerstatus(Long memberId, String answerstatus);

	

	/**
	 * ��ѯ������Ϣ
	 * @param datefrom
	 *            ��������
	 * @param dateto
	 *            ��������
	 * @return
	 */
	ResultCode<VoMap<String, Integer>> getQaReportLstVoMap(Date datefrom, Date dateto);

	/**
	 * ����tilte ��  ״̬ ��ѯGewaQuestion
	 * @param keyname
	 * @param status
	 * @param i
	 * @param rowsPerPage
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestionByTitleAndStatus(String keyname, String status, int i, Integer rowsPerPage);
	
	/**
	 * ����tilte ��  ״̬ ��ѯ GewaQuestionҳ��
	 * @param keyname
	 * @param status
	 * @return
	 */
	ResultCode<Integer> getQuestionCountByTitleAndStatus(String keyname, String status);

	/**
	 * ��ѯ Answerҳ��
	 * @param qid
	 * @param memberid
	 * @param starttime
	 * @param endtime
	 * @param status
	 * @param keyname
	 * @return
	 */
	ResultCode<Integer> getAnswerCount(Long qid, Long memberid, Timestamp starttime, Timestamp endtime, String status,
			String keyname);

	/**
	 * ��ѯ Answer
	 * @param qid
	 * @param memberid
	 * @param starttime
	 * @param endtime
	 * @param status
	 * @param keyname
	 * @param rowsPerPage 
	 * @param firstRow 
	 * @return
	 */
	ResultCode<List<GewaAnswerVo>> getAnswer(Long qid, Long memberid, Timestamp starttime, Timestamp endtime, String status,
			String keyname, int firstRow, int rowsPerPage);
	
	/**
	 * ��ѯ Questionҳ��
	 * @param memberid
	 * @param starttime
	 * @param endtime
	 * @param status
	 * @param keyname
	 * @return
	 */
	ResultCode<Integer> getQuestionCount(Long memberid, Timestamp starttime, Timestamp endtime, String status, String keyname);

	/**
	 * ��ѯ Question
	 * @param memberid
	 * @param starttime
	 * @param endtime
	 * @param status
	 * @param keyname
	 * @param i
	 * @param rowsPerPage
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestion(Long memberid, Timestamp starttime, Timestamp endtime, String status,
			String keyname, int firstRow, Integer rowsPerPage);

	/**
	 * ��ѯ Question����
	 * @param command ��ѯ����
	 * @param order
	 * @return
	 */
	ResultCode<Integer> getQuestionCount(QuestionCommand command, String order);

	/**
	 * ��ѯQuestion
	 * @param qc ��ѯ����
	 * @param citycode
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getQuestion(QuestionCommand command, String citycode);

	
	/**
	 * ��ѯ�Ѿ�ɾ��������GewaQuestion
	 * @param isDeleteDbRecord TODO
	 * @return
	 */
	ResultCode<List<GewaQuestionVo>> getDeletedQuestionList(boolean isDeleteDbRecord);
    
    /**
     * ��ѯQuestion id�б�
     * @return
     */
	ResultCode<List<Long>> getQuestionIds();
    
    
    /**
	 * ��ѯ��ǰ�û������֪��
	 */
	ResultCode<List<GewaQuestionVo>> getQuestionByMemberid(Long memberid, int from, int maxnum);
	
	/**
	 * ��ѯ��ǰ�û������֪����Ϣ����
	 */
	ResultCode<Integer> getQuestionCountByMemberid(Long memberid);
	
	/**
	 * ��ѯ��ǰ�û��ظ���֪��
	 * page ��ǰҳ��
	 */
	ResultCode<List<GewaQuestionVo>> getAnswerByMemberid(Long memberid, int from, int maxnum);
	
	/**
	 * ��ѯ��ǰ�û��ظ���֪����Ϣ����
	 */
	ResultCode<Integer> getAnswerCountByMemberid(Long memberid);
	
	/**
	 * ����questionid��ѯgewaAnswer
	 * @return
	 */
	ResultCode<GewaAnswerVo> getGewaAnswerByAnswerid(Long questionid, Long memberid);

	/**
	 * ͨ��Id��ѯGewaQuestion
	 * @param id
	 * @return
	 */
	ResultCode<GewaQuestionVo> getQuestion(Long id);

	/**
	 * ͨ��Id��ѯGewaAnswer
	 * @param id
	 * @return
	 */
	ResultCode<GewaAnswerVo> getAnswer(Long id);

	/**
	 * ����GewaQuestion
	 * @param question
	 * @return
	 */
	ResultCode<GewaQuestionVo> saveQuestion(GewaQuestionVo question);

	/**
	 * ����GewaAnswer
	 * @param question
	 * @return
	 */
	ResultCode<GewaAnswerVo> saveAnswer(GewaAnswerVo answer);

	/**
	 * ͨ��Id��ѯGewaQaExpert
	 * @param id
	 * @return
	 */
	ResultCode<GewaQaExpertVo> getQaExpert(Long id);
	

	/**
	 * ����GewaQaPoint
	 * @param qaPoint
	 * @return
	 */
	ResultCode<GewaQaPointVo> saveQaPoint(GewaQaPointVo qaPoint);

	/**
	 * ͨ��Id��ѯGewaQaPoint
	 * @param id
	 * @return
	 */
	ResultCode<GewaQaPointVo> getQaPoint(Long id);

	/**
	 * ����GewaQaExpert
	 * @param expert
	 * @return
	 */
	ResultCode<GewaQaExpertVo> saveQaExpert(GewaQaExpertVo expert);

	/**
	 * ɾ��GewaQaPoint
	 * @param qaPoint
	 */
	ResultCode removeQAPoint(Long id);

	/**
	 * ɾ��GewaQaPoint
	 * @param qaPoint
	 * @return
	 */
	ResultCode<GewaQaPointVo> removeQaPoint(GewaQaPointVo qaPoint);

	/**
	 * ����GewaAnswer List
	 * @param answerlist
	 */
	ResultCode saveAnswerList(List<GewaAnswerVo> answerlist);

	ResultCode<GewaQuestionVo> getQuestionAndAddClickedtimes(Long qid);
	
	  
	  
	  
	
	 
	
}
