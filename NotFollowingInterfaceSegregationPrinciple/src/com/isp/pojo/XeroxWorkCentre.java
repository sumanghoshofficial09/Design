package com.isp.pojo;

public class XeroxWorkCentre implements IMultiFunction {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("print");
	}

	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("getPrintSpoolDetails");
		
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
		System.out.println("scan");
		
		
	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("scanPhoto");
		
		
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		
		System.out.println("fax");
		
	}

	@Override
	public void internetFax() {
		// TODO Auto-generated method stub
		
		System.out.println("fax");
		
	}

}
