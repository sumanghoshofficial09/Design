package com.templatedesignpattern.template;

import java.util.Map.Entry;

import com.templatedesignpattern.pojo.Order;

public class HtmlPrinter extends OrderPrinter {

	@Override
	protected String start() {
		return "<html><head><title>Order Details</title></head><body>";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		return "<h1>Order #"+order.getId()+"</h1>";
	}

	@Override
	protected String formatItems(Order order) {
		
		StringBuilder builder = new StringBuilder("<p><ul>");
		for(Entry<String, Double> e : order.getItems().entrySet()) {
			builder.append("<li>"+e.getKey()+" $"+e.getValue()+"</li>");
		}
		builder.append("</ul></p>");
		return builder.toString();
	}

	@Override
	protected String formatTotal(Order order) {
		return "<br/><hr/><h3>Total : $"+order.getTotal()+"</h3>";
	}

	@Override
	protected String end() {
		return "</body></html>";
	}
	
}
