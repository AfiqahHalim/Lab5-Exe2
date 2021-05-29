package model;

import java.io.Serializable;

public class Product implements Serializable {
	
	protected int itemProduct;
	protected String name;
	protected float price;
	
	public void setItemProduct(int itemProduct) {
		this.itemProduct = itemProduct;
	}
	
	public int getItemProduct() {
		return itemProduct;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice (float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}

}
