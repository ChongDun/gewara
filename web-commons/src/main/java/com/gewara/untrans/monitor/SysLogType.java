package com.gewara.untrans.monitor;
public enum SysLogType{
	asynchTask("�첽�������"), 
	userlogin("�û���¼"),
	reqStats("Request����ͳ����־"),
	SMSERR("���ŷ���ʧ��"),
	order("������־"),
	hitCache("������λ����"),
	useElecCard("ʹ�õ���ȯ"),
	monitor("�������"),
	smswarn("��������"),
	terminalLog("�ն˼����־"),
	openapiLog("openapi�����־"),
	userOp("�û���Ҫ����"),
	saOp("SA����");
	private String description;
	public String getDescription() {
		return description;
	}
	private SysLogType(String description){
		this.description = description;
	}
}