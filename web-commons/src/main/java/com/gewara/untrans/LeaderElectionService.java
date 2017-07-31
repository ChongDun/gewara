package com.gewara.untrans;

import java.io.IOException;
import java.util.List;

public interface LeaderElectionService {

	/**
	 * ����ѡ��
	 * @param key	����һ��ѡ��Ψһ��ʶ���ñ������ZK�ڵ������淶
	 * @param listener	����
	 * @throws Exception
	 * @author leo
	 * @addTime 2016��4��18������5:17:26
	 */
	void createElection(String key, GewaLeaderLatchListener listener) throws Exception;

	/**
	 * ����ѡ��
	 * @param key	����һ��ѡ��Ψһ��ʶ���ñ������ZK�ڵ������淶
	 * @param listenerList	����
	 * @throws Exception
	 * @author leo
	 * @addTime 2016��4��18������5:17:26
	 */
	void createElection(String key, List<GewaLeaderLatchListener> listenerList) throws Exception;

	/**
	 * �ر�ѡ��
	 * @param key	ѡ��Ψһ��ʶ
	 * @throws IOException
	 * @author leo
	 * @addTime 2016��4��18������5:23:58
	 */
	void closeElection(String key) throws IOException;

	/**
	 * ��Ӽ���
	 * @param key	ѡ��Ψһ��ʶ
	 * @param listener
	 * @author leo
	 * @addTime 2016��4��18������5:24:16
	 */
	void addListener(String key, GewaLeaderLatchListener listener);
	
	/**
	 * �жϵ�ǰ�Ƿ���leader
	 * @param key
	 * @return
	 * @author leo
	 * @addTime 2016��4��21������4:37:43
	 */
	boolean isLeader(String key);

}
