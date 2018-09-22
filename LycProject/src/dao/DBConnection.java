package dao;
import java.sql.*;

/**
 * @author Sephiroth
 *
 */
public class DBConnection {

	private Connection conn;
	private String user="root";
	private String password="123456";
	private String driverName="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/sys";
	
	public  DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException  e) {
			// TODO: handle exception
			System.out.println("Failed to load the database driver!");
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Failed to create database connection!");
			conn = null;
			e.printStackTrace();
		}
		return conn;
	}
}
