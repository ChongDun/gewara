package com.gewara.ucenter.api.openlogin;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.OpenResultVo;

public interface MSQMAppAuthorizeVoService {
	
	/**
	 * ��������app ���ĵ�¼
	 * @param context ����
	 * @return
	 */
	ResultCode<OpenResultVo> getMSQMLoginMemberVoByContext(String context, String remoteIp);
}
