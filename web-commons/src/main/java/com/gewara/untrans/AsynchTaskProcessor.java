package com.gewara.untrans;

public interface AsynchTaskProcessor<T extends AsynchTask> {
	void processTask(T task);
	/**
	 * ���Ĵ��¸�����������
	 * @param maxLock
	 */
	int getLockSize();
}
