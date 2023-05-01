package com.builder.pattern.pojo;

public class Adrress {
	
	private String flatNo;
	private String area;
	private String postoffice;
	private String city;
	private int pincode;
	
	
	public Adrress(String flatNo, String area, String postoffice, String city, int pincode) {
		super();
		this.flatNo = flatNo;
		this.area = area;
		this.postoffice = postoffice;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Adrress [flatNo=" + flatNo + ", area=" + area + ", postoffice=" + postoffice + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}


	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
