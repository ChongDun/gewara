package com.gewara.movie.api.service.admin;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieVideoVo;

public interface MovieVideoAdminVoService {
	/**
	 * ����movievideo����
	 * @param movieid
	 * @param videoid
	 * @param imgUrl
	 * @return
	 */
	ResultCode<MovieVideoVo> saveOrUpdateMovieVideo(Long movieid, String videoid, String imgUrl);
	/**
	 * ɾ��movievideo����
	 * @param videoid
	 * @return
	 */
	ResultCode<MovieVideoVo> removeMovieVideoByVideoid(String videoid);
	/**
	 * ����videoid��ѯMovieVideo
	 * @param videoid
	 * @return
	 */
	ResultCode<MovieVideoVo> getMovieVideoByVideoid(String videoid);
}
