package com.gewara.api.sns.bbs;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gewara.api.sns.vo.bbs.DiaryCommentVo;
import com.gewara.api.sns.vo.bbs.DiaryVo;
import com.gewara.api.sns.vo.bbs.VoteChooseVo;
import com.gewara.api.sns.vo.bbs.VoteOptionVo;
import com.gewara.api.vo.ResultCode;

/**
 * @author <a href="mailto:acerge@163.com">gebiao(acerge)</a>
 * @since 2007-9-28����02:05:17
 */
public interface DiaryApiService {
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 */
	ResultCode<DiaryVo> getDiary(Long id);
	ResultCode<List<VoteChooseVo>> getVoteChooseList(Long diaryId);
	/**
	 * ��ѯ���ӻظ�
	 * @param id
	 * @return
	 */
	ResultCode<DiaryCommentVo> getDiaryComment(Long id);
	
	
	ResultCode<Integer> getDiaryCount(String citycode, String type, String tag, Long relatedid);
	ResultCode<Integer> getDiaryCountByKey(String citycode, String type, String tag, Long relatedid, String key, Timestamp startTime, Timestamp endTime);
	ResultCode<List<DiaryVo>> getDiaryList(String citycode, String type, String tag, Long relatedid, int start, int maxnum);
	/**
	 * �������ֶ�
	 */
	ResultCode<List<DiaryVo>> getDiaryList(String citycode, String type, String tag, Long relatedid, int start, int maxnum, String order);
	/**
	 * ��ѯһ��ʱ���ڵ�������Ϣ
	 */
	ResultCode<List<DiaryVo>> getDiaryListByOrder(String citycode, String type, String tag, Long relatedid, Timestamp startTime,Timestamp endTime, String order, boolean asc, int start, int maxnum);
	/**
	 * �������ֶ�
	 */
	ResultCode<List<DiaryVo>> getDiaryListByKey(String citycode, String type, String tag, Long relatedid, int start, int maxnum, String key, Timestamp startTime,Timestamp endTime);
	/**
	 * ��Flag�ֶ� 
	 */
	ResultCode<List<DiaryVo>> getDiaryListByFlag(String citycode, String type, String tag, String flag, int from, int maxnum);
	/**
	 * @param type
	 * @param tag
	 * @return �ö���Diary
	 */
	ResultCode<List<DiaryVo>> getTopDiaryList(String citycode, String type, String tag, boolean isCache);
	/**
	 * ��ȡ24Сʱ�������ӣ�����24Сʱ�ڻظ�������
	 * @param tag
	 * @return
	 */
	ResultCode<List<Map>> getOneDayHotDiaryList(String citycode, String tag);
	/**
	 * @param type
	 * @param tag
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<DiaryVo>> getDiaryListByMemberid(String type, String tag, Long memberid, int from, int maxnum);
	/**
	 * ĳ���û�����������
	 * @param type
	 * @param tag
	 * @param mid
	 * @return
	 */
	ResultCode<Integer> getDiaryCountByMemberid(String type, String tag, Long memberId);
	
	
	/**
	 * �õ�ĳ��Diary�Ļظ�
	 * @param diaryId
	 * @return
	 */
	ResultCode<List<DiaryCommentVo>> getDiaryCommentList(Long diaryId, int from, int maxnum); 
	ResultCode<List<DiaryCommentVo>> getDiaryCommentList(Long diaryId); 
	/**
	 * ����ͶƱ��id������ѡ��
	 * @param vid
	 * @return
	 */
	ResultCode<List<VoteOptionVo>> getVoteOptionByVoteid(Long vid);
	/**
	 * ͶƱ������
	 * @param did
	 * @return
	 */
	ResultCode<Integer> getVotecount(Long did);
	/**
	 * �Ҷ�ĳ�����ӵ�ͶƱ����
	 * @return
	 */
	ResultCode<List<VoteChooseVo>> getVoteChooseByDiaryidAndMemberid(Long did,Long mid);
	ResultCode<Integer> getDiaryCommentCount(String tag, Long diaryId);
	/**
	 * �Ƿ��Ѿ�ͶƱ(׼�Զ������)
	 * @param memberid
	 * @return
	 */
	ResultCode<Boolean> isMemberVoted(Long memberid, Long diaryid);
	
	//���һ������Ӱ��
	ResultCode<List<DiaryVo>> getHotCommentDiary(String citycode, String type, String tag, Long relateid, int from,int maxnum);
	/**
	 * ��ѯȦ�����Ż���
	 */
	ResultCode<List<DiaryVo>> getHotCommuDiary(String citycode, boolean isCommu,String type,int from,int maxnum);
	
	/**
	 * ����status��ѯ����
	 * @param status
	 * @return
	 */
	ResultCode<List<DiaryVo>> getDiaryListByStatus(String keyname, String status, Date fromDate, Date endDate, int from, int maxnum);
	ResultCode<Integer> getDiaryCountByStatus(String keyname, String status, Date fromDate, Date endDate);
	/**
	 * ����status��ѯ��������
	 * @param status
	 * @return
	 */
	ResultCode<List<DiaryCommentVo>> getDiaryCommentListByStatus(String keyname, String status, Date fromDate, Date endDate, int from, int maxnum);
	ResultCode<Integer> getDiaryCommentCountByStatus(String keyname, String status, Date fromDate, Date endDate);
	ResultCode<List<DiaryVo>> getRepliedDiaryList(Long memberid, int from, int maxnum);
	ResultCode<Integer> getRepliedDiaryCount(Long memberid);

	/**
	 * ��ѯ��Ӱ�����硢�ĵ����б�
	 * @param keyname
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Map>> getMDSDiaryListByKeyname(String citycode, String keyname, String tag, String name, int from, int maxnum);
	ResultCode<Integer> getMDSDiaryCountByKeyname(String citycode, String keyname, String tag, String name);
	/**
	 * ��ҳ��ѯ�ݳ������б�����
	 * @param citycode
	 * @param key
	 * @param starttime
	 * @param endtime
	 * @param order
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<DiaryVo>> getDiaryBySearchkeyAndOrder(String citycode,String key,Timestamp starttime, Timestamp endtime, String order,int from,int maxnum);
	
	/**
	 * ����Ȧ��id��ѯȦ��������Ϣ(���Ǵ�commuApiService�ƶ��������)
	 */
	ResultCode<List<DiaryVo>> getCommuDiaryListById(Long id, String[] type,Long commuTopicId, int from, int maxnum);
	
	/**
	 * ��������������ѯ����(���Ǵ�commuApiService�ƶ��������)
	 */
	ResultCode<List<DiaryVo>> getCommuDiaryListBySearch(Long id, String type, Long
			commuTopicId, Date fromDate, Integer flag, String text, int from, int maxnum);
	ResultCode<Integer> getCommuDiaryCountBySearch(Long id,String type,Long 
			commuTopicId, Date fromDate, Integer flag, String text);
	
	/**
	 * ����Ȧ��id��ѯȦ��������Ϣ����(���Ǵ�commuApiService�ƶ��������)
	 */
	ResultCode<Integer> getCommuDiaryCount(Long id,String[] type,Long commuTopicId);
	
	
	
	/**
	 * ����Ȧ�ӵ�id�б��ѯ����Ȧ�ӵĻ�����Ϣ(���Ǵ�commuApiService�ƶ��������)
	 * @param commuIds TODO
	 */
	ResultCode<List<DiaryVo>> getAllCommuDiaryByCommuIds(List<Long> commuIds, int from, int maxnum);
	
	
	/**
	 * ���ݵ�ǰ�û�id��ѯ�����������Ȧ�ӵĻ�����Ϣ����
	 * @param commuIds TODO
	 */
	ResultCode<Integer> getAllCommuDiaryCountByCommuIds(List<Long> commuIds);

	/**
	 * �������ڷ�Χ��ѯ��������
	 * @param datefrom
	 * @param dateto
	 * @return
	 */
	ResultCode<Map<String, Integer>> getDiaryReportList(Date datefrom, Date dateto);

	/**
	 * ����������ѯDiary
	 * @param memberid ��Աid
	 * @param starttime ��ʼʱ��
	 * @param endtime ����ʱ��
	 * @param tag ҵ��ģ�飨�����Ӱ��
	 * @param status ״̬
	 * @param keyname �ؼ���
	 * @param firstRow ��ʼ��¼��
	 * @param rowsPerpage ������¼��
	 * @return
	 */
	ResultCode<List<DiaryVo>> queryDiary(Long memberid, Timestamp starttime, Timestamp endtime, String tag, String status,
			String keyname, int firstRow, int rowsPerpage);

	ResultCode<Integer> queryDiaryCount(Long memberid, Timestamp starttime, Timestamp endtime, String tag, String status,
			String keyname);
	/**
	 * ����������ѯDiaryComment
	 * @param did Diary
	 * @param memberid ��Աid
	 * @param starttime ��ʼʱ��
	 * @param endtime ����ʱ��
	 * @param status ״̬
	 * @param keyname �ؼ���
	 * @param firstRow ��ʼ��¼��
	 * @param rowsPerpage ������¼��
	 * @return
	 */
	ResultCode<List<DiaryCommentVo>> queryDiaryComment(Long did, Long memberid, Timestamp starttime, Timestamp endtime,
			String status, String keyname, int firstRow, int rowsPerpage);

	ResultCode<Integer> queryDiaryCommentCount(Long did, Long memberid, Timestamp starttime, Timestamp endtime, String status,
			String keyname);

	ResultCode<List<Map<String, Object>>> getDiary(Set<Long> movieIdSet, String queryType, Date queryDate);

	ResultCode<List<DiaryVo>> queryDiary(Timestamp addTime, String tag);

	ResultCode<List<DiaryVo>> getDeletedDiaryList(boolean isDeleteDbRecord);

	ResultCode<Integer> getDiaryCountByMovieid(Long movieid);

	ResultCode<List<Long>> getDiaryIdList(Date begindate, Date enddate);
	
	ResultCode<List<Long>> getDiaryIdList(Date begindate);

	ResultCode<List<Map>> getDiaryCountMapList();

	/**
	 * ��������
	 * @param queryTime
	 * @return
	 */
	ResultCode<Integer> getDiaryCount(Date queryTime);
	
	/**
	 * Ӱ����
	 * @param queryTime
	 * @return
	 */
	ResultCode<Integer> getComentDiaryCount(Date queryTime);
	
	
	/**
	 * ��������,TODO: ����ɶ��Service����
	 * @param diary
	 * @return
	 */
	ResultCode<DiaryVo> saveDiary(DiaryVo diary);
	
	/**
	 * �������ӻظ�
	 * @param dc
	 * @return
	 */
	ResultCode<DiaryCommentVo> saveDiaryComment(DiaryCommentVo dc);


	/**
	 * ����id�б��ѯ����
	 * @param idList
	 * @return
	 */
	ResultCode<List<DiaryVo>> getDiaryList(List<Long> idList);


	/**
	 * �޸�����
	 * @param diary
	 * @return
	 */
	ResultCode<DiaryVo> updateDiary(DiaryVo diary);


	/**
	 * ��ȡVoteOption
	 * @param id
	 * @return
	 */
	ResultCode<VoteOptionVo> getVoteOption(Long id);


	/**
	 * ����VoteChooseList
	 * @param vcList
	 */
	ResultCode saveVoteChooseList(List<VoteChooseVo> vcList);


	/**
	 * ����VoteOptionList
	 * @param voList
	 */
	ResultCode saveVoteOptionList(List<VoteOptionVo> voList);


	/**
	 * ����voteChoose
	 * @param voteChoose
	 * @return
	 */
	ResultCode<VoteChooseVo> saveVoteChoose(VoteChooseVo voteChoose);
	
	
	/**
	 * @param diaryid
	 * @return
	 */
	ResultCode<String> getDiaryBody(long diaryid);
	/**
	 * @param diaryid
	 * @param body
	 */
	ResultCode saveDiaryBody(long diaryid, Timestamp updatetime, String body);

	
	ResultCode<List<Map>> getDiaryMapList(Timestamp starttime, Timestamp endtime);

	public ResultCode<List<DiaryVo>> getDiaryListByFlag(String citycode, String type, String tag, String flag, boolean notLike, String order, 
			int start, int maxnum);
	
	
	



	

	



	
	
	
}
