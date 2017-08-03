package com.gewara.api.pay.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

/**
 * ֧��������
 * @author songshi.wang
 *
 */
public interface PaySumApiService {

	/**
	 * ���ָ���̻���ָ���ڼ��֧����Ϣ
	 * @param merchantNo �̻���
	 * @param startDate	��ʼ���� yyyyMMdd ����
	 * @param endDate	�������� yyyyMMdd ������
	 * @return [{"merchantNo":"xxx","sumValue":9999,"sumDate":"yyyyMMdd"}]
	 */
	ResultCode<List<Map<String, Object>>> getSum(String merchantNo, String startDate, String endDate);
	
}
