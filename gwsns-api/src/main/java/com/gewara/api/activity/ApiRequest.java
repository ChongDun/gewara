package com.gewara.api.activity;

import java.io.Serializable;
import java.util.Map;

public abstract class ApiRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 549424954702608094L;

	public abstract Map<String, String> getTextParams();
	
	/**
	 * ������
	 * 
	 * @return
	 *
	 * @author leo.li
	 * Modify Time 2014��3��28�� ����3:12:12
	 */
	public abstract boolean checkParams();
}
