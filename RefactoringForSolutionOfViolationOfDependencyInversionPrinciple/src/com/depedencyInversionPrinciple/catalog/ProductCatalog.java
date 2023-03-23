package com.depedencyInversionPrinciple.catalog;

import java.util.List;

import com.depedencyInversionPrinciple.factory.ProductFactory;
import com.depedencyInversionPrinciple.repository.ProductRepository;



/*
 * 
 * We have now fix the violation 
 * 
 * We are now following the Dependency Inversion Principle 
 * 
 * ProductCatalog no longer directly depends on SqlProductRepository 
 * 
 * Both the high level module and low level module now depends on abstraction 
 * 
 * But if you look here carefully 
 * 
 * our ProductCatalog still has the job to create the object from the factory method 
 * 
 * we want our ProductCatalog is free of all duties , we want the dependency of ProductRepository to get automatically 
 * injected while we are creating the object of ProductCatalog 
 * we need to follow dependency injection principle 
 * 
 * 
 * 
 */
public class ProductCatalog {
	
	
	public void ListAllProducts()
	{
		
		ProductRepository productRepository = ProductFactory.create();
		
		List<String> productNameList = productRepository.getAllProductNames();
		
		for(String name : productNameList)
		{
			System.out.println("listing product name "+name);
		}
	}

}
