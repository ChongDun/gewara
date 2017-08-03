package com.gewara.movie.api.service;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieIconVo;

public interface MovieIconVoService {
	/**
	 * ����movieId��ȡIconList
	 * @param movieid
	 * @return
	 */
	ResultCode<List<MovieIconVo>> getMovieIconListByMovieId(Long movieId);
	/**
	 *����ID��ȡMovieIcon
	 * @param id
	 * @return
	 */
	ResultCode<MovieIconVo> getMovieIconById(String id);
	/**
	 * ����IDɾ��MovieIcon
	 * @param id
	 * @return
	 */
	ResultCode removieMovieIconById(String id);
	/**
	 * ���ӻ���ɾ��MovieIcon
	 * @param movieIconVo
	 * @return
	 */
	ResultCode<MovieIconVo> saveOrUpdateMovieIcon(MovieIconVo movieIconVo);
	
}
