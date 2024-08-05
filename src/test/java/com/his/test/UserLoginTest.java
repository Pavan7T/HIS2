package com.his.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;
import com.his.pages.LoginPage;
import com.his.pages.HomePage;

public class UserLoginTest extends BaseTest {

	LoginPage LoginPage;
	HomePage HomePage;

	public UserLoginTest() {
		super();
	}

	@Test
	public void userlogin() throws InterruptedException {
		LoginPage = new LoginPage(driver);
		String ActualTitle=LoginPage.loginAction();
		assertEquals(ActualTitle,"Home");
		
	}
	
	@Test
	public void userlogOut() throws InterruptedException {
		LoginPage = new LoginPage(driver);
		String ActualTitle=LoginPage.loginAction();
		HomePage=new HomePage(driver);
		HomePage.userlogoutAction();
	
	}
	
	
}
