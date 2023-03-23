package com.nodepencyinjection.catalog;

import java.util.List;

import com.nodepencyinjection.repository.SqlProductRepository;


/*
 * 
 * productCatalog which is a High Level module is dependent on Low level module 
 * called SqlProductRepository this is a clear violation
 * of Dependency Inversion Principle 
 * 
 */
public class ProductCatalog {
	
	
	public void ListAllProducts()
	{
		
		SqlProductRepository productRepository = new SqlProductRepository();
		
		List<String> productNameList = productRepository.getAllProductNames();
		
		for(String name : productNameList)
		{
			System.out.println("listing product name "+name);
		}
	}

}
