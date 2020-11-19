package cs6359.utdcart.entity.impl;

import cs6359.utdcart.entity.User;

public class Driver extends User {

	public Driver(String uID, String password, String firstName, String lastName, String email) {
		super(uID, password, firstName, lastName, email);
		// TODO Auto-generated constructor stub
		this.setUserType("driver");
	}

}
