package com.gewara.support;

/**
 * �������Լ���λ����
 */
public class TraceErrorException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TraceErrorException(String msg){
		super(msg);
	}
	public TraceErrorException(String msg, Throwable e){
		super(msg, e);
	}
}
