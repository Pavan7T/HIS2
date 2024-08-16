package com.his.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.his.AbstractComponents.BasePage;

public class HomePage extends BasePage {

	By logoutbtn = By.xpath("//a[text()='Logout']");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void userlogoutAction() throws InterruptedException {
		click(logoutbtn);
	}

}
