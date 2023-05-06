package com.compositedesignpattern.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
	
	
	
	List<File> children = new ArrayList<>();
	
	

	public Directory(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ls() {
		System.out.println(this.getName());
		
		children.forEach(File::ls );
		
	}

	@Override
	public void addFile(File file) {
		children.add(file);
		
	}

	@Override
	public File[] getFiles() {
		// TODO Auto-generated method stub
		return children.toArray(new File[children.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		// TODO Auto-generated method stub
		 return children.remove(file);
	}

	@Override
	public void setParent(File parent) {
		this.parent=parent;
		
	}

	@Override
	public File getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

}
