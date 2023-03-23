package com.dependencyInjection.main;

import com.dependencyInjection.catalog.ProductCatalog;
import com.dependencyInjection.factory.ProductFactory;
import com.dependencyInjection.repository.ProductRepository;

/**
 * 
 * 
 * @author ciphe
 * 
 * this client class EcommerceMain is Spplyin the dependency to the ProductCatalog class 
 * it is doing the dependency injection
 * 
 *
 */
public class EcommerceMain {
	
	public static void main(String args[])
	{
		
		ProductRepository productRepository = ProductFactory.create();
		
		ProductCatalog catalog = new ProductCatalog(productRepository);
		
		catalog.ListAllProducts();
		
	}

}
