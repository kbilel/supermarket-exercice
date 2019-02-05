package fr.bnp.ServiceManager;

import fr.bnp.model.Item;
import fr.bnp.model.ItemDictionnary;

public class ArticleManager {
	
	public Item defineArticle(Item item) {
		ItemDictionnary.initializeProduct();
		
		String typeOfArticle=item.getName();
	     switch (typeOfArticle) {
	         case "Apple":
	        	 item.setPrice(ItemDictionnary.itemNamePrice.get("Apple"));
	             break;
	         case "Orange":
	        	 item.setPrice(ItemDictionnary.itemNamePrice.get("Orange"));
break;
	         case "Watermelon":
	        	 item.setPrice(ItemDictionnary.itemNamePrice.get("Watermelon"));
	        	 break;
	         default:
	             throw new IllegalArgumentException("Invalid article: " + typeOfArticle);
	     }
	     return item;
	}


}
