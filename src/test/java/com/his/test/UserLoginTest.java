package com.his.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import com.his.pages.LoginPage;
import com.his.testComponents.BaseTest;
import com.his.utils.log;
import com.his.pages.HomePage;

@Listeners(com.his.testComponents.ListenersTestNG.class)
public class UserLoginTest extends BaseTest {

	LoginPage LoginPage;
	HomePage HomePage;

	@Test
	public void userlogin() throws InterruptedException {
		log.startTestCase("userlogin");
		LoginPage = new LoginPage(driver);
		String ActualTitle = LoginPage.loginAction();
		assertEquals(ActualTitle, "Home");
		log.endTestCase("userlogin");

	}

	@Test
	public void userlogOut() throws InterruptedException {
		LoginPage = new LoginPage(driver);
		String ActualTitle = LoginPage.loginAction();
		HomePage = new HomePage(driver);
		HomePage.userlogoutAction();

	}

	@Test(invocationCount = 3)
	public void TC3() throws InterruptedException {
		
		System.out.println("Fullscreen operation done");
	}
}
