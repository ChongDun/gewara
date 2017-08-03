package com.gewara.api.sns.recommend;

import java.util.List;

import com.gewara.api.sns.vo.recommend.RecommendBatchDetailVo;
import com.gewara.api.sns.vo.recommend.RecommendBatchVo;
import com.gewara.api.vo.ResultCode;

/**
 * �Ƽ�api
 * 
 * @author zxl
 * 
 */
public interface RecommendApiService {

	/**
	 * ��ȡ���µ��Ƽ�
	 * @param type
	 * @return
	 */
	ResultCode<RecommendBatchVo> getLatestRecommendBatch(String type);

	/**
	 * �ж��Ƿ��Ƽ�
	 * @param condition
	 * @param memberid
	 * @return
	 */
	ResultCode<Boolean> checkRecommendCondition(String condition, Long memberid);

	/**
	 * ��ȡ�Ƽ�����ϸ����
	 * @param batchId
	 * @param tag
	 * @return
	 */
	ResultCode<List<RecommendBatchDetailVo>> getRecommendBatchDetails(Long batchId,String[] tag);

	/**
	 * ��ҳ��ȡ
	 * @param batchId
	 * @param tag
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<RecommendBatchDetailVo>> getRecommendBatchDetailsWithPage(Long batchId, String[] tag, Integer from, Integer maxnum);

}
