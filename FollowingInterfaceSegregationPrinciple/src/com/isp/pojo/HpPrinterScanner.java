package com.isp.pojo;

public class HpPrinterScanner implements IPrint,IScan {

	@Override
	public void print() {

			System.out.println("HP printing");

	}

	@Override
	public void getPrintSpoolDetails() {
		System.out.println("HP getPrintSpoolDetails");

	}

	@Override
	public void scan() {
		System.out.println("HP scan");

	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("HP scanPhoto");

	}

	

}
