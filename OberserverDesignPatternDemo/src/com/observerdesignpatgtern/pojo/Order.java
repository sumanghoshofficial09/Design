package com.observerdesignpatgtern.pojo;

import java.util.ArrayList;
import java.util.List;

import com.observerdesignpatgtern.observer.OrderObserver;




public class Order {
	
	private String id;
	
	private double itemCost;
	
	private int count;
	
	private double discount;
	
	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	List<OrderObserver> orderObservers  = new ArrayList<>();

	private int shippingCost;
	
	public Order(String id)
	{
		this.id=id;
	}
	
	
	public double getTotal()
	{
		return itemCost -getDiscount()+getShippingCost();
		
	}
	
	public void addItem(double price)
	{
		itemCost+=price;
		count++;
		orderObservers.forEach(o -> o.updated(this));
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void attach(OrderObserver orderObserver)
	{
		orderObservers.add(orderObserver);
	}
	
	public void detach(OrderObserver orderObserver)
	{
		orderObservers.remove(orderObserver);
	}


	public void setShippingCost(int cost) {
		this.shippingCost=cost;
		
	}
	
	public int getShippingCost() {
		return this.shippingCost;
		
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", itemCost=" + itemCost + ", count=" + count + ", discount=" + discount
				+ ", orderObservers=" + orderObservers + ", shippingCost=" + shippingCost + "]";
	}
	
	
	
	
}
