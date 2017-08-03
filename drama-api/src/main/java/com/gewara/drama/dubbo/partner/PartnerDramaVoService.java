package com.gewara.drama.dubbo.partner;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaVo;
import com.gewara.drama.vo.partner.req.PartnerDramaReqVo;

public interface PartnerDramaVoService {
	
	/**
	 * ��ȡ������Ŀ
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<DramaVo>> getCurHotDramaList(PartnerDramaReqVo reqVo);
}
