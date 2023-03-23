package com.dependencyInjection.catalog;

import java.util.List;
import com.dependencyInjection.repository.ProductRepository;



/*
 * 
 * We have now fix the violation 
 * 
 * We are now following the Dependency Inversion Principle 
 * 
 * also we are following the Dependency Injection
 * 
 * 
 * what we do we put a new constructor which is taking ProductRepository as a parameter 
 * 
 * 
 * 
 */
public class ProductCatalog {
	ProductRepository productRepository ;
	
	public ProductCatalog(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public void ListAllProducts()
	{
		
	
		
		
		
		List<String> productNameList = productRepository.getAllProductNames();
		
		for(String name : productNameList)
		{
			System.out.println("listing product name "+name);
		}
	}

}
