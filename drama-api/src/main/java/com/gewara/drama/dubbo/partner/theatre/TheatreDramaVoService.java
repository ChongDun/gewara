package com.gewara.drama.dubbo.partner.theatre;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaVo;
import com.gewara.drama.vo.partner.req.TheatreDramaReqVo;

public interface TheatreDramaVoService {
	
	/**
	 * ��ȡ������Ŀ
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByTheatre(TheatreDramaReqVo reqVo);
}
