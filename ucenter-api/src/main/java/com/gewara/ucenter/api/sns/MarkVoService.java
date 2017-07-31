package com.gewara.ucenter.api.sns;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.sns.MarkChartsDataVo;
import com.gewara.ucenter.vo.sns.MarkCountDataVo;
import com.gewara.ucenter.vo.sns.MarkCountVo;
import com.gewara.ucenter.vo.sns.MemberMarkVo;
import com.gewara.ucenter.vo.sns.MovieGeneralmarkDetailVo;

public interface MarkVoService {

	/**
	 * ĳ�����־ۺ�����:TODO��ע��Map�е�����
	 * @param tag
	 * @return
	 */
	ResultCode<Map> getMarkData(String tag);
	
	ResultCode<MarkCountDataVo> getMarkCountByTagRelatedid(String tag, Long relatedid);
	/**
	 * �û�����
	 * @param tag
	 * @param relatedid
	 * @param markname
	 * @param markvalue
	 * @param memberid
	 * @return
	 */
	ResultCode<MemberMarkVo> saveOrUpdateMemberMark(String tag, Long relatedid, String markname, Integer markvalue, Long memberid, String cityCode);
	/**
	 * �û����һ�����ּ�¼
	 * @param tag
	 * @param relatedid
	 * @param markname
	 * @param memberId
	 * @return
	 */
	ResultCode<MemberMarkVo> getLastMemberMark(String tag, Long relatedid, String markname, Long memberId);
	/**
	 * �����������
	 * @param tag
	 * @param relatedid
	 * @param markname
	 * @return
	 */
	ResultCode<Integer> getMemberMarkCount(String tag, Long relatedid, String markname);
	ResultCode<Integer> getMarkValueCount(String tag, Long relatedid, String markname, int fromValue, int maxValue);
	ResultCode<Integer> getMarkListByMarkValue(String tag, Long relatedid, String markname, int markValue);
	ResultCode<Integer> getMarkRanking(String tag, Long relatedid, String markname, Long memberId);
	/**
	 * ��������
	 * @param movieId
	 * @param markname
	 * @param markCountVo
	 * @return
	 */
	ResultCode<Integer> computeMarkValue(Long movieId, String markname, MarkCountVo markCountVo);
	ResultCode<List<MarkChartsDataVo>> getMarkChartsData(Long movieId, Date statisticDate);
	/**
	 * ��ѯ��Ӱ������ϸ 
	 * @param movieId
	 * @return
	 */
	ResultCode<List<MovieGeneralmarkDetailVo>> getMovieGeneralmarkDetail(Long movieId);
	/**
	 * ��ѯ��Ӱ������ϸ 
	 * @param movieId
	 * @return
	 */
	ResultCode<List<Map>> getMovieGeneralmarkMap(Long movieId);
	
	/**
	 * ����ͳ��
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode<Map> getGradeCount(String tag, Long relatedid);
	/**
	 * ���ַּ�ͳ��
	 * ���磺���棺5.6  ��  ���飺7.2����Ч��3.1����Ա��6.6
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode<Map> getNewGradeDetail(String tag, Long relatedid);
	/**
	 * ��ȡ�·�ӳ�ĵ�Ӱ�Ƿ��й�Ʊ�û�����
	 * @param idList
	 * @return
	 */
	ResultCode<List<Long>>getOurPlayHaveScore(List<Long> idList);
}
