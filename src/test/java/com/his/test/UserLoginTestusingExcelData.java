package com.his.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.his.pages.LoginPage;
import com.his.testComponents.BaseTest;
import com.his.utils.ExcelReader;
import com.his.utils.log;
import com.his.pages.HomePage;

@Listeners(com.his.testComponents.ListenersTestNG.class)
public class UserLoginTestusingExcelData extends BaseTest {

	LoginPage LoginPage;
	HomePage HomePage;

	@Test(dataProvider = "loginData")
	public void userlogin(String username, String Password) throws InterruptedException {
		log.startTestCase("userlogin");
		LoginPage = new LoginPage(driver);
		String ActualTitle = LoginPage.loginActionUsingExcelData(username, Password);
		assertEquals(ActualTitle, "Home");
		log.endTestCase("userlogin");

	}

	@DataProvider(name = "loginData")
	public Object[][] provideLoginData() throws IOException {
		return ExcelReader
				.readExcel(System.getProperty("user.dir") + 
						"//src//main//java//com//his//resources//Data.xlsx");
	}

}
