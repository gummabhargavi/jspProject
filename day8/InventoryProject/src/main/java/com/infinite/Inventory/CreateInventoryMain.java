package com.infinite.Inventory;

import java.sql.SQLException;
import java.util.Scanner;



public class CreateInventoryMain {
	public static void main(String[] args) {
		InventoryDAO dao=new InventoryDAO();
		Inventory inventory = new Inventory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId ");
		inventory.setStockid(sc.next());
		System.out.println("Enter ItemName ");
		inventory.setItemName(sc.next());
		System.out.println("Enter price ");
		inventory.setPrice(sc.nextDouble());
		System.out.println("Enter  QuantityAvail ");
		inventory.setQuantityAvail(sc.nextInt());
		
		try {
			System.out.println(dao.createStock(inventory));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			System.out.println(dao.generatestockid());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
