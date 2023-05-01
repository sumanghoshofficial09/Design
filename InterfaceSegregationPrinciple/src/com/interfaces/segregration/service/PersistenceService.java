package com.interfaces.segregration.service;

import java.util.List;

import com.interfaces.segregration.pojo.Entity;
import com.interfaces.segregration.pojo.User;

public interface PersistenceService {

	void save(Entity entity);

	void delete(Entity entity);

	Entity findById(Long id);

	List<Entity> findByName(String name);

}
