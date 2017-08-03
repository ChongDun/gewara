package com.gewara.movie.api.service.brand;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.brand.BrandStoreVo;

public interface BrandStoreVoService {
	
	/**
	 * ��ѯ�ŵ��б�
	 * @param from
	 * @param to
	 * @param citycode
	 * @param brandId
	 * @param status
	 * @return
	 */
	ResultCode<List<BrandStoreVo>> getBrandStoreInfoByBrandId(int from, int to,String citycode,Long brandId,Byte status);
	
	/**
	 * ��ȡ�ŵ������ 
	 * @param brandid	Ʒ��id
	 * @param citycode	����code
	 * @return
	 */
	ResultCode<Integer> getBrandStoreCount(Long brandid,String citycode);
	
	/**
	 * ����id��ȡ�ŵ������
	 * @param id
	 * @return
	 */
	ResultCode<BrandStoreVo> getBrandStore(Long id);
	/**
	 * �������ƻ�ȡ�ŵ������
	 * @param id
	 * @return
	 */
	ResultCode<BrandStoreVo> getBrandStoreByName(String name);
	/**
	 * ģ������
	 * @param storeName �ŵ����ƻ��ַ
	 * @return
	 */
	ResultCode<List<BrandStoreVo>> search(String storeNameOrAddress);
	/**
	 * �����ŵ�����
	 * @return
	 */
	ResultCode save(BrandStoreVo bs);
	/**
	 * �����ŵ�����
	 * @return
	 */
	ResultCode saveObjectList(List<BrandStoreVo> list);
	/**
	 * ɾ���ŵ�
	 * @param id
	 * @return
	 */
	ResultCode removeById(Long id);

	/**
	 * ��ѯ�ŵ��б�
	 * @param from
	 * @param to
	 * @param citycode
	 * @param brandId
	 * @param status
	 * @return
	 */
	ResultCode<List<BrandStoreVo>> getBrandStoreListByIdList(List<Long> idList);
	/**
	 * ��ѯ�ŵ��б�
	 * @param goodsid ��ƷID
	 * @param pointx ��ǰ����
	 * @param pointy ��ǰά��
	 * @return
	 */
	ResultCode<List<BrandStoreVo>> getBrandStoreListByGoodsId(Long goodsid, String pointx, String pointy, int from, int maxnum);
}
