//package com.qa.databases;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class MysqlItemDao implements Dao<Item> {
//	private Connection connection;
//	
//	public MysqlItemDao() throws SQLException {
//		this.connection = DriverManager.getConnection("jdbc:mysql://35.189.111.39/IMS","root","Iamlegend123");
//		}
//
//	public void create(Item item) {
//		
//	}
//	
//	public ArrayList<Item> readAll() {
//		ArrayList<Item> items = new ArrayList<Item>();
//		try {
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from Item");
//			while (resultSet.next()) {
//				Long id = resultSet.getLong("Customer_id");
//				Long itemId = resultSet.getLong("Item_id");
//				String itemName = resultSet.getString("item_name");
//				Item item = new Item(id, itemId, itemName);
//				items.add(item);
//			}
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		return items;
//		
//	}
//
//	public void update(Item item) {
//	
//		}
//
//	public void delete(int id) {
//		
//		}
//	
//}
