package com.gewara.movie.api.service.brand;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.brand.BrandVo;

public interface BrandVoService {
	
	/**
	 * ����Ʒ�����Ʋ�ѯƷ������
	 * @param brandName	Ʒ������
	 * @return
	 */
	ResultCode<BrandVo> getBrandByName(String brandName);
	
	/**
	 * ����Ʒ��id��ѯƷ������
	 * @param id Ʒ��id
	 * @return
	 */
	ResultCode<BrandVo> getBrandById(Long id);
	
	/**
	 * ��ѯƷ���б�
	 * @return
	 */
	ResultCode<List<BrandVo>> getBrandList(int from,int to);
	
	/**
	 * ����Ʒ���б�
	 * @param brandName
	 * @return
	 */
	ResultCode<List<BrandVo>> searchBrandListByName(String brandName);
	
	/**
	 * ��ѯƷ��������
	 * @return
	 */
	ResultCode<Integer> getBrandCount();
	
	/**
	 * ����Ʒ������
	 * @return
	 */
	ResultCode save(BrandVo brand);
	/**
	 * ��ѯƷ���б����IDLIST
	 * @return
	 */
	ResultCode<List<BrandVo>> getBrandListByIdList(List<Long> idList);
	
}
