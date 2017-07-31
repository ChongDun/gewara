package com.gewara.mdb.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.gewara.util.BeanUtil;
import com.mongodb.client.model.InsertManyOptions;

public class InsertBuilder<T> {
	private Class<T> sourceType = null;
	private List<Document> sources = new ArrayList<Document>();
	private Bson id = null;

	private InsertManyOptions insertManyOptions = new InsertManyOptions();
	private boolean autoCreateID = true;

	private String collectionName = null;

	public InsertBuilder(String collectionName) {
		this.collectionName = collectionName;
	}

	public InsertBuilder(Class<T> mapping) {
		this.collectionName = mapping.getCanonicalName();
		this.sourceType = mapping;
	}

	/**
	 * ѡ�����ģʽ.�������ݲ���ʱ��Ӱ�� Ĭ�ϵ�����ǣ�˳����룬�����һ��ʧ�ܣ���ֹͣ�� ����������ָ��ÿ��doc�Ĳ����Ƕ����ģ�����Ӱ�졣
	 * 
	 * @param alone
	 * @return
	 */
	public InsertBuilder<T> setInsertModel(boolean alone) {
		if (alone) {
			insertManyOptions = new InsertManyOptions().ordered(false);
		}
		return this;
	}

	private void addDataSource(T data) {
		assert (data != null);
		Map map = null;
		if (data instanceof Map) {
			map = (Map) data;
		} else {
			map = BeanUtil.getBeanMap(data);
		}

		if (map != null && !map.isEmpty()) {
			Document doc = new Document();
			doc.putAll(map);
			sources.add(doc);
		}
	}

	/**
	 * ��Ӽ�¼��һ��bean��Ӧһ����¼ <br/>
	 * ������������������ƣ���ô���Զ���bean�л�ȡ��Ӧ���ֶε�ֵ��Ϊ������ֵ�� <br/>
	 * ���δָ������ʹ��ϵͳĬ�ϵ��������ɻ��ơ�
	 * 
	 * @param data
	 *           ��Ҫ��ӵ����ݡ����������
	 * @return
	 */
	public InsertBuilder<T> addData4Bean(T... datas) {
		for (T data : datas) {
			addDataSource(data);
		}
		return this;
	}

	/**
	 * 
	 *
	 * @param datas
	 * @return
	 */
	public InsertBuilder<T> setData4Bean(Collection<T> datas) {
		this.sources = new ArrayList<Document>();
		for (T data : datas) {
			addDataSource(data);
		}
		return this;
	}

	public Class<T> getSourceType() {
		return sourceType;
	}

	/*public Bson getQueryCondition(){
		if(condition!=null) return condition;
		return new BsonDocument();
	}*/

	public List<Document> getSources() {
		return sources;
	}
	public Document getTop(){
		return sources.get(0);
	}
	public Bson getId() {
		return id;
	}

	public InsertManyOptions getInsertManyOptions() {
		return insertManyOptions;
	}

	public boolean isAutoCreateID() {
		return autoCreateID;
	}

	public String getCollectionName() {
		return collectionName;
	}
}
