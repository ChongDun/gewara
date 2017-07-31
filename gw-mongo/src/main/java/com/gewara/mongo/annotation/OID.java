package com.gewara.mongo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * ��ʶ��Ĵ����ߣ�mongo class ������
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface OID {
	String name() default "";
	String[] value() default {};
}
