package com.gewara.api.service.movie;

import com.gewara.api.vo.ResultCode;

public interface MovieSettingVoService {
	/**
	 * ��Ӱ���ͻ���
	 * @param movieid
	 * @return
	 */
	ResultCode<Integer> getMovieScore(Long movieid);

}
