package com.his.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitUtils(WebDriver driver, int timeoutInSeconds) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	}

	public WebElement waitForElementToBeVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitForElementToBeClickable(By element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean waitForElementToBeInvisible(WebElement element) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

}
