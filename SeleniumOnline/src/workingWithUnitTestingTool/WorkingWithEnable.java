package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithEnable {
	@Test()
	public void ragitser() {
		System.out.println("Register");
	}
	@Test(enabled = false)
	public void logOut() {
		System.out.println("LogOUt");
	}
}
