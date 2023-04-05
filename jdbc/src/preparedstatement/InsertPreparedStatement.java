package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPreparedStatement {
	static Connection connection= null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertPreparedStatement obj = new InsertPreparedStatement();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String password = "root";
			
			 connection = DriverManager.getConnection(url, user, password);
			 
			 System.out.println("Enter choice");
			 System.out.println("1.Insert record");
			 int choice = sc.nextInt();
			 
			 switch(choice)
			 {
			 case 1:
			 {
				obj.insertRecord();
			 }
			 case 2:
			 {
				 
			 }
			 case 3:
			 {
				 
			 }
			 case 4:
			 {
				 
			 }
			 }
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


private void insertRecord() throws SQLException {
	
	
	
	
	
/*	String insert = "insert into Student1(name,password,country,marks) values ('kradhika',545466,'india',95)";
	PreparedStatement preparedStatement = connection.prepareStatement(insert);
	int rows = preparedStatement.executeUpdate(insert);
	if(rows>0)
	{
		System.out.println("data is inserted successful");
	}*/
	
	
	
	
	/*
	String insert = "insert into Student1(name,password,country,marks) values (?,?,?,?)";
	PreparedStatement preparedStatement = connection.prepareStatement(insert);
	preparedStatement.setString(1, "Sandeep");	
	preparedStatement.setInt(2, 5656565);
	preparedStatement.setString(3, "india");
	preparedStatement.setInt(4, 50);
	int rows = preparedStatement.executeUpdate();
	if(rows>0)
	{
		System.out.println("data entered successfully");
	}
	*/
	String insert = "insert into Student1(name,password,country,marks) values (?,?,?,?)";
	PreparedStatement preparedStatement = connection.prepareStatement(insert);
	
	System.out.println("Enter the name");
	preparedStatement.setString(1, sc.next());	
	System.out.println("enter password");
	preparedStatement.setInt(2, sc.nextInt());
	System.out.println("Enter the country name");
	preparedStatement.setString(3, sc.next());
	System.out.println("Enter the marks");
	preparedStatement.setInt(4, sc.nextInt());
	int rows = preparedStatement.executeUpdate();
	if(rows>0)
	{
		System.out.println("data entered successfully");
	}
	
	
	
	
	
}
}
