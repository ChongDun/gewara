package com.gewara.api.service.sysmessage;

import com.gewara.api.vo.ResultCode;

public interface SysMessageVoService {

	/**
	 * ���ݺ�̨��Ӫϵͳ��Ϣid��ȡ  ͼ�Ļ�������
	 * @param id
	 * @return
	 */
	ResultCode<String> getSysMessageContentById(String id);
	
	/**
	 * ���¼���Ȩ���б�
	 * @return
	 */
	ResultCode<String> reloadAcl();
}
