package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedeletejdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user ="root";
			String password = "root";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Database connection established");
			Statement stmt = connection.createStatement();
			/*
			 *update query
			 * 
			 * stmt.executeUpdate("update student1 set password = 'harom' where name = 'satish';");
			System.out.println("The rcord has been update successfully");
			
			*/
			/*
			 * 
			 * delete query
			stmt.executeUpdate("delete from student1  where name = 'satish';");
			System.out.println("The rcord has been deleted successfully");
			*/
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
