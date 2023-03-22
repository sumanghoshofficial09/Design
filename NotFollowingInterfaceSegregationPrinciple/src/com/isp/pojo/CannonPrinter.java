package com.isp.pojo;

/*
 * there are many unimplemented method 
 * signaling violation of interface segregation principle
 */
public class CannonPrinter implements IMultiFunction {

	@Override
	public void print() {
		System.out.println("Cannon Printing");

	}

	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("Cannon Printing :  getPrintSpoolDetails");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub

	}

	@Override
	public void internetFax() {
		// TODO Auto-generated method stub

	}

}
