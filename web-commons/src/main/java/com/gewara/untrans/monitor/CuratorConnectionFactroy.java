package com.gewara.untrans.monitor;

import java.io.IOException;

import org.apache.curator.framework.CuratorFramework;

public interface CuratorConnectionFactroy {
	/**
	 * ��ȡ��ʼ�����CuratorFramework
	 * @return
	 * @throws IOException δ��ʼ�����
	 */
	CuratorFramework getCuratorFramework() throws IOException ;
	
	void init() throws IOException;
}
