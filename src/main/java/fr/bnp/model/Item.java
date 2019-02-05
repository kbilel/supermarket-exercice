package fr.bnp.model;


public class Item {

	private double price;
	private  String name;
	private int quantity;
	private double priceAfterPromotion;
	
	public Item() {
	
	}
	
	
	public Item(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPriceAfterPromotion() {
		return priceAfterPromotion;
	}
	public void setPriceAfterPromotion(double priceAfterPromotion) {
		this.priceAfterPromotion = priceAfterPromotion;
	}


	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + ", quantity=" + quantity + ", priceAfterPromotion="
				+ priceAfterPromotion + "]";
	}
	
	
	

}