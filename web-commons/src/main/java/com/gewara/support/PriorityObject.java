package com.gewara.support;

import java.io.Serializable;

public interface PriorityObject extends Serializable{
	/**
	 * ��ȡ���������Ȩ��ֵ( 0 <= priority <= 99)
	 * @return
	 */
	public int getPriority();
}
