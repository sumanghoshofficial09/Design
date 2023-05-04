package com.objectpool.pattern.pojo;

import java.awt.geom.Point2D;

import com.objectpool.pattern.pool.Poolable;


public interface Image extends Poolable {
	
	void draw();
	
	Point2D   getLocation();
	
	void setLocation(Point2D location);

}
