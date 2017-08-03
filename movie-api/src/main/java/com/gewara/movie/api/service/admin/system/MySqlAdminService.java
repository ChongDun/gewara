package com.gewara.movie.api.service.admin.system;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

/**
 * mysql����Ա���ݿ�����ӿ�
 */
public interface MySqlAdminService {

	/**
	 * ����SQL��ѯָ�������һ����¼��������ΪMap
	 * @param sql
	 * @return
	 */
	ResultCode<Map<String, Object>> queryOneRowForMap(String sql);
	
	/**
	 * ����SQL��ѯ������Map�ļ���List������������¼��
	 * @param sql
	 * @return
	 */
	ResultCode<List<Map<String, Object>>> queryMapListBySQL(String sql);
	
	/**
	 * ����������ȡ����Ϣ
	 * @param clazzName
	 * @return
	 */
	ResultCode<Map<String, Object>> getTableInfo(String clazzName);
	
}
