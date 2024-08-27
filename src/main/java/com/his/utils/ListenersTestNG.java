package com.his.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	public void onFinish(ITestContext contextFinish) {
		System.out.println("onFinish method finished");

	}

	public void onStart(ITestContext contextStart) {
		System.out.println("onStart method started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method failed with certain success percentage" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Method failed" + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped" + result.getName());

	}

	public void onTestStart(ITestResult result) {
		System.out.println("Method started" + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Method passed" + result.getName());

	}

}