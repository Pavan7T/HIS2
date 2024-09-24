package com.his.test;

import com.his.utils.TestDataGenerator;

public class TestFacker {

	public static void main(String[] args) {

		TestDataGenerator dataGenerator = new TestDataGenerator();

		System.out.println(dataGenerator.getRandomName());
		System.out.println(dataGenerator.getRandomCompanyName());
		System.out.println(dataGenerator.getRandomEmail());
		System.out.println(dataGenerator.getRandomCreditCardNumber());
		System.out.println(dataGenerator.getRandomPassword());
		System.out.println(dataGenerator.getRandomState());
	}

}
