package pratice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://192.168.99.100:3306/DB";   //?useTimezone=true&serverTimezone=UTC";
		
		Connection conn = DriverManager.getConnection(url,"root","password");
		
		Statement statement = conn.createStatement();
		
		int status = statement.executeUpdate("UPDATE  employees_tbl SET salary=800 WHERE id=700;");
		
		
		
		System.out.println("Executed: "+status);
		

	}

}
