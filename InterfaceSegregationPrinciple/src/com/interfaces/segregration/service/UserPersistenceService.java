package com.interfaces.segregration.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.interfaces.segregration.pojo.Entity;
import com.interfaces.segregration.pojo.User;

public class UserPersistenceService implements PersistenceService {
	
	private static final Map<Long,Entity> USERS = new HashMap<>();
	
	
	@Override
	public void save(Entity entity)
	{
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
			
		}
	}
	
	@Override
	public void delete(Entity entity)
	{
		synchronized(USERS)
		{
			USERS.remove(entity.getId());
		}
		
	}
	
	@Override
	public Entity findById(Long id )
	{
		synchronized(USERS)
		{
			return USERS.get(id);
		}
	}
	
	
	@Override
	public List<Entity> findByName(String name)
	{
		synchronized(USERS)
		{
			return USERS.values().stream().filter(u-> ((User) u).getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}
	
	

}
