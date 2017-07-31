package com.gewara.web.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * �����ռ�Request�Ĳ������ƣ����ں��ڴ���:�淶����������
 */
public class ParamCollectUtils {
	private static boolean collectEnabled = false;	//���Ų��������ռ�
	private static long enableTime = 0;				//���ŵ�ʲôʱ���
	private static Map<String/*uri*/, Map<String, AtomicInteger/*count*/>/*param names*/> namesMap = new ConcurrentHashMap<>();
	public static void enableCollect(int seconds){
		if(seconds<=0){
			collectEnabled=false;
		}else{
			collectEnabled=true;
			enableTime= System.currentTimeMillis() + seconds*1000;
		}
	}
	public static void addNameIfEnabled(long cur, String uri, Map<String, String> params){
		if(collectEnabled && enableTime > cur){
			Map<String, AtomicInteger> names = namesMap.get(uri);
			if(names==null){
				names = new ConcurrentHashMap<>();
				namesMap.put(uri, names);
			}
			List<String> pnList = new ArrayList<String>(params.keySet());
			for(String key: pnList){
				AtomicInteger count = names.get(key);
				if(count==null){
					count = new AtomicInteger(1);
					names.put(key, count);
				}else{
					count.incrementAndGet();
				}
			}
		}
	}
	/**
	 * ��ȡͳ����Ϣ
	 * @return
	 */
	public static List<String> getStats(){
		List<String> uriList = new ArrayList<String>(namesMap.keySet());
		List<String> result = new ArrayList<String>();
		for(String uri: uriList){
			Map<String, AtomicInteger> pnMap = namesMap.get(uri);
			for(Map.Entry<String, AtomicInteger> entry: pnMap.entrySet()){
				result.add(uri + "," + entry.getKey() + "," + entry.getValue());
			}
		}
		return result;
	}
}
