package com.noc.calculator;

import com.noc.customer.profiles.HealthInsuranceCustomerProfile;
import com.noc.customer.profiles.HomeInsuranceCustomerProfile;
import com.noc.customer.profiles.VehicleInsuranceCustomerProfile;

/**
 * 
 * @author ciphe
 * 
 * if you want to change the customer profile in InsurancePremiumDiscountCalculator  then you need to change the 
 * 
 * InsurancePremiumDiscountCalculator class 
 * 
 * this is violating open close principle
 * 
 * every time we need to support a new customer profile, we need to add a new 
 * 
 * over loaded method to the InsurancePremiumDiscountCalculator class 
 * 
 * so actually we are changing the existing code every time 
 * 
 * 
 *
 */
public class InsurancePremiumDiscountCalculator {
	
	public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer)
	{
		if(customer.isLoyalCustomer())
		{
			return 20;
		}
		
		return 10;
		
	}
	
	public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer)
	{
		if(customer.isLoyalCustomer())
		{
			return 20;
		}
		
		return 10;
		
	}
	
	
	public int calculatePremiumDiscountPercent(HomeInsuranceCustomerProfile customer)
	{
		if(customer.isLoyalCustomer())
		{
			return 20;
		}
		
		return 10;
		
	}

}
