package com.isp.pojo;

/*
 * there are many unimplemented method 
 * signaling violation of interface segregation principle
 */
public class CannonPrinter implements IPrint {

	@Override
	public void print() {
		System.out.println("Cannon Printing");

	}

	@Override
	public void getPrintSpoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("Cannon Printing :  getPrintSpoolDetails");
	}


}
