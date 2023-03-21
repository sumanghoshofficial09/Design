package liskov.follow.util;

import java.util.ArrayList;
import java.util.List;

import liskov.follow.pojo.InHouseProduct;
import liskov.follow.pojo.Product;

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
 * we will take the help of inheritance override property 
 * 
 * we will override the getDiscount method from the product class  and make it call the 
 * 
 * applyExtraDiscount method in turn 
 * 
 * we can deal with all object what kind of instance , each object is , we dont need to know 
 * 
 * we are now following tell dont ask rule 
 * 
 * there by following the liskov substitutiin principle 
 * 
 * we have not affected the correctness of the programme 
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
			
			
			System.out.println("here it is "+product.getDiscount());
			
		}
		
		
		
		
		
	}

}
