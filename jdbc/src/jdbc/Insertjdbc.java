package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertjdbc {

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
				
				 ResultSet rs = stmt.executeQuery("select * from student1;");
				 while(rs.next())
				 {
					 System.out.println(rs.getString(1)+rs.getString(2));
				 }
				 
			
			} catch (SQLException | ClassNotFoundException e) {
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