package liskov.follow.pojo;


/**
 * 
 * 
 * @author ciphe
 * 
 * 
 * no overriding till now 
 * 
 *
 */
public class InHouseProduct extends Product {
	
	@Override
	public double getDiscount()
	{
		this.applyExtraDiscount();
		
		return discount;
		
	}
	
	
	public void applyExtraDiscount()
	{
		discount=discount*1.5;
	}

}
