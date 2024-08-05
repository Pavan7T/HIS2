package com.his.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.his.utils.WaitUtils;

public class BasePage {
	protected WebDriver driver;
	private WaitUtils waitUtil;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitUtil = new WaitUtils(this.driver, 20);
	}

	public void click(By element) throws InterruptedException {
		WebElement Webelement = waitUtil.waitForElementToBeClickable(element);
		Thread.sleep(2000);
		Webelement.click();
		Thread.sleep(2000);

	}

	public void Sendkeys(WebElement password, String value) {
		WebElement Webelement = waitUtil.waitForElementToBeVisible(password);
		Webelement.sendKeys(value);
	}

	public void clear(By element) {
		WebElement Webelement = waitUtil.waitForElementToBeClickable(element);
		Webelement.clear();
	}

	public String getTitle() {
		String PageTitle = driver.getTitle();
		return PageTitle;

	}

}
