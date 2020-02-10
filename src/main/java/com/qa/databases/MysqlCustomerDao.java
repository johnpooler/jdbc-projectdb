package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.util.Util;

public class MysqlCustomerDao implements Dao<Customer> {
	
	private Connection connection;
	
	public MysqlCustomerDao() {
		Scanner sc =new Scanner(System.in);
		System.out.println("user: ");
		String user= sc.nextLine();
		System.out.println("password: ");
		String pWord= sc.nextLine();
		try {this.connection = DriverManager.getConnection("jdbc:mysql://35.189.95.166/projectdb",user,pWord);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
//			throws SQLException {
//		this.connection = DriverManager.getConnection("jdbc:mysql://35.189.95.166/projectdb","root","johnpooler");
//		}
	//CREATE
	public void create(Customer customer) {
		
			try {
				Statement statement = connection.createStatement();
				statement.executeUpdate("insert into Customers(id, name) values('" + customer.getId() + "','" + customer.getName() +"')" );
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
//		try {
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("insert into customers(id, name) values('" + customer.getId() + "','" + customer.getName()+"')");
//			while (resultSet.next()) {
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("name");
//				
//			}
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
			
		

		
		
	
	//READ
	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customer");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
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