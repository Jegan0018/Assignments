package controller;

import view.AdminLogin;
import view.AdminView;

public class AdminLoginController {
	private AdminLogin adminLogin;

	public AdminLoginController(AdminLogin adminLogin) {
		this.adminLogin=adminLogin;
	}

	public void adminLogin(String name, String password) {
		if(name.equals("Jegan") && password.equals("1234")) {
			System.out.println("Logged In Successfully");
			new AdminView().adminDisplay();
		} else {
			System.out.println("Invalid ID");
		}
		
	}
}
