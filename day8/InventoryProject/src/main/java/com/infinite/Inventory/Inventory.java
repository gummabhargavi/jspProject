package com.infinite.Inventory;

public class Inventory {
	private String stockid;
	private double Price;
	private String itemName;
	private int quantityAvail;
	
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	@Override
	public String toString() {
		return "Inventory [stockid=" + stockid + ", Price=" + Price + ", itemName=" + itemName + ", quantityAvail="
				+ quantityAvail + "]";
	}
	public Inventory(String stockid, double price, String itemName, int quantityAvail) {
		this.stockid = stockid;
		Price = price;
		this.itemName = itemName;
		this.quantityAvail = quantityAvail;
	}
	public Inventory() {
		
	}
	
	
	
	
	
}
