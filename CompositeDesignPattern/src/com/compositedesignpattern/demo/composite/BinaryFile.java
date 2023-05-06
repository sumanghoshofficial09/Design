package com.compositedesignpattern.demo.composite;

public class BinaryFile extends File {
	
	
	
	private long size;

	public BinaryFile(String name, long size) {
		super(name);
		this.size=size;
		
		
	}
	
	





	@Override
	public void ls() {
		System.out.println(getName()+"\t"+size);
		
	}

	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("Leaf node does not support add operation ");
		
	}

	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("Leaf node does not support get Files Related Operation ");
	}

	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("Leaf node does not support remove files related operation ");
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
