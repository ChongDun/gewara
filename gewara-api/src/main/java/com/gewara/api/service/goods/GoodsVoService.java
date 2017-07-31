package com.gewara.api.service.goods;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.goods.GoodsExtraVo;
import com.gewara.api.vo.goods.GoodsVo;


public interface GoodsVoService {
	
	ResultCode<List<GoodsVo>> getGoodsByTagAndRelatedid(String tag, Long relatedid);
	/**
	 * ����goodsId��ȡGoods��ϸ����
	 * @param goodId
	 * @return
	 */
	ResultCode<GoodsVo> getBaseGoodsById(Long goodId);
	
	/**
	 * ��ȡ��Ʒ���µ�����
	 * @param goodids
	 * @return
	 */
	ResultCode<Map<Long, Integer>> getGoodsMapAllownum(Long ... goodids);

	/**
	 * Ԥ��ǰ����<b>memberid</b>
	 * @param memberid
	 * @param goodsid
	 * @return
	 */
	ResultCode<Boolean> addRemindMe(Long memberid, String mobile, Long goodsid);
	
	/**
	 * <b>goodsid</b>������������
	 * @param goodsid
	 * @return
	 */
	ResultCode<Integer> getRemindCount(Long goodsid);
	
	/**
	 * �ж�<b>memberid</b>�Ƿ��Ѿ���ӵ���������.<br/>
	 * �������жϣ�
	 * 1: goodsid + memberid ���ϲ�ѯ������н������˵�����memberid�Ѿ��������б����ˣ�����<br/>
	 * 2: goodsid + mobile ���ϲ�ѯ������н������˵�����mobile�Ѿ��������б����ˣ�����
	 * @param memberid
	 * @param goodsid
	 * @return
	 */
	ResultCode<Boolean> isMeInRemindList(Long memberid, Long goodsid, String mobile);
	
	/**
	 * �ۺ�ҳ��ӿ�
	 * @param memberid ��¼�û��ı�ʶ
	 * @param mobile   �ֻ�����
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsList(Long memberid,String mobile);
	
	
	/**
	 * ��ȡͬ����Goods����(��describeId��ȵ�����)
	 * @param describeId
	 * @return
	 */
	ResultCode<List<GoodsVo>> getSameLevelGoodsList(Long describeId);
	
	
	ResultCode<List<GoodsVo>>getGoodsListByTagOrItemtypeFixedsmalltype(final String tag, final Long relatedid, String order, boolean asc, int from, int maxnum);
	ResultCode<GoodsVo> getBindGoodsVo(Long mpid, String appkey);
	/**
	 * ��Goods��������
	 * @return
	 */
	ResultCode<GoodsVo> getGoods(Long goodsid);
	/**
	 * ��������Ʒ��ӰԺID�б�������������
	 * @param citycode
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByGoods(String citycode);
	/**
	 * ����tag��״̬��ȡӰԺ�б�
	 * @param tag
	 * @param status
	 * @return
	 */
	ResultCode<List<Long>> getCinemaVoByTag(String tag, String status);
	/**
	 * ��GoodsExtraVo����
	 * @return
	 */
	ResultCode<List<GoodsExtraVo>> getGoodsExtraList(Long... goodsids);
	/**
	 * ��ѯӰԺ�ײ�
	 * @param relatedid
	 * @param isGift
	 * @param order
	 * @param asc
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsListByBmhAndGift(Long relatedid, boolean isGift, String order, boolean asc, int from, int maxnum);
	/**
	 * 
	 * ���ݳ��ݻ���Ŀ��ѯ��Ʒ��Ϣ
	 * @param tag
	 * @param relatedid
	 * @param smalltype
	 * @param order
	 * @param asc
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsListByTagOrItemtype(String tag, Long relatedid, String smalltype, String order, boolean asc, int from, int maxnum);
	/**
	 * ����IDȡ��goosextra 
	 * @param id
	 * @return
	 */
	ResultCode<GoodsExtraVo> getGoodsExtraVoById(Long id);
	
	/**
	 * 
	 * ������Ŀ��ѯ��Ʒ��Ϣ
	 * @param itemid
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsListByItemid(Long itemid);
	/**
	 * 
	 * ����IDList��ѯgoods
	 * @param idList  ID����
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsListByIdList(List<Long> idList);
	/**
	 * 
	 * ����smailid��ѯ���Ʒ��Ϣ
	 * @param itemid
	 * @return
	 */
	ResultCode<List<GoodsVo>> getGoodsListBySmalId(Long smalid);
	/**
	 * ���µ�֮ǰУ�������
	 * @param goodsid
	 * @return
	 */
	ResultCode<Map<String, Integer>> checkSpcounterBeforeAddOrder(Long goodsid);
	/**
	 * ��ȡ��Ʒ��������Ϣ
	 * @param goodsid
	 * @return
	 */
	public ResultCode<Map<Long,Map<String, Integer>>> getSpcounter(List<Long> goodsid);
	
}
