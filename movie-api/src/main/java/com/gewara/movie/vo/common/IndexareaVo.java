package com.gewara.movie.vo.common;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

/**
 * @author <a href="mailto:acerge@163.com">gebiao(acerge)</a>
 * @since 2007-9-28����02:05:17
 */
public class IndexareaVo extends BaseVo {
	//1=�ޣ�2=���ң�3=ʡ��7=�У�8=���أ�10=��Ȧ
	private static final long serialVersionUID = -886944461240705718L;
	private String indexareacode;
	private CountyVo county;
	private String indexareaname;
	public String getIndexareacode() {
		return indexareacode;
	}

	public void setIndexareacode(String indexareacode) {
		this.indexareacode = indexareacode;
	}

	public String getIndexareaname() {
		return indexareaname;
	}

	public void setIndexareaname(String indexareaname) {
		this.indexareaname = indexareaname;
	}

	public void setCounty(CountyVo county) {
		this.county = county;
	}

	public IndexareaVo() {
	}

	public CountyVo getCounty() {
		return county;
	}
	public String getId() {
		return indexareacode;
	}
	@Override
	public Serializable realId() {
		return indexareacode;
	}

	public String getCode(){
		return indexareacode;
	}

	public String getName(){
		return indexareaname;
	}
}
