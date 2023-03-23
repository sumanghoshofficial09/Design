package com.depedencyInversionPrinciple.factory;

import com.depedencyInversionPrinciple.repository.ProductRepository;
import com.depedencyInversionPrinciple.repository.SqlProductRepository;

public class ProductFactory {
	
	public static ProductRepository create()
	{
		return new SqlProductRepository();
	}

}
