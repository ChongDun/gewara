package com.gewara.drama.dubbo.order;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.req.CheckMultiDramaRollCallReq;
import com.gewara.drama.vo.req.CheckSimpleDramaRollCallReq;

public interface DramaRollCallVoService {

	/**
	 * ��֤����Ʊ��Ŀ�Ƿ�������(��)
	 * @param siteSource	վ�� web, wap 
	 * @param dramaid		��ĿID
	 * @param theatreid		����ID
	 * @param member		�û�
	 * @param mobile		�ֻ���
	 * @param dpid			����ID
	 * @param buyCount		��Ʊ����
	 * @return
	 */
	ResultCode dramaRollCallByDpid(String siteSource, Long dramaid, Long theatreid, Long memberid, String mobile, Long dpid, Integer buyCount);
	
	ResultCode checkSimpleDramaRollCall(CheckSimpleDramaRollCallReq req);

	/**
	 * ��֤����Ʊ��Ŀ�Ƿ�������(��)
	 * @param siteSource	վ�� web, wap 
	 * @param dramaid		��ĿID
	 * @param theatreid		����ID
	 * @param member		�û�
	 * @param mobile		�ֻ���
	 * @param dpidList		����ID List
	 * @param buyCountMap	���ι�Ʊ����
	 * @return
	 */
	ResultCode dramaRollCallByDpidList(String siteSource, Long dramaid, Long theatreid, Long memberid, String mobile, List<Long> dpidList, Map<Long, Integer> buyCountMap);
	
	ResultCode checkMultiDramaRollCall(CheckMultiDramaRollCallReq req);
	
	
	ResultCode isDramaSpecialRollCallByPlaytime(Long dramaid, Long theatreid, Long memberid, String mobile, String playtime);



}
