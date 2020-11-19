package cs6359.utdcart.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	private final String url = "jdbc:mysql://10.10.10.3:3306/utdcart";
	private final String username = "user";
	private final String password = "Password1@";
	private Connection connection = null;

	public Connection getConnection() throws Exception {
		try {
			this.connection = DriverManager.getConnection(this.url, this.username, this.password);
			
			//System.out.println("Location ::: get Connection");
			return this.connection;
		} catch (Exception e) {
			System.out.println("Location ::: get Connection | Errror");
			close();
			throw e;
		} finally {
			//close();
		}
		// return this.connection;
	}

	public void close() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (Exception e) {

		}
	}
}
