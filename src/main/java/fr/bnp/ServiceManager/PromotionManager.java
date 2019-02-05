package fr.bnp.ServiceManager;

import fr.bnp.model.Item;

public class PromotionManager {
	double totalAfterPromotion=0;
	
	public double discount(Item item) {
		
		
	if (item.getName().equalsIgnoreCase("Apple")) {

		discountApple(item);
	}
	else if(item.getName().equalsIgnoreCase("Orange")) {
		totalAfterPromotion=item.getQuantity()*item.getPrice();
		item.setPriceAfterPromotion(totalAfterPromotion);

	}
	
	else  { 
		discountWatermelon(item);
	}
		return  totalAfterPromotion;
	}

	
	private double discountApple (Item item) {
		
		if (item.getQuantity()==1)
			totalAfterPromotion=item.getQuantity();
		else if(item.getQuantity()%2==0)
			
		{
			totalAfterPromotion=item.getQuantity()*item.getPrice()/2;
		}
		else {
			totalAfterPromotion=Math.ceil(((item.getQuantity()-1)/2)*
					item.getPrice())+item.getPrice();
		

		}
		
		item.setPriceAfterPromotion(totalAfterPromotion);
		return totalAfterPromotion;
		
	}
	
private double discountWatermelon (Item item) {
		
		if (item.getQuantity()<=2)
			totalAfterPromotion=item.getQuantity()*item.getPrice();
		
		else {
			// here i've used ceil t get the smallest double
			totalAfterPromotion=Math.ceil(5-5/3)*0.8;		

		}
		
		item.setPriceAfterPromotion(totalAfterPromotion);
		return totalAfterPromotion;
		
	}
	
	

}
