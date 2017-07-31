package com.gewara.msearch.external;

import java.util.Collection;

import com.gewara.api.vo.ResultCode;
import com.gewara.msearch.external.entity.GwSearchResult;
import com.gewara.msearch.external.entity.QueryCondition;
import com.gewara.msearch.external.entity.QueryResult;

public interface QueryService {
	/**
	 * ��ѯָ������������
	 * @param <T>
	 * @param condition
	 * @return
	 */
	public <T> ResultCode<Collection<QueryResult<T>>> query(QueryCondition condition);
	
	/**
	 * ԭ��վ��ѯ
	 * @param citycode
	 * @param skey
	 * @param channel
	 * @param tag
	 * @param category
	 * @param from
	 * @param limit
	 * @return
	 */
	public ResultCode<QueryResult<GwSearchResult>> queryGwSearch(String citycode, String skey, String channel, String tag, String category, int from, int limit);
	/**
	 * ȫ�ļ����������������͡�
	 * 
	 * @param condition
	 * @return
	 */
	//public Collection<PageQueryResult<DataType,String>> fullQuery(String queryStr,Integer from,Integer pageSize);
}
