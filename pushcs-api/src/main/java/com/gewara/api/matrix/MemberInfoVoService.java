package com.gewara.api.matrix;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.MemberViewHistoryVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.model.TrackVO;

public interface MemberInfoVoService  {
	/**
	 * ���ݻ�ԱID����ѯӰ����
	 * @param memberId ��Աid	 
	 */
	ResultCode<Integer> getTrackCount(long memberId);
	
	/**
	 * ���ݻ�ԱID�б���ѯӰ�����б�
	 * @param memberId ��Աid�б�	 
	 */
	 ResultCode<Map<Long, Integer>> getTrackCountList(List<Long> memberIdList); 
	
	/**
	 * ���ݻ�ԱID����ʼӰ��key����ѯ��һҳ��Ӱ�������б�
	 * @param memberId ��Աid	
	 * @param startkey ��ʼӰ��key��Ĭ�����һ��
	 * @param pageSize ÿҳ��¼��������Ĭ��10��	 
	 */
	ResultCode<List<TrackVO>> getTrackListByStartkey(long memberId,String startKey,Integer pageSize);
	
	/**
	 * ���ݻ�ԱID����ѯӰ�������б����ã�
	 * @param memberId ��Աid		 
	 * 
	 */
	ResultCode<List<TrackVO>> getTrackDetail(long memberId);
	
	
	/**
	 * �����û�id��ȡ�û��Ĺ�Ӱ��¼,MemberViewInfo �� playtime �ӽ���Զ����
	 * 
	 * @param memberid
	 * @return
	 */
	ResultCode<MemberViewHistoryVo> getViewHistoryByMemberid(Long memberid);
	
	/**
	 * �����û�id��ȡ�û��Ĺ�Ӱ��¼,MemberViewInfo �� playtime �ӽ���Զ����
	 * @param memberid
	 * @param fromPlaytime
	 * @param maxnum
	 * @return
	 */
	ResultCode<MemberViewHistoryVo> getViewHistoryByMemberid(Long memberid, Long fromPlaytime, int maxnum);
}