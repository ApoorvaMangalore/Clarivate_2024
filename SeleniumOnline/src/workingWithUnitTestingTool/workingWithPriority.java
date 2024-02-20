package workingWithUnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingWithPriority {// testCase ID TC_demoWebshop_001_Test

	@Test(priority = -1)
	public void register() {// tc test
		System.out.println("User is able to register");
		// Reporter.log("Hello testNG",true);
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("User is able to login");
	}

	@Test(priority = -3)
	public void search() {
		System.out.println("User is able to search product");
	}

	@Test(priority = 4)
	public void cart() {
		System.out.println("User is able to add  product to the cart");
	}

	@Test(priority =- 5)
	public void payment() {
		System.out.println("User is able to make a payment");
	}

	@Test(priority = 6)
	public void logOut() {
		System.out.println("User is able to Logout");
	}

}
