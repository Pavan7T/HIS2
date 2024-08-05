package com.his.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.his.utils.Constants;
import com.his.utils.WaitUtils;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@id='txtLoginname']")
	WebElement username;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;

	// By password = By.xpath("//input[@id='txtPassword']");
	By submitBtn = By.xpath("//input[@id='btnSubmit']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String loginAction() throws InterruptedException {
		Sendkeys(username, Constants.username);
		Sendkeys(password, Constants.password);
		click(submitBtn);
		String Title = getTitle();
		return Title;
	}

}
