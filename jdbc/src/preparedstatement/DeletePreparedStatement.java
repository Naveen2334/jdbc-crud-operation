package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePreparedStatement {
	static Connection connection = null;
	static Scanner sc = new Scanner(System.in);
	static DeletePreparedStatement dj = new DeletePreparedStatement();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String password = "root";
			
			connection = DriverManager.getConnection(url, user, password);
			
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				
			}
			case 2:{
				
			}
			case 3:{
				dj.deleteMethod();
				
			}
			
			}
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void deleteMethod() throws SQLException {
		
		System.out.println("Enter the marks you want to delete");
		int marks=sc.nextInt();
		String del = "delete from student1 where marks = "+marks;
		PreparedStatement preparedStatement = connection.prepareStatement(del);
		//here you can use Statement statement = connection.createStatement(del);
		
		int row = preparedStatement.executeUpdate(del);
		if(row>0) {
			System.out.println("record is deleted successful");
		
		/*String del = "delete from student1 where marks = 85";
		PreparedStatement preparedStatement = connection.prepareStatement(del);
		//here you can use Statement statement = connection.createStatement(del);
		
		int row = preparedStatement.executeUpdate(del);
		if(row>0) {
			System.out.println("record is deleted successful");
		}
		*/
	}

	}
	}
