package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlCustomerDao implements Dao<Customer> {
	
	private Connection connection;
	
	public MysqlCustomerDao() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://35.189.95.166/projectdb","root","johnpooler");
		}
	//CREATE
	public void create(Customer customer) {
		
	}
	//READ
	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Customer");
			while (resultSet.next()) {
				int id = resultSet.getInt("Customer_id");
				String name = resultSet.getString("name");
				//String surname = resultSet.getString("surname");
				Customer customer = new Customer(id , name);
				customers.add(customer);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return customers;
		
	}
	//UPDATE
	public void update(Customer customer) {
		
	}
	//DELETE
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}