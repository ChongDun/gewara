package com.gewara.hbase;

import java.util.List;
import java.util.Map;

import com.gewara.hbase.util.FilterBuilder;
import com.gewara.hbase.util.GroupFields;

/**
 * @author gebiao �������ǵ���HBase�Ľӿڣ���Щ�����ԣ� 1���������޸ļ�¼ 2�����ݸ�ʽҪ�淶��key����Ϊ������key
 */
public interface HBaseService {

	///////////////////// �ӿڳ���/////////////////////
	String COUNT_FLAG_HOUR = "hour";
	String COUNT_FLAG_MIN = "min";
	String COUNT_FLAG_DAY = "day";
	String COLUMN_ADDTIME = "addtime"; // �ͻ��������ֶΣ����ڴ洢��¼�Ĳ���ʱ��,��Χ��ѯʱ��ʱ��Ƚ�
	int CACHE_SIZE = 500; // SCAN ��������

	///////////////////// ��ӵ�����¼ API/////////////////////
	/**
	 * �����¼���Զ�����rowid,rowid �Ĺ����ǻ���ʱ�� timestamp[32bit]
	 * 
	 * @param tablename
	 * @param rowdata
	 */
	void saveRow(String tablename, Map<String, String> rowdata);

	/**
	 * �����¼��ʹ���Զ���� rowid��ʽ,����������
	 * 
	 * @param tablename
	 * @param rowid
	 * @param rowdata
	 */
	void saveRow(String tablename, byte[] rowid, Map<String, String> rowdata);

	/**
	 * �����¼��ʹ���Զ���� rowid��ʽ,hexidΪbyte[]��hex����,16���Ʊ���
	 * 
	 * @param tablename
	 * @param hexid
	 * @param row
	 */
	void saveRow(String tablename, String hexid, Map<String, String> row);

	///////////////////// ��Ӷ�����¼ API/////////////////////
	void saveRowListByStrId(String tablename, String idName, List<Map<String, String>> rowList);

	void saveRowListByHex(String tablename, String hexidName, List<Map<String, String>> rowList);

	void saveRowList(String tablename, List<Row> rowList);

	///////////////////// ɾ�� API/////////////////////
	void removeRowById(String tablename, byte[] rowid);

	void removeRowByHex(String tablename, String hexid);

	void removeRowList(String tablename, List<byte[]> rowidList);

	void removeRowListByHex(String tablename, String[] hexidList);

	void removeRowListByHex(String tablename, List<String> hexidList);

	int removeByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime, String column);

	///////////////////// ��ѯ API/////////////////////
	boolean isAvaliable();

	Row getRowByHex(String tablename, String hexid);

	Row getRowByStrId(String tablename, String strId);

	Row getRowById(String tablename, byte[] rowid);

	/**
	 * ��ȡ����޸ĵļ�¼
	 * 
	 * @param tablename
	 * @param rowid
	 * @param maxVersion
	 * @return
	 */
	Map<Long/* modifytime */, Map<String, String>> getMultiVersionRow(String tablename, byte[] rowid, int maxVersion);

	List<Map<Long/* modifytime */, Map<String, String>>> getMultiRowListByIdRange(String tableName, int maxVersions,
			FilterBuilder fb, byte[] startRowId, byte[] endRowId, int maxnum);

	List<Row> getRowList(String tablename, FilterBuilder fb, int maxnum);
	<K, V> List<Map<K, V>> getRowList(String tablename, List fb);

	List<Row> getRowListByHexids(String tablename, List<String> hexidList);

	List<Row> getRowListByIdList(String tablename, List<byte[]> rowidList);

	List<Row> getRowListByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime, RowFilter filter,
			int maxnum);

	List<Row> getRowListByRange(String tableName, Map fb, Long starttime, Long endtime, RowFilter filter, int maxnum);

	<K, V> List<Map<K, V>> getRowListByRange(String tableAppsource, Map<K, V> query, long time, long time2, int i);
	<K, V> List<Map<K, V>> getRowListByRange(String tableAppsource, Map<K, V> query,Map<K, V>map ,long time, long time2, int i);

	List<Row> getRowListByIdRange(String tableName, FilterBuilder fb, byte[] startRowId, byte[] endRowId,
			RowFilter filter, int maxnum);

	List<Row> getRowListByIdRange(String tableName, Map fb, byte[] startRowId, byte[] endRowId, RowFilter filter,
			int maxnum);

	AggregateData getGroupData(String tableName, GroupFields gf, FilterBuilder fb, Long starttime, Long endtime,
			int maxRowScan, RowFilter filter);

	/**
	 * @param tableName
	 * @param fb
	 * @param starttime
	 * @param endtime
	 * @param maxnum
	 * @return
	 */
	List<byte[]> getRowidListByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime, int maxnum);

	/**
	 * @param tableName
	 * @param query
	 * @param likeQuery
	 * @param starttime
	 * @param endtime
	 * @param maxnum
	 * @param column
	 *            ֻ����ָ����ֵ���Լ������ݴ���
	 * @return
	 */
	List<byte[]> getRowidListByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime, int maxnum,
			String column);

	///////////////////// ��Χ���� API/////////////////////
	/**
	 * ��ʱ��η�Χ����
	 * 
	 * @param tableName
	 * @param query
	 * @param likeQuery
	 * @param starttime
	 * @param endtime
	 * @param callback
	 */
	void processRowListByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime,
			RowDataCallback callback, RowFilter filter);

	/**
	 * ��rowid��Χ����
	 * 
	 * @param tableName
	 * @param query
	 * @param likeQuery
	 * @param startRowId
	 * @param endRowId
	 * @param callback
	 */
	void processRowListByRowIdRange(String tableName, FilterBuilder fb, byte[] startRowId, byte[] endRowId,
			RowDataCallback callback, RowFilter filter);

	///////////////////// �ۼ���ѯ API/////////////////////
	/**
	 * @param tableName
	 * @param fb
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	long getRowCountByRange(String tableName, FilterBuilder fb, Long starttime, Long endtime);

	/**
	 * �½�һ�ű�����Ѿ����ھͲ�������columnFamily��Ĭ�ϵ�DF��Ĭ��ѹ�� create 'table',{NAME => 'DF',
	 * VERSIONS => 1, COMPRESSION => 'SNAPPY'}
	 * 
	 * @param tableName
	 * @param maxVersions
	 *            > 0 ʱ����
	 * @return
	 */
	boolean createTable(String tableName, int maxVersions);

}
