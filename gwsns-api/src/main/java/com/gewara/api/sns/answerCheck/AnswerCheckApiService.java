package com.gewara.api.sns.answerCheck;

import com.gewara.api.sns.vo.AnswerCheckVo;
import com.gewara.api.sns.vo.AnswerQuestionVo;
import com.gewara.api.sns.vo.UserAnswerVo;
import com.gewara.api.vo.ResultCode;

public interface AnswerCheckApiService {
	/**
	 * ��ȡ������Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<AnswerCheckVo> getAnswerCheckList(Long id);
	/**
	 * ��ȡ���������
	 * @param id
	 * @return
	 */
	ResultCode<Integer> getAnswerQuestionNum(Long id);
	/**
	 * ��ȡ���
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<AnswerQuestionVo> getAnswerQuestionList(Long relatedid,Integer from, Integer maxnum);
	/**
	 * ��ȡ�û���������
	 * @param memberid
	 * @param id
	 * @return
	 */
	ResultCode<UserAnswerVo> getUserAnswer(Long memberid,Long id);
	/**
	 * �����û�������Ϣ
	 * @param memberid
	 * @param id
	 * @param Index
	 * @param num
	 * @param content
	 * @param total
	 */
	ResultCode saveUserAnswer(Long memberid,Long relatedid,Integer index,Integer num,String content,Integer total, boolean flag, Long id,Integer answer);
	/**
	 * ����id��ȡ�����Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<AnswerQuestionVo> getAnswerQuestionById(Long id);
}
