package com.gewara.movie.api.service.baochang;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.baochang.BaoChangBasePriceInfoVo;
import com.gewara.movie.vo.baochang.BaoChangCinemaInfoVo;
import com.gewara.movie.vo.baochang.BaoChangCinemaRoomInfoVo;
import com.gewara.movie.vo.baochang.BaoChangMpiInfoVo;
import com.gewara.movie.vo.baochang.BaoChangMsgContentVo;
import com.gewara.movie.vo.baochang.BaoChangOrderInfoReq;
import com.gewara.movie.vo.baochang.BaoChangOrderInfoVo;

public interface BaoChangVoService {
	
	/**
	 * ��ѯ����ӰԺ��Ϣ
	 * @return
	 */
	ResultCode<List<BaoChangCinemaInfoVo>> getBaoChangCinemaInfoList();
	/**
	 * ����ӰԺID����ѯ��ӰԺ������԰�����Ӱ��
	 * @param cinemaid
	 * @return
	 */
	ResultCode<List<BaoChangCinemaRoomInfoVo>> getBaoChangCinemaRoomListByCinemaid(Long cinemaid);
	/**
	 * ��ѯ����Ӱ����Ϣ
	 * @param cinemaid
	 * @param roomid
	 * @return
	 */
	ResultCode<BaoChangCinemaRoomInfoVo> getBaoChangCinemaRoomListByCinemaidAndRoomid(Long cinemaid, Long roomid);
	/**
	 * ����ӰԺID����ѯ��������
	 * @param cinemaid
	 * @return
	 */
	ResultCode<List<BaoChangMpiInfoVo>> getBaoChangMpiInfoListByCinemaId(Long cinemaid);
	/**
	 * ����ӰԺid����ѯ����������Ϣ
	 * @param cinemaid
	 * @return
	 */
	ResultCode<List<BaoChangOrderInfoVo>> getBaoChangOrderInfoListByCinemaid(Long cinemaid);
	/**
	 * ���ݰ�������id����ѯ����������Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> getBaoChangOrderInfoById(Long id);
	/**
	 * ����tag����ѯ��������ģ��
	 * @param tag
	 * @return
	 */
	ResultCode<String> getBaoChangMsgTemplate(String tag, String mobileType);
	/**
	 * ����tag����ѯ��������ģ����Ϣ
	 * @param tag
	 * @return
	 */
	ResultCode<BaoChangMsgContentVo> getBaoChangMsgContentByTag(String tag, String mobileType);
	/**
	 * ��ѯ�����۸���Ϣ��
	 * ��mpidΪ��ʱ����ѯBaoChangCinemaRoomInfo��Ӱ���۸�
	 * ��Ϊ��ʱ����ѯBaoChangMpiInfo�����μ۸�
	 * @param cinemaid
	 * @param roomid
	 * @param mpid ����Ϊ��
	 * @return
	 */
	ResultCode<BaoChangBasePriceInfoVo> getBaoChangPriceInfo(Long cinemaid, Long roomid, Long mpid);
	/**
	 * ��������������Ϣ
	 * @param req
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> createBaoChangOrderInfo(BaoChangOrderInfoReq req);
	/**
	 * ȡ������������Ϣ
	 * @param req
	 * @return
	 */
	ResultCode<List<BaoChangOrderInfoVo>> cancelBaoChangOrderInfo(BaoChangOrderInfoReq req);
	/**
	 * �˿��������
	 * @param req
	 * @return
	 */
	ResultCode<List<BaoChangOrderInfoVo>> refundBaoChangOrderInfo(BaoChangOrderInfoReq req);
	/**
	 * �µ�������������
	 * @param cinemaid
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangMpiInfoVo> lockBaoChangMpi(Long cinemaid, Long mpid);
	/**
	 * ȡ����������
	 * @param cinemaid
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangMpiInfoVo> unlockBaoChangMpi(Long cinemaid, Long mpid);
	/**
	 * ���׳ɹ������³���״̬
	 * @param cinemaid
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangMpiInfoVo> setBaoChangMpiSeccuss(Long cinemaid, Long mpid);
	/**
	 * ���ݶ����Ų�ѯ������������Ϣ
	 * @param tradeNo
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> getBaoChangOrderInfoByTradeNo(String tradeNo);
	/**
	 * ���ݶ����Ų�ѯ������������Ϣ��У�鶩����
	 * @param tradeNo
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> getBaoChangOrderInfo(String tradeNo, String memberEncode, String remoteIp);
	/**
	 * ���׳ɹ������ð�����Ϣ״̬
	 * @param tradeNo
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> setBaoChangOrderPaidSuccess(String tradeNo);
	/**
	 * ��ѯ�����˽��׳ɹ����š�push����
	 * @return
	 */
	ResultCode<Map<String, String>> getBaoChangMsgMap(Map<String, String> dataMap, String sendType);
	/**
	 * ���ݳ���ID����ѯ֧���ɹ�������Ϣ
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> getBaoChangPaidSuccessOrderByMpid(Long mpid);
	/**
	 * �˿������״̬����Ϊ����
	 * @param cinemaid
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangMpiInfoVo> setBaoChangMpiRefund(Long cinemaid, Long mpid);
	/**
	 * ���ݶ����Ų�ѯ����������Ϣ��ʹ�û���
	 * @param tradeNo
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> getBaoChangOrderInfoByTradeNoUseCache(String tradeNo);
	/**
	 * ȡ��token
	 * @param memberid
	 * @param mpid
	 * @return
	 */
	ResultCode<String> getEncryptInfo(Long memberid, Long mpid);
	/**
	 * У��token
	 * @param encryptbc
	 * @param memberid
	 * @param mpid
	 * @return
	 */
	ResultCode<Boolean> isValidEncryptInfo(String encryptbc, Long memberid, Long mpid);
	/**
	 * ȡ������Ӱ����ʱ���
	 * @param cinemaid
	 * @param roomid
	 * @param appointmentDate
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode unlockBaoChangRoom(Long movieid, Long cinemaid, Long roomid, Date appointmentDate, String startTime, String endTime);
	/**
	 * �˿�ʱ��ɾ����ѡ��λ��Ϣ������
	 * @param mpid
	 * @param memberid
	 * @param seatsParams
	 * @return
	 */
	ResultCode<Integer> deleteBaoChangOtherInfo(Long mpid, Long memberid, List<Map<String, String>> seatsParamsList);
	
	ResultCode<List<BaoChangCinemaInfoVo>> getAllAppointmentCinemaList();
	
	ResultCode<List<BaoChangOrderInfoVo>>  getValidBaoChangOrderByMemberid(Long memberid);

}
