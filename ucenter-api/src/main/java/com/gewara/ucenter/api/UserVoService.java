package com.gewara.ucenter.api;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.user.UserVo;

public interface UserVoService {
	/**
	 * ��ȡ����Ա��Ϣ
	 * @param id ����Աid
	 * @return ����Աʵ�����
	 */
	ResultCode<UserVo> getUserVoById(Long id);
	/**
	 * ������ȡ����Ա
	 * @param ids  ����Աid����
	 * @return   ����Աʵ���������
	 */
	ResultCode<List<UserVo>> getUserVoListByIdList(Long ... ids);

}
