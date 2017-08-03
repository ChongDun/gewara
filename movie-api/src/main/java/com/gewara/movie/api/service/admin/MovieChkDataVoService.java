package com.gewara.movie.api.service.admin;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaVo;
import com.gewara.movie.vo.MovieVo;

public interface MovieChkDataVoService {

	/**
	 * ��ѯδ�������ص�ӰԺ
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCountyisnull();
	
	/**
	 * ��ѯδ������Ƶ��ӰƬ
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByPrevideoisnull();
}
