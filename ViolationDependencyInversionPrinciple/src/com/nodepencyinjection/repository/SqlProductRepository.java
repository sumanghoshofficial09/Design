package com.nodepencyinjection.repository;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository {
	
		public List<String> getAllProductNames()
		{
			return Arrays.asList("bread","butter");
			
		}

}
