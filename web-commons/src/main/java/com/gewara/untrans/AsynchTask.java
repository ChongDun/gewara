package com.gewara.untrans;

import java.util.HashMap;
import java.util.Map;

public class AsynchTask {
	private long addtime;		//���ʱ��
	private long validtime;		//������Чʱ�䣬����ֱ�Ӻ���
	private boolean requireLock;
	public void setRequireLock(boolean requireLock) {
		this.requireLock = requireLock;
	}
	public boolean isRequireLock() {
		return requireLock;
	}
	public long getValidtime() {
		return validtime;
	}
	public void setValidtime(long validtime) {
		this.validtime = validtime;
	}
	private String tasktype;	//��������
	private String taskUkey;	//����Ψһ��ʶ��Ψһ��ʶ��ͬ���������ʹ����ͬ�ķ������ݣ��������δ��ʱ�Ļ���
	private Map otherinfo = new HashMap();		//������Ϣ
	public AsynchTask(String tasktype, String taskUkey, int maxWaitSeconds, boolean requireLock){
		this.tasktype = tasktype;
		this.taskUkey = taskUkey;
		this.addtime = System.currentTimeMillis();
		this.validtime = addtime + maxWaitSeconds * 1000;
		this.requireLock = requireLock;
	}
	public String getGlobalUkey(){
		return tasktype + taskUkey;
	}
	public String getTaskUkey() {
		return taskUkey;
	}
	/**
	 * �����Ψһ��ʶ��������ͬ��task��������ͬ������
	 * @return
	 */
	public String getTasktype() {
		return tasktype;
	}
	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
	}
	public long getAddtime() {
		return addtime;
	}
	public void addInfo(String key, Object value){
		otherinfo.put(key, value);
	}
	public Object getInfo(String key){
		return otherinfo.get(key);
	}
	public boolean isTimeout(){
		return getValidtime()<=System.currentTimeMillis();
	}
}
