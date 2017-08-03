package com.gewara.api.sns.label;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.activity.domain.TreasureVo;
import com.gewara.api.sns.vo.comment.CommentVo;
import com.gewara.api.sns.vo.label.BigLabelVo;
import com.gewara.api.sns.vo.label.LabelRelatedVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

public interface BigLabelApiService {
	/**
	 * ���ݱ�ǩID�б��ȡ��ǩ����
	 * @param   ids  ��ǩID�б�  
	 */
	ResultCode<List<BigLabelVo>> getBigLabelListByIds(List<Long> ids);
	/**
	 * ���ݱ�ǩ���ƻ�ȡ����
	 * @param   name  ��ǩ����
	 */
	ResultCode<BigLabelVo> getBigLabelByName(String name);
	/**
	 * ���ݱ�ǩ����ģ��ƥ���ȡ����
	 * @param   name  ģ��ƥ���ǩ����
	 */
	ResultCode<List<BigLabelVo>> getBigLabelListByMatchName(String name);
	
	/**
     * ���ݲ�ѯ������ȡ��ǩ����
     * @param   memberid  ��ӱ�ǩ���û�
     * @param   name  ��ǩ����
     * @param   starttime ��ѯ����ʱ�䷶Χ
     * @param   endtime   ��ѯ����ʱ�䷶Χ
     * @param   orders   �����ֶ�����
     * @param   isAsc    ��������(ASC?)
     * @param   from     ��ҳ����
     * @param   maxnum   ��ҳ����
     */
	ResultCode<List<BigLabelVo>> getBigLabelList(Long memberid,String name,Timestamp starttime, Timestamp endtime,String [] orders, boolean isAsc, int from, int maxnum);
    /**
     * ��ӱ�ǩ��Ϣ
     * @param   memberid  ��ӱ�ǩ���û�
     * @param   name  ��ǩ����
     */
	ResultCode<BigLabelVo> addBigLabel(Long memberid, String name);
    /**
     * ��ӱ�ǩ������ϵ
     * @param   id    ��ǩID
     * @param   tag  ������������
     * @param   relatedid  ��������ID
     */
	ResultCode addRelatedBigLabel(Long id,String tag,Long relatedid);
    /**
     * �Ƴ���ǩ������ϵ
     * @param   id    ��ǩID
     * @param   tag  ������������
     * @param   relatedid  ��������ID
     */
	ResultCode cancelRelatedBigLabel(Long id,String tag,Long relatedid);
    /**
     * ��ȡ��ǩ�����Ķ���
     * @param   id    ��ǩID (����Ϊ��)
     * @param   tag  ������������ (�ɺ���)
     * @param   relatedid  ��������ID (�ɺ���)
     * @param   from  ��ҳ����
     * @param   maxnum  ��ҳ����
     */
	ResultCode<List<LabelRelatedVo>> getRelatedBigLabelList(Long id,String tag, Long relatedid, int from, int maxnum);
	/**
     * ��ȡ��ǩ�����Ķ���������
     * @param   id    ��ǩID
     * @param   tag  ������������
     */
	ResultCode<Integer> getRelatedBigLabelCount(Long id, String tag);
    /**
     * ��ȡ��������ı�ǩID�б�
     * @param   relatedid    ��������ID
     * @param   tag  ������������
     * @param   from  ��ҳ����
     * @param   maxnum  ��ҳ����
     */
	ResultCode<List<Long>> getRelatedBeBigLabelList(String tag,Long relatedid, int from, int maxnum);
	/**
	 * ��ע��ǩ
	 * @param labelid ��ǩid
	 * @param memberid �û�id
	 * @return
	 */
	ResultCode<String> collectBigLabel(Long labelid, Long memberid);
	/**
	 * ������ע��ǩ
	 * @param labelids
	 * @param memberid
	 * @return
	 */
	ResultCode<String> collectBigLabel(List<Long> labelids, Long memberid);
	/**
	 * ȡ����ע��ǩ
	 * @param labelid ��ǩid
	 * @param memberid �û�id
	 * @return
	 */
	ResultCode<String> cancelCollectBigLabel(Long labelid, Long memberid);
	/**
	 * �õ���ע��ǩ
	 * @param labelid ��ǩid
	 * @param memberid �û�id
	 * @return
	 */
	ResultCode<TreasureVo> getCollectBigLabel(Long labelid, Long memberid);
	
	/**
	 * �õ���ע��ǩ�б�
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getCollectBigLabel(Long memberid, int from, int maxnum);
	/**
	 * �õ���ע��ǩ�ķ�˿
	 * @param labelid ��ǩid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TreasureVo>> getBigLabelTreasureList(Long labelid, int from, int maxnum);
	/**
	 * ���ݱ�ǩid�õ�wala
	 * @param labelid ��ǩid
	 * @param order  �����ֶ�  movieweightorder ��ӰȨ��
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CommentVo>> getLabelCommentList(Long labelid, String order, int from, int maxnum);
	
	/**
	 * ��ȡ��ǩ�����û��б�
	 * @param labelid
	 * @param startTime
	 * @param endTime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List> getContributeFansList(Long labelid,Timestamp startTime, Timestamp endTime, int from, int maxnum);
	
	/**
	 * ��ȡ�Ƽ���ǩ
	 * @param memberid 
	 * @param relatedid 
	 * @param tag 
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<BigLabelVo>> getRecommendBigLabelList(String tag, Long relatedid, Long memberid, int from, int maxnum);
	
	/**
	 * ��ȡ�û���ע�ı�ǩδ������
	 * @param ids
	 * @return
	 */
	ResultCode<VoMap<String,Integer>> getUnreadBigLabelNumVoMap(List<String> ids);
	
	/**
	 * ���û���ע�ı�ǩδ���������
	 * @param id
	 * @param num
	 * @return
	 */
	ResultCode cleanUnReadBigLabelNum(String id, Integer num);
	
	/**
	 * ��ӵ�Ӱ��ǩ
	 * @param movieids
	 * @return
	 */
	ResultCode<Integer> addLabelByMovie(List<Long> movieids);
	
	/**
	 * ��ȡ������
	 * @param id
	 * @return
	 */
	ResultCode<Integer> getRelatedCommentCount(Long id);
	/**
	 * �õ���ע�ı�ǩ��Ӧ��δ������
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<VoMap<Long,Integer>> getCollectBigLabelVoMapByMemberid(Long memberid, int from, int maxnum);
	/**
	 * �޸��û��ղر�ǩδ������
	 * @param memberid
	 * @param relatedid
	 * @param num
	 * @return
	 */
	ResultCode updateUnReadBigLabelByMemberid(Long memberid,Long relatedid, Integer num, String tag, String action);
	
	
	
	
}
