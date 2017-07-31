package com.gewara.untrans;

public interface LockOpService {
	/**
	 * ͬOperationService��ʹ��Memcacheʵ��
	 * @param opkey
	 * @param allowIntervalSecond
	 * @return lockvalue
	 */
	Long updateOperation(String opkey, int allowIntervalSecond);
	/**
	 * ͬOperationService��ʹ��Memcacheʵ��
	 * @param opkey
	 */
	void resetOperation(String opkey, Long lockvalue);
	/**
	 * flag��ʾ��ݣ�ͬһ���
	 * @param opkey
	 * @param allowIntervalSecond
	 * @param flag
	 * @return
	 */
	Long updateFlagOperation(String opkey, int allowIntervalSecond, String flag);
	/**
	 * ͬOperationService��ʹ��Memcacheʵ��
	 * @param opkey
	 */
	void resetFlagOperation(String opkey, String flag);
}
