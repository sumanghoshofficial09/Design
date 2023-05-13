package com.interpreterdesignpattern.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {
	
	private String username;
	private List<String> permissions;
	public User(String username, String... permissions) {
		super();
		this.username = username;
		this.permissions = new ArrayList<>();
		Stream.of(permissions).forEach(permission -> this.permissions.add(permission.toLowerCase()));
	}
	public String getUsername() {
		return username;
	}
	public List<String> getPermissions() {
		return permissions;
	}
	
	
	

}
