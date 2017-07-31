/**
 * 
 */
package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.cons.AccountRefundConstant;
import com.gewara.cons.PartnerConstant;
import com.gewara.util.JsonUtils;
/**
 * �˻�ԭ·�˿�
 * @author gebiao(ge.biao@gewara.com)
 * @since Aug 24, 2012 1:35:57 PM
 */
public class AccountRefundVo extends BaseVo {
	private static final long serialVersionUID = 6029378080103301843L;
	
	// ũ���˿��ʶ
	public static final String ABC_OTHERINFO_AMOUNT ="amount";			     // ���
	public static final String ABC_OTHERINFO_POINT ="point";			     // ����

	private Long id;
	private Integer version;	//�汾
	private String tradeno;		//������
	private String reason;		//ԭ��
	private String status;		//״̬
	private String origin;		//��Դ��refund:�����˿�, apply:�ͷ��������� charge ��ֵ�˿�
	private Integer amount;		//�˿���
	private Long memberid;
	private Long partnerid;		//�̼��˿�
	private String mobile;
	private Timestamp addtime;	//��������
	private Timestamp dealtime; //����ʱ��
	private String remark;		//�ر�˵��
	private String paymethod;	//֧����ʽ
	private Long applyuser;		//������
	private Long dealuser;		//������
	private String otherinfo;	//������Ϣ
	private String payseqno;	//�ⲿ������
	private String refundOrigin;//�˿���Դ��customer���ͻ��ύ�� service���ͷ��ύ�� system��ϵͳ�ύ
	private String merchantCode;//�̻��ű�ʶ
	private String batchNo;     //���κ�
	private String tradenoBack; //������
	
	public AccountRefundVo(){}
	
	@Override
	public Serializable realId() {
		return id;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTradeno() {
		return tradeno;
	}
	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatusText(String sstatus){
		return AccountRefundConstant.getStatusText(sstatus);
	}
	public Timestamp getDealtime() {
		return dealtime;
	}
	public void setDealtime(Timestamp dealtime) {
		this.dealtime = dealtime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public Long getApplyuser() {
		return applyuser;
	}
	public void setApplyuser(Long applyuser) {
		this.applyuser = applyuser;
	}
	public Long getDealuser() {
		return dealuser;
	}
	public void setDealuser(Long dealuser) {
		this.dealuser = dealuser;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Long getPartnerid() {
		return partnerid;
	}
	public void setPartnerid(Long partnerid) {
		this.partnerid = partnerid;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	
	public String takeAbcOtherInfo() {
		String returnValue = "";
		if (StringUtils.isNotBlank(this.otherinfo)) {
			Map<String, String> otherInfoMap = JsonUtils.readJsonToMap(this.otherinfo);
			if (otherInfoMap.containsKey(ABC_OTHERINFO_AMOUNT)) {
				returnValue = returnValue + "��" + otherInfoMap.get(ABC_OTHERINFO_AMOUNT);
			}
			if (otherInfoMap.containsKey(ABC_OTHERINFO_POINT)) {
				returnValue = returnValue + "�����֣�" + otherInfoMap.get(ABC_OTHERINFO_POINT);
			}
		}
		return returnValue;
	}

	public boolean isOutPartner() {
		return PartnerConstant.isOutPartner(memberid);
	}

	public String getPayseqno() {
		return payseqno;
	}

	public void setPayseqno(String payseqno) {
		this.payseqno = payseqno;
	}

	public String getRefundOrigin() {
		return refundOrigin;
	}

	public void setRefundOrigin(String refundOrigin) {
		this.refundOrigin = refundOrigin;
	}
	
	public String getRefundOriginText() {
		return (StringUtils.isNotBlank(refundOrigin))?AccountRefundConstant.refundOriginTextMap.get(refundOrigin):"";
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getTradenoBack() {
		return tradenoBack;
	}

	public void setTradenoBack(String tradenoBack) {
		this.tradenoBack = tradenoBack;
	}
	
}
