package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = new DBConnection().getConnection();
		System.out.println("Connection is SUCCESS!"+conn);
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
