package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchdataPreparedStatement {
	private static Connection Connection = null;
	static FetchdataPreparedStatement fh = new FetchdataPreparedStatement();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Student";
			String user = "root";
			String password = "root";
			Connection = DriverManager.getConnection(url, user, password);
			
			System.out.println("Enter your choice");
			
			
			
			int choice =  sc.nextInt();
			switch(choice)
			{
				case 1 :{
					
				}
				case 2:{
					fh.dataDespatch();
					
				}
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



    
	
  public void dataDespatch() throws SQLException
  {
	  //here i am taking marks from user 
	  System.out.println("enter the marks of person");
	  int mark =sc.nextInt();
	  String fetch = "select * from student1 where marks = "+mark;
	  PreparedStatement preparedStatement = Connection.prepareStatement(fetch);
	  //you can use Statement statement in place of preparedStatement preparedStatement
	  ResultSet rs = preparedStatement.executeQuery(fetch);
	  if(rs.next()) {

		  String name = rs.getString("name");
		  int password = rs.getInt("password");
		  String country =rs.getString("country");
		  int marks =rs.getInt("marks");
		  
		  System.out.println("name of ::: "+name);
		  System.out.println("password is:::"+password);
		  System.out.println("country is :::"+country);
		  System.out.println("marks of ::"+marks);
	  }
	  else {
		  System.out.println("No record form");
	  }

	  // here we directly put one value of marks
	/*  String fetch = "select * from student1 where marks = 95";
	  PreparedStatement preparedStatement = Connection.prepareStatement(fetch);
	  //you can use Statement statement in place of preparedStatement preparedStatement
	  ResultSet rs = preparedStatement.executeQuery(fetch);
	  while(rs.next())
	  {
		  String name = rs.getString("name");
		  int password = rs.getInt("password");
		  String country =rs.getString("country");
		  int marks =rs.getInt("marks");
		  
		  System.out.println("name of ::: "+name);
		  System.out.println("password is:::"+password);
		  System.out.println("country is :::"+country);
		  System.out.println("marks of ::"+marks);
	  }
	  */
	 
	  
  }
}
	  
  

