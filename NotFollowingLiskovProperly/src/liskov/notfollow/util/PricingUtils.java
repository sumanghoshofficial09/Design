package liskov.notfollow.util;

import java.util.ArrayList;
import java.util.List;

import liskov.notfollow.pojo.InHouseProduct;
import liskov.notfollow.pojo.Product;

/*
 * 
 * 
 * 
 * we have all three reference type is Product 
 * 
 * among them two of them is instance type of Product 
 * 
 * 3rd one is instance type of InHouseProduct 
 * 
 * we insert all 3 into an arraylist 
 * 
 * then we iterate through each 
 * 
 * if the object is instance of InHouseProduct we will apply extra discount 
 * 
 * the object is downcasted to InHouseProduct object and then we are calling applyExtraDiscount method 
 * 
 * we already discussed why it is bad design , because we are asking what kind of object it is 
 * 
 * we should not have to ask what kind of object it is  
 * 
 * we should able to deal all the object as generic Product object 
 * 
 * this is not we should not have to ask what kind of object instance is this 
 * 
 * we should deal all object as generic product object 
 * 
 * in order to apply Liskov subs principle here we need to revamp the code 
 * 
 * 
 * 
 * 
 */
public class PricingUtils {
	
	public static void main(String aegs[])
	{
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		for(Product product : productList)
		{
			
			if(product instanceof InHouseProduct )
			{
				
				((InHouseProduct) product).applyExtraDiscount();
				
			}
			
			
			System.out.println("here it is "+product.getDiscount());
			
		}
		
		
		
		
		
	}

}
