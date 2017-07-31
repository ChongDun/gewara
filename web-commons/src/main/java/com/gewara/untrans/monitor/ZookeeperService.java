package com.gewara.untrans.monitor;

import java.util.List;
import java.util.Map;

import org.apache.curator.framework.recipes.leader.LeaderLatch;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.zookeeper.KeeperException;


public interface ZookeeperService  {
	
	boolean addPresistentNode(String path, String data);

	/**
	 * ������ʱ�ڵ㣨EPHEMERAL�ڵ㣬session���ڻ�رպ��Զ�ɾ����
	 * 
	 * @param path
	 * @param data
	 * @throws KeeperException
	 * @throws InterruptedException
	 */
	boolean addTempNode(String path, String data);
	boolean addSeqNode(String path, String data);

	boolean updateNode(String path, String data);

	boolean delNode(String path);

	List<String> getChildren(String path);

	Map<String, String> getChildrenData(String path);

	String getNodeData(String path);

	boolean exist(String path);
	void addMonitor(KeeperWatcher monitor);
	public List<KeeperWatcher> getMonitor();

	/**
	 * ϵͳ����ע��ڵ�
	 * @param nodePath
	 * @param nodeData
	 */
	void registerNode(String nodePath, String nodeData);

	/**
	 * ϵͳ����ע����ʱ�ڵ�
	 * <p>���nodePath���� "/s"��β����Ĭ�ϼ���
	 * @param nodePath
	 * @param nodeData
	 */
	void registerEphemeralNode(String nodePath, String nodeData);
	/**
	 * ɾ����ʱ�ڵ�
	 * <p> ���nodePath����ʱ�ڵ��ֵ����nodeData����ɾ������ʱ�ڵ�
	 * @param nodePath ��ʱ�ڵ�·��
	 * @param nodeData ���Ƚϵ�ֵ
	 */
	void unRegisterEphemeralNode(String nodePath, String nodeData);

	/**
	 * ����zk�������ע���߼�
	 * <p>���ó������磺openapiע�����
	 * @param nodePath 
	 * <p> ������"/s"��β�������׳��쳣
	 * @param nodeData
	 */
	void addReconnectedStateListener(String nodePath, String nodeData);

	/**
	 * �����ֲ�ʽ��
	 * @param path zk·��
	 * @return
	 * @author leo
	 * @addTime 2016��3��28������3:31:05
	 */
	InterProcessMutex createInterProcessMutex(String path);

	/**
	 * ����LeaderLatch
	 * @param latchPath zk·��
	 * @param id ��LeaderLatchID
	 * @return
	 * @author leo
	 * @addTime 2016��3��30������6:10:08
	 */
	LeaderLatch createLeaderLatch(String latchPath, String id);
}
