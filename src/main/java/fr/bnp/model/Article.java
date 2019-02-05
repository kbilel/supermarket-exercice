package fr.bnp.model;
public class Article {
// pass article(name , quantity ) 
	//then promotion manager define type defyne promotion calcul article cost 
	private final double price;
	private final String name;
	private int quantity;

	public Article(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double total(double amount) {
		//return Manager.total();
		return 4;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	



}