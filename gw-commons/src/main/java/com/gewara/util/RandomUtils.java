package com.gewara.util;

import java.util.List;
import java.util.Random;

public class RandomUtils {
	
	/**
	 * �����������
	 * <p>��װjava.util.Random
	 * @param n ��Χֵ
	 * @return n<=1,����0;�������ط�Χ0~(n-1)�ڵ��������
	 */
	public static int randomInt(int n){
		if(n <= 1){
			return 0;
		}
		return new Random().nextInt(n);
	}
	
	/**
	 * �����������
	 * <p>��װorg.apache.commons.lang.math.RandomUtils
	 * <p>��������ϵĵ����ϣ�ʱ������{@link #randomInt(int)}
	 * @param n ��Χֵ
	 * @return n<=1,����0;�������ط�Χ0~(n-1)�ڵ��������
	 */
	public static int randomIntApache(int n){
		if(n <= 1){
			return 0;
		}
		return org.apache.commons.lang.math.RandomUtils.nextInt(n);
	}

	/**
	 * �������List�е�ֵ������{@link #randomInt(int)}
	 * @param list
	 * @return ���listΪnull��գ��򷵻�null
	 */
	public static <T> T getRandomFromList(List<T> list){
		if(list == null || list.isEmpty()){
			return null;
		}
		return list.get(randomInt(list.size()));
	}
	
	/**
	 * �������List�е�ֵ������{@link #randomIntApache(int)}
	 * @param <T>
	 * @param list
	 * @return ���listΪnull��գ��򷵻�null
	 */
	public static <T> T getRandomFromListApache(List<T> list){
		if(list == null || list.isEmpty()){
			return null;
		}
		return list.get(randomInt(list.size()));
	}
}
