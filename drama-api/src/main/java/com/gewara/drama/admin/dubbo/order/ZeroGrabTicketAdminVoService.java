package com.gewara.drama.admin.dubbo.order;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.ZeroGrabRosterVo;
import com.gewara.drama.vo.ZeroGrabTicketVo;
import com.gewara.drama.vo.ZgCounterVo;
import com.gewara.drama.vo.req.common.ZeroGrabReqVo;

public interface ZeroGrabTicketAdminVoService {
	
	ResultCode<ZeroGrabTicketVo> getZeroGrabTicketById(Long id);
	
	ResultCode<ZeroGrabTicketVo> saveZeroGrabTicket(RequestParamVo paramVo);
	
	ResultCode delZeroGrabTicket(Long id);
	
	/**
	 * ��ѯ��Ԫ��Ʊ��Ϣ
	 * @param title
	 * @param starttime
	 * @param endtime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<ZeroGrabTicketVo>> getZeroGrabTicketList(String title, Timestamp starttime, Timestamp endtime, int from, int maxnum);
	
	/**
	 * ͨ����Ʊ�ID��Ż�ȡ��Ʊ����Ϣ
	 * @param priceid
	 * @param mobile
	 * @param tradeno
	 * @return
	 */
	ResultCode<List<ZeroGrabRosterVo>> getZeroGrabRosterList(Long priceid, String mobile, String tradeno);

	ResultCode<List<ZeroGrabRosterVo>> getZeroGrabRosterPageList(ZeroGrabReqVo zeroGrabReqVo);

	/**
	 * ͨ��ID��Ż�ȡ��Ʊ����Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<ZeroGrabRosterVo> getZeroGrabRoster(Long id);
	
	/**
	 * ͨ��IDList��ȡZgCounter�б�
	 * @param ids
	 * @return
	 */
	ResultCode<List<ZgCounterVo>> getZgCounterList(Long ... ids);
	
	ResultCode<ZgCounterVo> getZgCounter(Long id);
	
	ResultCode<ZgCounterVo> saveZgCounter(RequestParamVo paramVo);
	
	
	

}
