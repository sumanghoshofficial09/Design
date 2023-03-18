package com.noc.calculator;

import com.noc.customer.profiles.HealthInsuranceCustomerProfile;

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

}
