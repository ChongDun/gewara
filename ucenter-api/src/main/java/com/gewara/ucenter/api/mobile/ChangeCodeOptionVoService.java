package com.gewara.ucenter.api.mobile;

import com.gewara.api.vo.ResultCode;

public interface ChangeCodeOptionVoService {
	/**
	 * �л���̬�뷢��ѡ��   ���������
	 * @param option
	 */
	@Deprecated
	void updateSendOptionsMessage(String option);
	ResultCode updateSendOptionsMessage2(String option);
	/**
	 * ��̨�����ط��û��ֻ���̬��
	 * @param memberid �û�id
	 * @param sendtype �������� ���������
	 * @return
	 */
	ResultCode resendMessageByAdmin(String mobile, String sendtype);
	/**
	 * ���÷��ʹ���
	 * @param mobile �ֻ�����
	 * @param adminid ��̨����Աid
	 * @return
	 */
	ResultCode resetSendCount(String mobile, Long adminid, boolean clearAll);
}
