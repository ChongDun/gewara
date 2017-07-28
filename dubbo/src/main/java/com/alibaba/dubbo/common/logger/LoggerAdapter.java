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

import java.io.File;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * ��־�����������
 *
 * @author william.liangf
 */
@SPI
public interface LoggerAdapter {
	
	/**
	 * ��ȡ��־�����
	 *
	 * @param key �����
	 * @return ��־�����, ��������: ������null.
	 */
	Logger getLogger(Class<?> key);

	/**
	 * ��ȡ��־�����
	 *
	 * @param key �����
	 * @return ��־�����, ��������: ������null.
	 */
	Logger getLogger(String key);
	
	/**
	 * ��������ȼ�
	 * 
	 * @param level ����ȼ�
	 */
	void setLevel(Level level);
	
	/**
	 * ��ȡ��ǰ��־�ȼ�
	 * 
	 * @return ��ǰ��־�ȼ�
	 */
	Level getLevel();
	
	/**
	 * ��ȡ��ǰ��־�ļ�
	 * 
	 * @return ��ǰ��־�ļ�
	 */
	File getFile();
	
	/**
	 * ���������־�ļ�
	 * 
	 * @param file �����־�ļ�
	 */
	void setFile(File file);

}
