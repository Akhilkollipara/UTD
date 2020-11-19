package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cs6359.utdcart.dao.Command;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.service.ConnectionManager;

public class SaveUser implements Command {

	private static final String sql = "INSERT INTO `utdcart`.`user` (username, firstName, lastName, email, password, type) VALUES (?, ?, ?, ?, ?, ?)";
	private PreparedStatement ps = null;
	private User user = null;

	

	public SaveUser(User user) {
		this.user = user;
	}

	@Override
	public void execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, user.getuID());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getUserType());
			int count = ps.executeUpdate();
			connection.close();

		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();

		}
	}
}
