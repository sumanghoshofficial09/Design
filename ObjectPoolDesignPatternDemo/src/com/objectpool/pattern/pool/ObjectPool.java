package com.objectpool.pattern.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
	
	
	/*
	 * 
	 * in memory cache
	 */
	private BlockingQueue<T> availablePool;
	
	
	
	public ObjectPool(Supplier<T> creator,int count) {
		
		availablePool  =new LinkedBlockingDeque<>();
		
		for(int i=0;i<count;i++)
		{
			availablePool.offer(creator.get());
		}
		
	}
	
	public T get()
	{
		
			try {
				return availablePool.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.print("take has been interrupted ");
			}
			return null;
			
		
	}
	
	public void release(T obj)
	{
		obj.reset();
		
		try {
			availablePool.put(obj);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.print("put  has been interrupted ");
		}
	}

}
