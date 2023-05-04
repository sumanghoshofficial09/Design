package com.objectpool.pattern.client;

import java.awt.Point;
import java.awt.geom.Point2D;

import com.objectpool.pattern.pojo.BitMap;
import com.objectpool.pattern.pool.ObjectPool;

public class MainClient {
	
	public static final ObjectPool<BitMap> bitmapPool = new ObjectPool<>(() -> new BitMap("logo.bmp"), 5);
	public static void main(String args[])
	{
		BitMap  b1 = bitmapPool.get();
		
		b1.setLocation(new  Point(3, 5));
		
		
		BitMap  b2 = bitmapPool.get();
		
		b2.setLocation(new  Point(5, 2));
		
		b1.draw();
		
		b2.draw();
		
		bitmapPool.release(b1);
		
		bitmapPool.release(b2);
		
		
	}

}
