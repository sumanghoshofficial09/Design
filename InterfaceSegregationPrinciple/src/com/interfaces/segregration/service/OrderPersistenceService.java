package com.interfaces.segregration.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.interfaces.segregration.pojo.Entity;
import com.interfaces.segregration.pojo.Order;
import com.interfaces.segregration.pojo.User;

public class OrderPersistenceService implements PersistenceService {
	
	private static Map<Long,Entity> ORDERS = new HashMap<Long,Entity>();

	@Override
	public void save(Entity entity) {
		synchronized(ORDERS)
		{
			ORDERS.put(entity.getId(), entity);
		}

	}

	@Override
	public void delete(Entity entity) {
		
		synchronized(ORDERS)
		{
			ORDERS.remove(entity.getId());
		}
		
	}

	@Override
	public Entity findById(Long id) {
		synchronized(ORDERS)
		{
			return ORDERS.get(id);
		}
	}

	@Override
	public List<Entity> findByName(String name) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Order does not have any name attribute");
	}

}
