package com.dependencyInjection.factory;

import com.dependencyInjection.repository.ProductRepository;
import com.dependencyInjection.repository.SqlProductRepository;

public class ProductFactory {
	
	public static ProductRepository create()
	{
		return new SqlProductRepository();
	}

}
