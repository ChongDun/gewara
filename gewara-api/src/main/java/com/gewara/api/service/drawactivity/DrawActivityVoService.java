package com.gewara.api.service.drawactivity;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.cmd.order.ParamsVo;
import com.gewara.api.vo.draw.DrawActivityVo;
import com.gewara.api.vo.draw.PrizeVo;
import com.gewara.api.vo.draw.WinnerInfoVo;

public interface DrawActivityVoService {
	
	/**
	 * ��ѯ�齱�
	 * @param param
	 * @return
	 */
	ResultCode<List<DrawActivityVo>> getDrawActivityList(ParamsVo param);
	
	/**
	 * ���ݲ�ͬ���Ϣ����Ʒ���ͣ���ѯ����Ϣ
	 * @param param
	 * @return
	 */
	ResultCode<List<WinnerInfoVo>> getWinnerList(ParamsVo param);
	
	/**
	 * ���ݲ�ͬ���Ϣ����Ʒ���ͣ���ѯ����Ϣ����
	 * @param param
	 * @return
	 */
	ResultCode<Integer> getWinnerCount(ParamsVo param);
	
	/**
	 * ��ȡ��Ʒ�б�
	 * @param prizeIdList
	 * @return
	 */
	ResultCode<List<PrizeVo>> getPrizeByList(List<Long> prizeIdList);
	
	/**
	 * ����������ȡ�
	 * @param activityId
	 * @return
	 */
	ResultCode<DrawActivityVo> getDrawActivityById(Long activityId);
	
	/**
	 * ����񽱸���
	 * @param drawActivityId
	 * @param memberid
	 * @return
	 */
	ResultCode<Integer> getCurChanceNum(Long drawActivityId, Long memberid);
	
	/**
	 * ��ѯ��ǰ�û��������������������
	 * @param param
	 * @return
	 */
	ResultCode<Integer> getInviteMemberCount(ParamsVo param);
	
	ResultCode<String> clickDrawByRelated(Long memberid, String tag, String noLimitDraw, String needGoodsOrder, Long relatedId, String ip);

	ResultCode<String> clickDraw(Long memberid, String tag, String source, String pricategory, String citycode, String pointxy, String ip);
	
	/**
	 * �齱�Ӵ�������
	 * @param memberid
	 * @param tag
	 * @param source
	 * @param pricategory
	 * @param citycode
	 * @param pointxy
	 * @param ip
	 * @param isMaxCount
	 * @param dayCount
	 * @return
	 */
	ResultCode<String> clickDrawWithCountControl(Long memberid, String tag, String source, String pricategory, String citycode, String pointxy, String ip, boolean isMaxCount, Integer dayCount);

	/**
	 * �ǵ�¼�û����ֻ��ų齱���������ã�
	 * @param da
	 * @param mobile
	 * @param ip
	 * @return
	 */
	ResultCode<String> clickDrawByMobile(String mobile, String tag, String source, String pricategory, String ip);
	
	/**
	 * �����ֻ�������ȯ(�û����Բ���¼��������ϵͳ���û�):
	 * 1:���oldUserTag��newUserTag����Ϊ��,��˵������������,�����û��߲�ͬ�Ľ���
	 * 2:���oldUserTagΪ��,newUserTag��Ϊ��,���ʾֻ�������û��齱
	 * 3:���oldUserTagΪ��,newUserTagΪ��,���Ϸ�
	 * 4:���oldUserTag��Ϊ��,newUserTagΪ��,���ʾ�����û���һ������,������˵���������û��齱(��ʱӦ�õ�������ĳ齱����)
	 * @see clickDrawByMobile(mobile, tag, source, pricategory, ip)
	 * @param mobile
	 * @param oldUserTag ���û��齱��ǩ,��������������û�,���ǳ齱��ǩ.
	 * @param source
	 * @param pricategory
	 * @param ip
	 * @param newUserTag ������������û�,���������
	 * @return
	 */
	ResultCode<String> clickDrawByMobileWithTag(String mobile, String oldUserTag, String source, String pricategory, String ip, String newUserTag);

	/**
	 * goods�����Զ��齱
	 * @param tradeno
	 * @param tag
	 * @param remoteIp
	 * @return
	 */
	ResultCode clickDrawByOrder(String tradeno, String tag, String remoteIp);
	
	ResultCode<List<Map>> getWinnerInfoList(String tag, String prizeType, String prizeOtype, int from, int maxnum);

	/**
	 * ���ݺ�����Ψһ��ʶpartnerUkey�齱(�ַ�)
	 * @param mobile
	 * @param tag
	 * @param source
	 * @param ip
	 * @return
	 */
	ResultCode<PrizeVo> clickDrawByPartnerUkeyPufa(String partnerUkey, String tag, String source, String ip);
	
	/**
	 * ���ݺ�����Ψһ��ʶpartnerUkey�齱
	 * @param mobile
	 * @param tag
	 * @param source
	 * @param ip
	 * @return
	 */
	ResultCode<PrizeVo> clickDrawByPartnerUkey(String partnerUkey, String tag, String source, String ip);

	/**
	 * ����winnerinfo��partnerukey���ѽ�Ʒ��ָ�����ֻ���,memberid����Ϊ��
	 * @param winnerInfoId
	 * @param partnerUkey
	 * @param mobile
	 * @return
	 */
	ResultCode<String> givePrize2Mobile(Long memberid, Long winnerInfoId, String partnerUkey, String mobile);
	
	
	/**
	 * ����齱�û����豸��Ϣ
	 * 
	 * @param deviceId
	 * @param imei
	 * @param tag
	 * @param memberid
	 * @param mobile
	 * @param appSource
	 * @return
	 */
	ResultCode<String> saveDrawDeviceInfo(String deviceId, String imei, String tag, String memberid, String mobile, String appSource);
	
	/**
	 * ��ȯ
	 * @param memberid
	 * @param cardNo  ����û��
	 * @param cardPass
	 * @param ip
	 * @param costPoint ���Ķ��ٻ��֣�<=0��null��ʾ�����Ļ���
	 * @return
	 */
	ResultCode<String> bindECard(Long memberId, String cardNo, String cardPass, String ip, Integer costPoint);
	/**
	 * ��ȡ���պ��
	 * @param drawid
	 * @param memberid
	 * @return
	 */
	ResultCode<PrizeVo> addLoginPointInFestival(Long drawid, Long memberid);
	
	
	/**
	 * ����tag��ȡ�
	 * @param tag
	 * @return
	 */
	ResultCode<DrawActivityVo> getDrawActivityByTag(String tag);
	
	/**
	 * ��ȡ�û�ʣ��齱����(���ݻ������Ŀ����)
	 * @param tag 
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode<String> getDrawAllowNumber(String tag, Long memberid, String remoteIp);
	
	/**
	 * ���ݹ�Ʊ�������Ͳ�ѯ�齱�
	 * @param tickettype
	 * @return
	 */
	ResultCode<List<DrawActivityVo>> getDrawActivityListByTickettype(String tickettype);
}
