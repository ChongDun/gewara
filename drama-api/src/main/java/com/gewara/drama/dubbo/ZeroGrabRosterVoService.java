package com.gewara.drama.dubbo;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.ZeroGrabRosterVo;
import com.gewara.drama.vo.ZeroGrabTicketVo;
import com.gewara.drama.vo.ZgCounterVo;
import com.gewara.drama.vo.cmd.GrabRosterParamsVo;
/**
 * ��Ʊҵ����
 * @author ����ӥ
 *@date 2015��4��15�� 11:51:41
 */
public interface ZeroGrabRosterVoService {
	/**
	 * ��Ʊ�첽���ɶ�������Ʊ��wap�ˣ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<ZeroGrabRosterVo> addPartnerZeroGrabRoster(GrabRosterParamsVo reqVo);
	/**
	 * ��Ʊ�첽���ɶ�������Ʊ��web zhuanti�ˣ�
	 * @param reqVo
	 * @return
	 */
	ResultCode<ZeroGrabRosterVo> addZeroGrabRoster(GrabRosterParamsVo reqVo);
	
	/**
	 * ��֤�Ƿ�����Ʊ
	 * @param priceid
	 * @return
	 */
	ResultCode<Boolean> validZeroGrabTicket(Long priceid, Long memberid, String mobile);
	
	/**
	 * ͨ�������ʶ��ѯԤԼ��Ϣ
	 * @param flag
	 * @return
	 */
	ResultCode<ZeroGrabTicketVo> getZeroGrabTicketByFlag(String flag);
	
	/**
	 * ͨ�������ʶ��ѯԤԼ��Ϣ
	 * @param flag
	 * @return
	 */
	ResultCode<List<ZeroGrabTicketVo>> getZeroGrabTicketListByFlag(String ...flag);
	
	/**
	 * ��ѯ��ƱԤԼ�����
	 * @param priceid
	 * @return
	 */
	ResultCode<ZgCounterVo> getZgCounterByPriceid(Long priceid);
	/**
	 * ��ѯ��ƱԤԼ�����
	 * @param priceid
	 * @return
	 */
	ResultCode<List<ZgCounterVo>> getZgCounterListByPriceid(Long ...priceid);
}