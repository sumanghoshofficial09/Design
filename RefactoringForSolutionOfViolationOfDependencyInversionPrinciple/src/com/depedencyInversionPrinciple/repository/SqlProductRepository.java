package com.depedencyInversionPrinciple.repository;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository implements ProductRepository {
	
		public List<String> getAllProductNames()
		{
			return Arrays.asList("bread","butter");
			
		}

}
