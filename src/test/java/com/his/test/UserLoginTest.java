package com.his.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import com.his.pages.LoginPage;
import com.his.testComponents.BaseTest;
import com.his.pages.HomePage;

@Listeners(com.his.utils.ListenersTestNG.class)
public class UserLoginTest extends BaseTest {

	LoginPage LoginPage;
	HomePage HomePage;

	@Test
	public void userlogin() throws InterruptedException {
		LoginPage = new LoginPage(driver);
		String ActualTitle = LoginPage.loginAction();
		AssertJUnit.assertEquals(ActualTitle, "Home");

	}

	@Test
	public void userlogOut() throws InterruptedException {
		LoginPage = new LoginPage(driver);
		String ActualTitle = LoginPage.loginAction();
		HomePage = new HomePage(driver);
		HomePage.userlogoutAction();

	}

}
