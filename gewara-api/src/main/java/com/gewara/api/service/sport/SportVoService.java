package com.gewara.api.service.sport;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.sport.SportVo;

public interface SportVoService {

	/** ͨ��id��ȡSportVo
	 * @param sportid
	 * @return
	 */
	ResultCode<SportVo> getSportVoById(Long sportid); }
