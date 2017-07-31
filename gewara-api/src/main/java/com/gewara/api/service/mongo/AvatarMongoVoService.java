package com.gewara.api.service.mongo;

import java.util.List;
import java.util.Map;

import com.gewara.api.partner.res.vo.MovieAppIconVo;
import com.gewara.api.partner.res.vo.PhoneActivityVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.mongo.FriendCardCfgVo;
import com.gewara.api.vo.mongo.GewaraMoviePlayVo;
import com.gewara.api.vo.mongo.PersonalSeatVo;
import com.gewara.api.vo.mongo.RoomOuterRingSeatVo;
import com.gewara.api.vo.mongo.SeeMovieVo;
import com.gewara.api.vo.mongo.SpecilMpiAppIconVo;
import com.gewara.api.vo.mongo.WeixinFriendCardVo;

public interface AvatarMongoVoService {

	/**
	 * ��ȡ��Ʊ����
	 * @return
	 */
	ResultCode<List<Map>> getBuyTicketRankingList();
	
	/**
	 * ���ݳ��б����ѯIndexPageEffectRoom�б� ,��order�ֶ�����
	 * @param cityCode
	 * @return
	 */
	ResultCode<List<Map>> getIndexPageEffectRoomListByCityCodeAsc(String cityCode);
	
	/**
	 * ��ѯSeeMovie�б�
	 * @param tag 			����Ϊ��
	 * @param relatedId
	 * @param from			����Ϊ��
	 * @param maxnum		����Ϊ��
	 * @return
	 */
	ResultCode<List<SeeMovieVo>> getSeeMovieList(String tag, Long relatedId, int from, int maxnum);
	
	/**
	 * ����ShortUrl
	 * @param tradeNo
	 * @param addNum
	 * @return
	 */
	ResultCode<String> saveShortUrl(String tradeNo, int addNum);
	
	/**
	 * ��ѯ FriendCardCfg �б�
	 * @param cardId
	 * @return
	 */
	ResultCode<List<FriendCardCfgVo>> getFriendCardCfgListByCardId(String cardId);
	
	/**
	 * ��ѯ΢�����ѿ�ȯ�б�
	 * @param cardId
	 * @param openId
	 * @param cardCode
	 * @return
	 */
	ResultCode<List<WeixinFriendCardVo>> getWeixinFriendCardList(String cardId, String openId, String cardCode);
	
	/**
	 * ����΢�����ѿ�ȯ
	 * @param friendCard
	 * @return
	 */
	ResultCode saveWeixinFriendCard(WeixinFriendCardVo friendCard);
	
	/**
	 * ��ȡ��������ӳ
	 * @return
	 */
	ResultCode<List<GewaraMoviePlayVo>> getGewaraMoviePlayList();
	
	/**
	 * ��ȡMovieAppIcon�б� 
	 * @return
	 */
	ResultCode<List<MovieAppIconVo>> getMovieAppIconList();
	
	/**
	 * ����ID��ѯ��ӰAPP���ⳡ�δ��
	 * @param id
	 * @return
	 */
	ResultCode<SpecilMpiAppIconVo> getSpecilMpiAppIconById(String id);
	
	/**
	 * ���ݵ�ǰʱ���ѯPersonalSeat �б�
	 * ��ѯʱ��> stoptime
	 * @return
	 */
	ResultCode<List<PersonalSeatVo>> getPersonalSeatListGTStopTime();
	
	/**
	 * ���ݵ�ǰʱ���ѯPersonalSeat �б�
	 * ��ѯʱ��>= stoptime
	 * @return
	 */
	ResultCode<List<PersonalSeatVo>> getPersonalSeatListGTEStopTime();
	
	/**
	 * ����ID��ѯPhoneActivity
	 * @param activityId
	 * @return
	 */
	ResultCode<PhoneActivityVo> getPhoneActivityById(String activityId);
	
	/**
	 * ����roomId��ѯ RoomOuterRingSeat�б�
	 * @param roomId
	 * @return
	 */
	ResultCode<List<RoomOuterRingSeatVo>> getRoomOuterRingSeatListByRoomId(Long roomId);
	
	/**
	 * ���� RoomOuterRingSeat
	 * @param outerRingSeat
	 * @return
	 */
	ResultCode saveOrUpdateRoomOuterRingSeat(RoomOuterRingSeatVo outerRingSeat);
}
