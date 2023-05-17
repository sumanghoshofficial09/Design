package com.strategydesignpattern.pojos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
	
	private String id;
	
	/**
	 * date on which order is placed
	 */
	private LocalDate date;
	
	
	/**items which are part of this order
	 * 
	 */
	
	private Map<String,Double> items = new HashMap<>();
	
	/**
	 * total cost of this entire object
	 */
	
	private double total;
	
	/**
	 * Constructor 
	 * @param id
	 */
	public Order(String id)
	{
		this.id=id;
		
		date = LocalDate.now();
	}

	public String getId() {
		return id;
	}



	public LocalDate getDate() {
		return date;
	}

	public Map<String, Double> getItems() {
		return items;
	}


	public double getTotal() {
		return total;
	}

	public void addItem(String item, double price) {
		items.put(item, price);
		total+=price;
		
	}
	
	
	

}
