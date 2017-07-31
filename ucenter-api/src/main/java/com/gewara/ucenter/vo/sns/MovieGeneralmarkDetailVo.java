package com.gewara.ucenter.vo.sns;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class MovieGeneralmarkDetailVo extends BaseVo{
	private static final long serialVersionUID = -5015270045343038649L;
	private String name; //�ȼ�����   �� 9-10��
	private int value; //�ȼ���������  ���� 9-10��100���û��� ������100����value��ֵ
	private long percent; //ռ��   ���磺9-10�� ���ڵı���  20  �ͱ�ʾ20%
	private int pointY; // ��Ʊ�û�������  ���磺9-10�����湺Ʊ������
	private int pointN; // �ǹ�Ʊ�û��������� ���磺9-10������ǹ�Ʊ����
	private long percenY; //��Ʊ�û�����ռ��
	private long percenN; //�ǹ�Ʊ�û�����ռ��
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public long getPercent() {
		return percent;
	}

	public void setPercent(long percent) {
		this.percent = percent;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int getPointN() {
		return pointN;
	}

	public void setPointN(int pointN) {
		this.pointN = pointN;
	}

	public long getPercenY() {
		return percenY;
	}

	public void setPercenY(long percenY) {
		this.percenY = percenY;
	}

	public long getPercenN() {
		return percenN;
	}

	public void setPercenN(long percenN) {
		this.percenN = percenN;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Serializable realId() {
		return name;
	}

}
