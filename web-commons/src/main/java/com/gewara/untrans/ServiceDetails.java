package com.gewara.untrans;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("details")
public class ServiceDetails {
	private String systemId;	//�����ṩ��ϵͳId
	private String name; 		//��������
	private String address;		//IP��ַ
	private int port;			//����˿�
	private String uri;			//����uri {scheme}://foo.com:{port}
	
	public ServiceDetails(){
	}
	
	/**
	 * ���캯��
	 * @param systemId �����ṩ��ϵͳId
	 * @param name ��������
	 * @param address IP��ַ
	 * @param port ����˿�
	 * @param uri ����uri {scheme}://foo.com:{port}
	 */
	public ServiceDetails(String systemId, String name, String address, int port, String uri){
		this.systemId = systemId;
		this.name = name;
		this.address = address;
		this.port = port;
		this.uri = uri;
	}
	
	/**
	 * ����servicenName
	 * @param systemId
	 * @param name
	 * @return systemId + "|" + name;
	 */
	public static String buildServiceName(String systemId, String name){
		return systemId + "|" + name;
	}
	
	public String getSystemId() {
		return systemId;
	}
	
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
