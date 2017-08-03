package com.gewara.api.mobile.service;

import java.util.List;

import com.gewara.api.Response;
import com.gewara.api.vo.ResultCode;

/**
 * �ֻ��ŷ���
 * @author quzhuping
 *
 */
public interface MobileService {

	/**
	 * ���洫�ݹ������ֻ����б�
	 * @param mobileList
	 * @return
     * @see #saveMobiles2
	 */
	@Deprecated
	public Response saveMobiles(List<String> mobileList);

	/**
	 * ���洫�ݹ������ֻ����б�
	 * @param mobileList
	 * @return
	 */
	public ResultCode saveMobiles2(List<String> mobileList);
	
	/**
	 * ��mongo���������ֻ���
	 * @param batchId mongo���κ�
	 * @return
     * @see #batchImportMobiles2
	 */
	@Deprecated
	public Response batchImportMobiles(String batchId);
	
	/**
	 * ��mongo���������ֻ���
	 * @param batchId mongo���κ�
	 * @return
	 */
	public ResultCode batchImportMobiles2(String batchId);
	
}
