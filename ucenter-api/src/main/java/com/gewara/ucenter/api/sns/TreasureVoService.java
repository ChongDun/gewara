package com.gewara.ucenter.api.sns;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.sns.TreasureVo;

public interface TreasureVoService {
	ResultCode<TreasureVo> getTreasureByTagMemberidRelatedid(String tag, Long memberid, Long relatedid, String action);
	ResultCode<List<Long>> getTreasureIdList(Long memberId, String tag, String action, int from, int maxnum);
	ResultCode addTreasure(Long memberid, String tag, Long relatedid, String action);
	/**
	 * ������ע
	 * @param memberid
	 * @param tag
	 * @param relatedid
	 * @param action
	 * @return
	 */
	ResultCode addTreasure(Long memberid, String tag, List<Long> relatedid, String action);
	ResultCode delTreasure(Long id, Long movieId);
	ResultCode delTreasureById(Long id);
	ResultCode<List<Long>> getTreasureCinemaidList(/*String citycode, */Long memberid);
	ResultCode<List<Long>> getTreasureIdListNoPage(Long memberId, String tag, String action);
	/**
	 * ��¼��Ӱ��ע��
	 * @param memberId
	 */
	ResultCode addCollectedtimes(Long movieId);
	/**
	 * ӰԺӰƬ���ݵĹ�ע��
	 * @param tag
	 * @param relatedId
	 */
	ResultCode addRelatedClickedtimes(String tag, Long relatedId);
	/**
	 * ����memberId��movieid���ж�songIdList���Ƿ���ӹ�ע
	 * @param memberId
	 * @param songIdList
	 * @return ����map�ṹ���ݣ�key=����ID��value=�Ƿ�ϲ����0��δϲ����1����ϲ����
	 */
	ResultCode<Map<String, String>> getIsLikeMovieMusic(Long memberId, List<String> songIdList);
}
