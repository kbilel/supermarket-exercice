package fr.bnp.model;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private double total ;
private List<Item> items=new ArrayList<>();

public List<Item> getItems() {
	return items;
}

public void setItems(List<Item> items) {
	this.items = items;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}




}
