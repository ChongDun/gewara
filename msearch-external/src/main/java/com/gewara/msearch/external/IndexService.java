package com.gewara.msearch.external;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.msearch.external.constant.DataType;
import com.gewara.msearch.external.entity.index.IndexData;

public interface IndexService {
	/**�������
	 * @param type
	 * @param data ��������
	 */
	public <T extends IndexData> ResultCode<String> addIndex(DataType type,T... datas);
	
	/**
	 * ���ԭ����վ�ϵ���������
	 * @param type
	 * @param datas
	 * @return
	 */
	public <T extends IndexData> ResultCode<String> addGwSearchIndex(DataType type, List<T> datas);
	
	/**
	 * �޸���������
	 * @param type Ŀǰֻ֧��member����޸�
	 * @param modifyPropsName ���޸ĵ���������
	 * @param datas �޸ĺ�Ķ��󣬶���id����Ϊ��
	 * @return
	 */
	public <T extends IndexData> ResultCode<String> updateIndex(DataType type,List<String> modifyPropsName, T...datas);
	
	/**
	 * ɾ��mobile�µ�index
	 * @param type
	 * @param data
	 * @return
	 */
	public <T extends IndexData> boolean  deleteIndex(DataType type, T data);
	
	/**
	 * ɾ��pc�ϵ�index
	 * @param id ��ʹ��category+id��ϣ��磺activity20134894
	 * @return
	 */
	public boolean deletePcIndex(String id);
	
	/**
	 * ɾ��ES�е�index
	 * @param indexName
	 * @param indexType
	 * @param documentID
	 * @return
	 */
	public boolean deleteIndex(String indexName,String indexType,String documentID);
	
}
