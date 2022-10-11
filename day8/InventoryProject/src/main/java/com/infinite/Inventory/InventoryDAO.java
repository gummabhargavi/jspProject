package com.infinite.Inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class InventoryDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public String createStock(Inventory inventory) 
			throws ClassNotFoundException, SQLException {
		String stockId = generatestockid();
		inventory.setStockid(stockId);
		String cmd = "insert into Stock(stockid,ItemName,Price,QuantityAvail)"+"values(?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, inventory.getStockid());
		pst.setDouble(2, inventory.getPrice());
		pst.setInt(3, inventory.getQuantityAvail());
		pst.setString(4, inventory.getItemName());
        pst.executeUpdate();
		return "Stock Created...";
	}
	
	 public String generatestockid()
	    		throws ClassNotFoundException, SQLException{
	    	String cmd = "select max(stockId) sid from stock ";
	    connection = ConnectionHelper.getConnection();
	    pst = connection.prepareStatement(cmd);
	    ResultSet rs = pst.executeQuery();
	    rs.next();
	    String stockid = rs.getString("sid");
	    int id=Integer.parseInt(stockid.substring(1));
	    id++;
	    stockid=String.format("S%03d", id);
	    return stockid;

	    }
	

	
}
