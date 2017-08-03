package com.gewara.movie.api.service;

import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieMusicVo;
import com.gewara.movie.vo.MusicAlbumVo;

public interface MovieMusicService {
	/**
	 * ���ֺ�̨��ѯ��Ӱ��ص�����ר��
	 * @param movieid
	 * @return
	 */
	ResultCode<MusicAlbumVo> getMusicAlbumByMovieid(Long movieid);
	/**
	 * �޸�ר��ID
	 * @param albumVo
	 * @param movieid
	 * @return
	 */
	ResultCode updateMusicAlbum(MusicAlbumVo albumVo,Long movieid);
	/**
	 * ɾ��ר��
	 * @param list_id
	 * @param movieid
	 * @return
	 */
	ResultCode delMusicAlbum(String list_id,Long movieid);
	/**
	 * ���ϲ��
	 * @param song_id
	 * @return ����ϲ�������ϲ����
	 */
	ResultCode<Integer> addMusicCollection(String song_id, Long memberid);
	/**
	 * ȡ��ϲ��
	 * @param song_id
	 * @return ����ȡ��ϲ�������ϲ����
	 */
	ResultCode<Integer> cancelMusicCollection(String song_id, Long memberid);
	/**
	 * �޸�moviemusic����
	 * @param songId
	 * @param propertiesMap
	 * @return
	 */
	ResultCode<MovieMusicVo> updateMovieMusicProperties(String songId, Map<String, String> propertiesMap);
	
	void removeAllMusicRelation();
}
