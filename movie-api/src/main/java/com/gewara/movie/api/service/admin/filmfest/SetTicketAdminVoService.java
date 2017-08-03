package com.gewara.movie.api.service.admin.filmfest;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.filmfest.SetTicketVo;
public interface SetTicketAdminVoService {
	/**
	 * ����ID��ѯ
	 * @param id
	 * @return
	 */
	ResultCode<SetTicketVo> getSetTicketVoById(String id);
	/**
	 * ���ݵ�Ӱ��tag��ѯ��Ʊ�б�
	 * @param filmTag
	 * @return
	 */
	ResultCode<List<SetTicketVo>> getSetTicketListByTag(String filmTag);
	/**
	 * ��ѯ�����޸���Ʊ
	 * @param id
	 * @param dataMap
	 * @return
	 */
	ResultCode<SetTicketVo> saveSetTicketVo(String id, Map<String, String> dataMap);
	/**
	 * ɾ����Ʊ
	 * @param id
	 * @return
	 */
	ResultCode removeSetTicketVo(String id);
}
