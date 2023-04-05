package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class UpdatePreparedStatement {
	UpdatePreparedStatement ups = new UpdatePreparedStatement();
	static Scanner sc = new Scanner(System.in);
	static Connection connection = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/Student";
			String user = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, user, password);
			
			System.out.println("Enter your choice");
			
			
			
			int choice =  sc.nextInt();
			switch(choice)
			{
				case 1 :{
					
				}
				case 2:{
				
					
				}
                case 3 :{
					
				}
				case 4:{
				
					
				}
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void updatequery() throws SQLException {
		String update = "insert from Student1 where marks = 65 ";
		PreparedStatement preparedstatement = connection.prepareStatement(update);
        ResultSet result = preparedstatement.executeQuery();
        if(result.next())
        {
        	String name = result.getString("name");
        	int password = result.getInt("password");
        	String country = result.getString("country");
        	int marks = result.getInt("marks");
        	
        	
        	System.out.println("name is:::"+name);
        	System.out.println("password is"+password);
        	System.out.println("the country is:"+country);
        	System.out.println("the marks is: "+marks);
        }
        else
        {
        	System.out.println("result not found....");
        }
	}
	

}
