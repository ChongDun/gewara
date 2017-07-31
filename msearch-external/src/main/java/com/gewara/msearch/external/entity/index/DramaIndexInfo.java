package com.gewara.msearch.external.entity.index;


/**
 * �ݳ�����Ϣ
 * 
 * @author ����
 * @createDate 2015��6��3��
 */
public class DramaIndexInfo  extends IndexData {

	private static final long serialVersionUID = 7074469411495043856L;
	
	private String seotitle;  //SEO�ؼ���
	private String dramaname; //��Ŀ����
	private String englishname;//Ӣ������
	private String dramaalias;	//�ݳ�����
	private String type;//��Ŀ����
	private String cityId;
	
	public String getSeotitle() {
		return seotitle;
	}
	public void setSeotitle(String seotitle) {
		this.seotitle = seotitle;
	}
	public String getDramaname() {
		return dramaname;
	}
	public void setDramaname(String dramaname) {
		this.dramaname = dramaname;
	}
	public String getEnglishname() {
		return englishname;
	}
	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}
	public String getDramaalias() {
		return dramaalias;
	}
	public void setDramaalias(String dramaalias) {
		this.dramaalias = dramaalias;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
}
