package com.gewara.api.terminal.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.terminal.vo.MachineAdVo;
import com.gewara.api.terminal.vo.MachineVo;
import com.gewara.api.vo.ResultCode;

/**
 * terminal �ṩ��dubbo����
 *
 */
public interface TerminalMachineVoSerice {

	ResultCode<List<MachineVo>> getMachineList(List<Long> placeIdList, String monitorType);

	ResultCode<List<MachineAdVo>> getMachineAdList(List<Long> placeIdList);

	ResultCode<MachineAdVo> getMachineAd(Long adid);

	ResultCode<String> delMachineAd(Long adid);

	ResultCode<MachineAdVo> saveMachine(MachineAdVo adVo, String realname);

	/**
	 * ���ݲ�ѯ��������ѯ�����ն˻���ӰԺ��Ϣ
	 * @param params
	 * @return
	 */
	ResultCode<List<Object>> getMachineCinemaList(Map<String, Object> params);
	
}
