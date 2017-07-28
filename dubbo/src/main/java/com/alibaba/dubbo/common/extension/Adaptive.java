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
package com.alibaba.dubbo.common.extension;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.alibaba.dubbo.common.URL;

/**
 * ��{@link ExtensionLoader}����Extension��Adaptive Instanceʱ��Ϊ{@link ExtensionLoader}�ṩ��Ϣ��
 * 
 * @author ding.lid
 * @export
 * 
 * @see ExtensionLoader
 * @see URL
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Adaptive {
    
    /**
     * ��{@link URL}��Key������Ӧ��Value��ΪҪAdapt�ɵ�Extension����
     * <p>
     * ���{@link URL}��ЩKey��û��Value��ʹ�� �� ȱʡ����չ���ڽӿڵ�{@link SPI}���趨��ֵ����<br>
     * ���磬<code>String[] {"key1", "key2"}</code>����ʾ
     * <ol>
     * <li>����URL����key1��Value��ΪҪAdapt�ɵ�Extension����
     * <li>key1û��Value����ʹ��key2��Value��ΪҪAdapt�ɵ�Extension����
     * <li>key2û��Value��ʹ��ȱʡ����չ��
     * <li>���û���趨ȱʡ��չ���򷽷����û��׳�{@link IllegalStateException}��
     * </ol>
     * <p>
     * �����������ȱʡʹ��Extension�ӿ������ĵ�ָ�Сд�ִ���<br>
     * ������Extension�ӿ�{@code com.alibaba.dubbo.xxx.YyyInvokerWrapper}��ȱʡֵΪ<code>String[] {"yyy.invoker.wrapper"}</code>
     * 
     * @see SPI#value()
     */
    String[] value() default {};
    
}
