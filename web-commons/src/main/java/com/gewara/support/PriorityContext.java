package com.gewara.support;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * �򵥻�ȡ����������ʵ��<br>
 * <p><b>����ʵ��˼·:</b>
 * <br>context�г�ʼ��sizeΪmaxPriority+1��list��maxPriorityĬ��Ϊ99
 * <br>list�е�Ԫ��ΪLinkedBlockingQueue,queueLenĬ��Ϊ1000,<b>context������=listSize * queueLen</b>
 * <br>��context�����Ԫ��ʱ������ {@link PriorityObject#getPriority(int maxPriority)}��ֵ���뵽��Ӧ��queue��
 * <br>��ȡԪ�أ�����list�е�Queue����ȡ���һ���ڵ㣬�ǿ���������
 * <br>contextΪ���򷵻�null
 * <p><b>ʹ�ó���������</b>
 * <br>��������������priority���Ϊ0~98
 * <br>��������������priority����Ϊ99
 * <br>�����ʵ��99:1�Ļ�ȡ��ϵ
 * @author quzhuping
 * @param <T> extends {@link PriorityObject}
 */
public class PriorityContext<T extends PriorityObject> {

	private final List<LinkedBlockingQueue<T>> bucketList;
	private final AtomicInteger curIndexer = new AtomicInteger(0);
	private final int maxPriority;
	private final int bucketSize;
	private final int latch; 

	/**
	 * ��ʼ��maxPriority=99��context
	 */
	public PriorityContext(){
		this(99, 1000);
	}
	
	/**
	 * ���maxPriorityΪ0����ṹ��ͬ�ڵ�һQueue
	 * @param maxPriority (0 <= value <= 99)
	 * @param bucketQueueLen (1<= value < 10000)
	 */
	public PriorityContext(int maxPriority, int bucketQueueLen){
		if(maxPriority < 1){
			throw new IllegalArgumentException("maxPriority shout not be < 1");
		}
		if(maxPriority > 99){
			maxPriority = 99;
		}
		if(bucketQueueLen > 10000){
			bucketQueueLen = 10000;
		}
		if(bucketQueueLen < 1){
			bucketQueueLen = 1;
		}
		this.maxPriority = maxPriority;
		this.bucketSize = maxPriority + 1;
		this.latch = this.bucketSize * 100000 -1;
		
		bucketList = new ArrayList(this.bucketSize);
		for(int i = 0; i< this.bucketSize; i++){
			bucketList.add(i, new LinkedBlockingQueue(bucketQueueLen));
		}
	}
	/**
	 * ��ȡ���Ƴ�context�е�obj�����contextΪ�գ��򷵻� null��
	 * @return
	 */
	public T poll(){
		for(int i=0; i< bucketSize; i++){
			int curIndex = curIndexer.getAndIncrement();
			if(curIndex == latch){
				curIndexer.set(0);
			}
			
			T rv = bucketList.get(curIndex % bucketSize).poll();
			if(rv != null){
				return rv;
			}
		}
		return null;
	}
	
	/**
	 * ��context���Ƴ�ָ��obj
	 * @param obj ���Ƴ���obj
	 * @return
	 */
	public boolean remove(T obj){
		int priority = obj.getPriority();
		if(priority > this.maxPriority){
			priority = this.maxPriority;
		}
		if(priority < 0){
			priority = 0;
		}
		LinkedBlockingQueue<T> contextQueue = bucketList.get(priority);
		return contextQueue.remove(obj);
	}
	
	/**
	 * ���obj��context��
	 * <br>���obj��priority>maxPriority�򽫶���������һ��queue��
	 * <br>���obj��priority<0�򽫶�������һ��queue��(list.index = 0)
	 * @param obj
	 * @return true�ɹ���false������
	 */
	public boolean offer(T obj){
		int priority = obj.getPriority();
		if(priority > this.maxPriority){
			priority = this.maxPriority;
		}
		if(priority < 0){
			priority = 0;
		}
		LinkedBlockingQueue<T> contextQueue = bucketList.get(priority);
		return contextQueue.offer(obj);
	}
	
	/**
	 * contex�е�elements
	 * @return
	 */
	public int size(){
		int size = 0;
		for(LinkedBlockingQueue queue: bucketList){
			size += queue.size();
		}
		return size;
	}
	
	public static class BasePriorityObj implements PriorityObject{
		private static final long serialVersionUID = 1L;
		
		private int priority;
		public BasePriorityObj(int priority){
			this.priority = priority;
		}
		
		@Override
		public int getPriority() {
			return this.priority;
		}
		
	}
}
