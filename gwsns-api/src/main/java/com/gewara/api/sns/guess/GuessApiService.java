package com.gewara.api.sns.guess;

import java.util.List;

import com.gewara.api.sns.vo.guess.BettingOptionCountVo;
import com.gewara.api.sns.vo.guess.BettingOptionVo;
import com.gewara.api.sns.vo.guess.GuessSetupVo;
import com.gewara.api.sns.vo.guess.UserBettingVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

/**
 * ��Ʊ���ӿ�
 *
 */
public interface GuessApiService {
	
	/**
	 * ��ȡ��Ʊ��
	 * @param   id  Ʊ������ID
	 */
	ResultCode<GuessSetupVo> getGuessById(Long id);
	 /**
     * ����Ʊ������ID��ȡͶעѡ��
     * @param   relatedid  Ʊ������ID
     */
	ResultCode<List<BettingOptionVo>> getBettingOptionsByRelatedId(Long relatedid);
	/**
	 * Ͷעѡ��ID��ȡ����
	 * @param   id    ����ID
	 */
	ResultCode<BettingOptionVo> getBettingOptionById(Long id);
	
	/**
     * ��ȡ�û�Ͷע�Ĳ�Ʊ����Ϣ
     * @param   memberid  �û�ID  
     * @param   stepid ���ò�Ʊ��ID
     */
	ResultCode<UserBettingVo> getUserBetting(Long memberid,Long stepid);
	
	/**
     * ��ȡ��Ʊ��Ͷע������
     * @param   stepid ���ò�Ʊ��ID
     */
	ResultCode<Integer> getBettingCount(Long stepid);
	
	/**
     * ��ȡ��Ʊ��Ͷע�û�ID
     * @param   stepid ���ò�Ʊ��ID
     */
	ResultCode<List<Long>> getUserIdBetting(Long stepid,int from, int maxnum);
	/**
	 * ��ȡͶעѡ����Ϣ
	 * @param   optionid Ͷעѡ��ID
	 */
	ResultCode<BettingOptionCountVo> getBettingOptionCount(Long optionid);
	/**
	 * ��ȡ��Ͷעѡ�������� 
	 * key --ѡ��ID value--������
	 * @param   stepid ���ò�Ʊ��ID
	 */
	ResultCode<VoMap<Long,Integer>> getVoMapCount(Long stepid);
	/**
	 * �����û�Ͷעѡ����Ϣ
	 * @param   memberid �û�ID
	 * @param   stepid ���ò�Ʊ��ID
	 * @param   optionid Ͷעѡ��ID 
	 * @param   num  Ͷע����
	 * @param   point Ͷע�ܻ���
	 */
	ResultCode saveUserBetting(Long memberid,Long stepid,Long optionid,Integer num,Integer point);
	
	/**
	 * �ع��û�Ͷעѡ����Ϣ
	 * @param   memberid �û�ID
	 * @param   stepid ���ò�Ʊ��ID
	 * @param   optionid Ͷעѡ��ID 
	 * @param   num  Ͷע����
	 * @param   point Ͷע�ܻ���
	 */
	ResultCode rollBackUserBetting(Long memberid, Long stepid,Long optionid, Integer num, Integer point);
	
	
}
