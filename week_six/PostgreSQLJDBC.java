package week_six;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {
	
	//Configuring Java Database Connnectivity

	public static void main(String[] args) {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/feedApp", "postgres", "pg123");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database Successfully");

	}

}
