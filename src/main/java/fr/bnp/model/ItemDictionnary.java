package fr.bnp.model;

import java.util.HashMap;
import java.util.Map;

public class ItemDictionnary {
	
	
	
	
	public static Map<String, Double > itemNamePrice = new HashMap<>();
	
	public  static  void  initializeProduct() {
		itemNamePrice.put("Apple", 0.20);
		itemNamePrice.put("Orange", 0.50);
		itemNamePrice.put("Watermelon", 0.80);
	
	}
	
}
