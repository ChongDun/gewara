/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.common.logger;

/**
 * ��־�ӿ� <p/> ������������commons-logging
 *
 * @author william.liangf
 */
public interface Logger {

    /**
     * ���������Ϣ
     *
     * @param msg ��Ϣ����
     */
    public void trace(String msg);

    /**
     * ���������Ϣ
     *
     * @param e �쳣��Ϣ
     */
    public void trace(Throwable e);
    
    /**
     * ���������Ϣ
     *
     * @param msg ��Ϣ����
     * @param e �쳣��Ϣ
     */
    public void trace(String msg, Throwable e);

	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 */
	public void debug(String msg);

	/**
     * ���������Ϣ
     *
     * @param e �쳣��Ϣ
     */
	public void debug(Throwable e);
	
	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 * @param e �쳣��Ϣ
	 */
	public void debug(String msg, Throwable e);

	/**
	 * �����ͨ��Ϣ
	 *
	 * @param msg ��Ϣ����
	 */
	public void info(String msg);

	/**
     * �����ͨ��Ϣ
     *
     * @param e �쳣��Ϣ
     */
	public void info(Throwable e);
	
	/**
	 * �����ͨ��Ϣ
	 *
	 * @param msg ��Ϣ����
	 * @param e �쳣��Ϣ
	 */
	public void info(String msg, Throwable e);

	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 */
	public void warn(String msg);
	
	/**
     * ���������Ϣ
     *
     * @param e �쳣��Ϣ
     */
	public void warn(Throwable e);

	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 * @param e �쳣��Ϣ
	 */
	public void warn(String msg, Throwable e);

	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 */
	public void error(String msg);
	
	/**
     * ���������Ϣ
     *
     * @param e �쳣��Ϣ
     */
	public void error(Throwable e);

	/**
	 * ���������Ϣ
	 *
	 * @param msg ��Ϣ����
	 * @param e �쳣��Ϣ
	 */
	public void error(String msg, Throwable e);

    /**
     * ������Ϣ�Ƿ���
     *
     * @return �Ƿ���
     */
    public boolean isTraceEnabled();

	/**
	 * ������Ϣ�Ƿ���
	 *
	 * @return �Ƿ���
	 */
	public boolean isDebugEnabled();

	/**
	 * ��ͨ��Ϣ�Ƿ���
	 *
	 * @return �Ƿ���
	 */
	public boolean isInfoEnabled();

	/**
	 * ������Ϣ�Ƿ���
	 *
	 * @return �Ƿ���
	 */
	public boolean isWarnEnabled();
	
	/**
	 * ������Ϣ�Ƿ���
	 *
	 * @return �Ƿ���
	 */
	public boolean isErrorEnabled();

}
