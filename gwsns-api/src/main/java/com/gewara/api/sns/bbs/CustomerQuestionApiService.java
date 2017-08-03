package com.gewara.api.sns.bbs;

import java.util.List;

import com.gewara.api.sns.vo.bbs.CustomerAnswerVo;
import com.gewara.api.sns.vo.bbs.CustomerQuestionVo;
import com.gewara.api.vo.ResultCode;

/**
 *    @function �û������ռ�Service
 * 	@author bob.hu
 *		@date	2011-03-11 14:32:11
 */
public interface CustomerQuestionApiService {
	
	ResultCode<List<CustomerQuestionVo>> getQuestionsBykey(String citycode, String tag, String searchkey, String status, int from, int maxnum);
	ResultCode<Integer> getQuestionCountBykey(String citycode, String tag, String searchkey, String status);
	
	/**
	 *  ���� qid, ��ѯĳ�û������Ӧ�Ļظ�
	 * */
	ResultCode<List<CustomerAnswerVo>> getAnswersByQid(Long qid, int from, int maxnum);
	ResultCode<Integer> getAnswerCountByQid(Long qid);
	ResultCode<List<CustomerQuestionVo>> getCustomerQList(Long memberid, String citycode, String tag, int from, int maxnum);
	ResultCode<Integer> getCustometQCount(Long memberid, String citycode, String tag);
	
	ResultCode<CustomerQuestionVo> addCustomerQuestion(String citycode, Long memberid, String email, String tag, String body, String type);
	
	/**
	 * �޸�customerQuestion status
	 * @param qid 
	 * @param status
	 */
	ResultCode updateQuestionStatus(Long qid, String status);
	
	/**
	 * ��ȡCustomerQuestion
	 * @param qid
	 * @return
	 */
	ResultCode<CustomerQuestionVo> getCustomerQuestion(Long qid);
	
	/**
	 * ��ȡCustomerAnswer
	 * @param aid
	 * @return
	 */
	ResultCode<CustomerAnswerVo> getCustomerAnswer(Long aid);
	/**
	 * ����CustomerAnswer
	 * @param answer
	 * @return
	 */
	ResultCode<CustomerAnswerVo> saveCustomerAnswer(CustomerAnswerVo answer);
	/**
	 * �޸�CustomerQuestion
	 * @param customerQuestion
	 * @return
	 */
	ResultCode<CustomerQuestionVo> updateCustomerQuestion(CustomerQuestionVo customerQuestion);

}
