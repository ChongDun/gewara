package com.gewara.api.sns.taskreward;

import java.util.List;

import com.gewara.api.sns.vo.taskreward.TaskRewardVo;
import com.gewara.api.vo.ResultCode;

public interface TaskRewardApiService {

	/**
	 * ��ȡ�����б�
	 * 
	 * @param type
	 * @param name
	 * @param score
	 * @param status
	 * @return
	 */
	ResultCode<List<TaskRewardVo>> getTaskRewardList(String type, String name, Integer score, String status);

	/**
	 * ��ȡΪ��ɵ�����
	 * 
	 * @param memberid
	 * @param taskid
	 * @return
	 */
	ResultCode<List<Long>> getUnFinishedTaskRewardList(Long memberid, List<Long> taskid);

	/**
	 * �������
	 * 
	 * @param memberid
	 * @param type
	 */
	void saveFinishedTask(Long memberid, String type);
	
	/**
	 * �ж��Ƿ�����������
	 * @param memberid
	 * @param type
	 * @return
	 */
	ResultCode<Boolean> checkHasFinishedTask(Long memberid, String type);
	
	/**
	 * ��ȡ����
	 * @param type
	 * @return
	 */
	ResultCode<TaskRewardVo> getTaskRewardDetail(String type);
	
	/**
	 * ��ȡ����������Ϣ
	 * @param status
	 * @return
	 */
	ResultCode<List> getTaskRewardBatch(String status, int from, int maxnum);
	
	/**
	 * ����id��������
	 * @param taskids
	 * @return
	 */
	ResultCode<List<TaskRewardVo>> getTaskRewardListByIds(List<Long> taskids);
	
	/**
	 * ����������ʾ��
	 * @return
	 */
	ResultCode<String> getScoreDesc();

}
