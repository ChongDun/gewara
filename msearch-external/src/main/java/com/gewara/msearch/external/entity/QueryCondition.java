package com.gewara.msearch.external.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.gewara.msearch.external.constant.DataType;

/**
 * ��ѯ����
 * @author ����
 * @createDate 2015��6��3��
 */
	
public class QueryCondition implements Serializable{
	private static final long serialVersionUID = 592656313621653118L;


	private int from=0;
	

	private String queryStr = null;
	private Set<QueryLimit> queryLimits = null;

	/**
	 * ��ѯ���ı�
	 * @return
	 */
	public String getQueryStr() {
		return queryStr;
	}

	/**
	 * ��ѯ���������ͣ��Լ�ÿ���������ͷ��ص�������
	 * 
	 * @return
	 */
	public Set<QueryLimit> getQueryLimits() {
		return queryLimits;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFrom() {
		return from;
	}

	/**
	 * ���ôӵڼ�����¼��ʼ��ȡ,����
	 * @param from
	 */
	public void setFrom(int from) {
		this.from = from;
	}
	

	public void setQueryStr(String queryStr) {
		assert(queryStr!=null&&queryStr.trim().length()>0);
		this.queryStr = queryStr;
	}

	/**
	 * queryLimitͬʱҲ��������ÿ�β�ѯ���������ࡣδָ���ģ�����ѯ��
	 * ��ע��QueryLimit ��equals��hashCode�������ԣ�ÿ���������ͣ�ֻ����һ��QueryLimit����
	 * @param queryLimit
	 */
	public void setQueryLimit(Set<QueryLimit> queryLimit) {
		assert(queryLimit!=null&&!queryLimit.isEmpty());
		this.queryLimits = queryLimit;
	}
	
	/**
	 *
	 */
	public void addQueryLimit(QueryLimit queryLimit) {
		assert(queryLimit!=null);
		if(this.queryLimits==null){
			this.queryLimits=new HashSet<>();
		}
		this.queryLimits.add(queryLimit);
	}
	
	public void addQueryLimit(DataType type,int limit) {
		addQueryLimit(new QueryLimit(type,limit));
	}
	
	/**
	 * ����У���ѯ�����Ƿ�Ϸ���
	 * @return
	 */
	public boolean validate(){
		return !(this.queryLimits==null||this.queryLimits.isEmpty()
				|| this.queryStr==null||this.queryStr.trim().length()==0);
		
	}
	
	@Override
	public String toString(){
		String rv = "queryStr[" + this.queryStr + "], queryLimts[";
		for(QueryLimit ql : this.queryLimits){
			rv += ql.getDataType() + ":" + ql.getLimit() + ","; 
		}
		return rv + "]";
	}
}
