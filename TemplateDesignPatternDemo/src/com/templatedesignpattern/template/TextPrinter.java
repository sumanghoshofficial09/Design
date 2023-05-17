package com.templatedesignpattern.template;

import com.templatedesignpattern.pojo.Order;

public class TextPrinter extends OrderPrinter {

	@Override
	protected String start() {
		return "Order Details";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		// TODO Auto-generated method stub
		return "Order No ## "+ order.getId();
	}

	@Override
	protected String formatItems(Order order) {
		// TODO Auto-generated method stub
		return "Order Items  : <"+order.getItems() +"\t >";
	}

	@Override
	protected String end() {
		// TODO Auto-generated method stub
		return "Order Ends...";
	}

	@Override
	protected String formatTotal(Order order) {
		// TODO Auto-generated method stub
		return "Order  Total ## "+order.getTotal();
	}

}
