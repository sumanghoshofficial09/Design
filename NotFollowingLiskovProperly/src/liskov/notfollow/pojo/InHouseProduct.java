package liskov.notfollow.pojo;


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
	
	public void applyExtraDiscount()
	{
		discount=discount*1.5;
	}

}
