package com.noc.calculator;

import com.noc.customer.profiles.CustomerProfile;
import com.noc.customer.profiles.HealthInsuranceCustomerProfile;
import com.noc.customer.profiles.HomeInsuranceCustomerProfile;
import com.noc.customer.profiles.VehicleInsuranceCustomerProfile;

/**
 * 
 * @author ciphe
 *
 *our code is following the Open Close Principle 
 *
 *if we want to change  the customer profile in this class 
 *we donot need to change the InsurancePremiumDiscountCalculator Class 
 *
 *to have a new feature or new Customer Profile to get added over here 
 *
 * 
 *
 */
public class InsurancePremiumDiscountCalculator {
	
	public int calculatePremiumDiscountPercent(CustomerProfile customer)
	{
		if(customer.isLoyalCustomer())
		{
			return 20;
		}
		
		return 10;
		
	}
	
	

}
