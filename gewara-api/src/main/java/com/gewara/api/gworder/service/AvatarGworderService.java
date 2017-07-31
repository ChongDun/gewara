package com.gewara.api.gworder.service;

import com.gewara.api.gworder.vo.ProcessOrderPayVo;
import com.gewara.api.vo.ResultCode;

public interface AvatarGworderService {

	/**
	 * 
	 * �������״̬�ǣ�paid_failure��ȥ���������飺<br/>
	 * 1��������֧����ȷ��֧�����Ķ������Żݣ�Ʊȯ������<br/>
	 * 2����֤�ɹ������ض���״̬��ʶ��ע������״̬����Ϊ��paid_failure_unfix<br/>
	 * 
	 * ͬʱ����ȡƱ���룬�������Ѿ��е�ֱ�ӷ��أ�û�е����ɸ�����
	 * 
	 * @param tradeNo
	 * @return
	 * @author leo
	 * @addTime 2016��8��29������16:13:48
	 */
	ResultCode<ProcessOrderPayVo> processOrderPay(String tradeNo);
}
