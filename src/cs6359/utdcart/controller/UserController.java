package cs6359.utdcart.controller;

import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.Driver;

public class UserController {
	private String userType;
	private Customer customer;
	private Driver driver;
	
	public UserController() {
		
	}

	
	public int register(String username, String password, String firstName, String lastName, String email,
			String userType) throws Exception {
		
		
		this.userType = userType;
		System.out.println(this.userType);

		if (this.userType.equals("Customer")) {
			System.out.println("inside");
			this.customer = new Customer(username, password, firstName, lastName, email);
		} else if (this.userType.equals("Driver")) {
			this.driver = new Driver(username, password, firstName, lastName, email);
		}
		return -1;
	}
	
	public static int test() {
		
		System.out.print(true);
		return -1;
	}
	public int login(String username, String password) {
		return -1;
	}

	public int logout(int id) {
		return -1;
	}

}
