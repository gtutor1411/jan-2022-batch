package stepDefinition;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TagSteps {	


	@Given("This is a login test")
	public void this_is_a_login_test() {
		System.out.println("Login tested");
	}

	@Given("This is a logout test")
	public void this_is_a_logout_test() {
		System.out.println("Logout tested");
	}

	@Given("This is a search test")
	public void this_is_a_search_test() {
		System.out.println("Search tested");
	}

	@Given("This is a shopping cart test")
	public void this_is_a_shopping_cart_test() {
		System.out.println("Shoppping cart tested");
	}

	@Given("This is a register user test")
	public void this_is_a_register_user_test() {
		System.out.println("Register user tested tested");
	}

}
