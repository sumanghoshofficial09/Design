package com.compositedesignpattern.demo.composite;

public abstract class File {
	
	File parent;
	
	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void ls();
	
	public abstract void setParent(File file);
	
	public abstract File getParent();
	
	public abstract void addFile(File file);
	
	public abstract File [] getFiles();
	
	public abstract boolean removeFile(File file);

	

}
