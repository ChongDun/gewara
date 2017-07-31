package com.gewara.untrans;

import java.util.Map;

/**
 * �첽ִ������
 * 
 * @author gebiao(ge.biao@gewara.com)
 * @since Jul 4, 2012 11:00:25 AM
 */
public interface AsynchTaskService {
	void addTask(AsynchTask task);
	/**
	 * �ȴ�waitTimeSecond������minCount��һ��ִ��
	 * @param task
	 * @param waitTimeSecond
	 * @param minCount
	 */
	void addTask(AsynchTask task, int waitTimeSecond, int minCount);

	void cancleTask(String taskUkey);

	void registerTaskProcessor(String tasktype, AsynchTaskProcessor processor);

	int getExecutorActiveCount();

	Map<String, Integer> getTaskQueueMap();
	int getQueueSize();
}
