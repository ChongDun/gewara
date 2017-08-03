package com.gewara.mall.dubbo;

import com.gewara.api.vo.ResultCode;

public interface MallVoService {
	/**
	 * ��ȡ֧����֤��Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<String> getPayinfoByTradeNo(String tradeNo);
	/**
	 * ��ȡ���׳ɹ���Ҫ���û������ֻ���������
	 * @param tradeNo
	 * @return
	 */
	ResultCode<String> getSmsContentByTradeNo(String tradeNo);
	/**
	 * ��������֪ͨmallϵͳ�ñʶ������mallϵͳ���ظñʶ����Ƿ��ܴ���ɹ�
	 * @param tradeNo
	 * @return
	 */
	ResultCode processOrderConfirm(String tradeNo);
	/**
	 * �޸Ķ�����ݵ�ַ
	 * @param userId
	 * @param mallOrderId
	 * @param mobile
	 * @param realname
	 * @param citycode
	 * @param cityname
	 * @param countycode
	 * @param countyname
	 * @param address
	 * @return
	 */
	ResultCode modMemberUsefulAddress(Long userId, Long mallOrderId, String mobile, String realname, 
			String citycode, String cityname, String countycode, String countyname, String address);
}
