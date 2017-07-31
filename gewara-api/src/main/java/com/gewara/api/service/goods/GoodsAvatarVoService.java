package com.gewara.api.service.goods;

import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.goods.GoodsVo;

public interface GoodsAvatarVoService {
	/**
	 * ������޸���Ʒ
	 * @param userid
	 * @param gid
	 * @param dataMap
	 * @return
	 */
	ResultCode<GoodsVo> saveOrUpdateActivityGoods(Long userid, Long gid, Map<String, String> dataMap);
}
