package fr.bnp.market;

import java.util.ArrayList;
import java.util.List;

import fr.bnp.ServiceManager.ArticleManager;
import fr.bnp.ServiceManager.PromotionManager;
import fr.bnp.model.Item;
import fr.bnp.model.ItemDictionnary;
import fr.bnp.model.Panier;

public class supermarket {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Panier panier = new Panier();
		double total=0;
		Item item1 = new Item("Apple", 4);
		Item item2 = new Item("Orange", 3);
		Item item3 = new Item("Watermelon", 5);
		items.add(item1);
		items.add(item2);
		items.add(item3);

		PromotionManager promotionManager = new PromotionManager();
		ArticleManager articleManager = new ArticleManager();
		
		panier.setItems(items);

		

		for (Item item : items) {
			articleManager.defineArticle(item);
			promotionManager.discount(item);
			System.out.println(item);
			total+=item.getPriceAfterPromotion();
		}
		panier.setTotal(total);	
		System.out.println("Total ammount to pay for the product below :"+panier.getTotal() +"£");

//		articleManager.defineArticle(item2);
//		promotionManager.discount(item2);
//		System.out.println("orange item " + item2);
//		items.add(item1);
//
//		articleManager.defineArticle(item3);
//		promotionManager.discount(item3);
//		items.add(item1);
//
//		System.out.println("Watermelon item " + item3);

	}

}
