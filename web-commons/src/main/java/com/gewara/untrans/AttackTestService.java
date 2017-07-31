package com.gewara.untrans;

import java.util.List;
import java.util.Map;

import com.gewara.bean.BlackMatcher;

public interface AttackTestService {
	/**
	 * �ڱ�ϵͳ�����Ӻ�����
	 * @param ip
	 * @param disableMin
	 * @return
	 */
	void addRealBlack(String ip, String uri, int disableMin);
	/**
	 * ���ú�����
	 */
	void resetBlack();
	/**
	 * ���ð�����
	 */
	void resetWhite();
	void setDisabled(boolean disabled);
	boolean checkBlackReq(String ip, String uri);
	public Map<String, BlackMatcher> getBlackMap();
	public boolean isDisabled();
	public List<String> getWhiteList();
	/**
	 * ����url��ȡ����ű�����monitorϵͳ������
	 * @param urlKey
	 * @return
	 */
	String getRegScript(String urlKey);
	
	/**
	 * ip segment
	 * @return
	 */
	Map<String, BlackMatcher> getBlackMap2();
	/**
	 * ���º�����
	 */
	void refreshBlack();
	/**
	 * ���°�����
	 * @param ips
	 * @param action
	 */
	void refreshWhite(String ips, String action);
}
