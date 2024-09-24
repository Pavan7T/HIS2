package com.his.utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class TestDataGenerator {
	private Faker faker;

	public TestDataGenerator() {

		this.faker = new Faker(new Locale("en", "IN"));
	}

	// Basic data methods
	public String getRandomName() {
		return faker.name().fullName();
	}

	public String getRandomEmail() {
		return faker.internet().emailAddress();
	}

	public String getRandomAddress() {
		return faker.address().fullAddress();
	}

	public String getRandomPhoneNumber() {
		return faker.phoneNumber().phoneNumber();
	}

	public String getRandomCompanyName() {
		return faker.company().name();
	}

	public String getRandomJobTitle() {
		return faker.job().title();
	}

	public String getRandomCreditCardNumber() {
		return faker.finance().creditCard();
	}

	/*
	 * public String getRandomUsername() { return faker.internet().userAgent(); }
	 */

	public String getRandomPassword() {
		return faker.internet().password();
	}

	public String getRandomDateOfBirth() {
		return faker.date().birthday().toString();
	}

	public String getRandomParagraph() {
		return faker.lorem().paragraph();
	}

	public String getRandomText() {
		return faker.lorem().sentence();
	}

	/*
	 * public String getRandomImageUrl() { return faker.image().imageUrl(); }
	 */

	public String getRandomUrl() {
		return faker.internet().url();
	}

	public String getRandomCity() {
		return faker.address().city();
	}

	public String getRandomCountry() {
		return faker.address().country();
	}

	public String getRandomState() {
		return faker.address().state();
	}

	public String getRandomZipCode() {
		return faker.address().zipCode();
	}

	public String getRandomCompanyCatchPhrase() {
		return faker.company().catchPhrase();
	}

	public String getRandomProductName() {
		return faker.commerce().productName();
	}

	public String getRandomPrice() {
		return faker.commerce().price();
	}

	public String getRandomColor() {
		return faker.commerce().color();
	}

	/*
	 * public String getRandomCreditCardType() { return
	 * faker.finance().creditCardType(); }
	 * 
	 * public String getRandomISBN() { return faker.book().isbn13(); }
	 */
	public String getRandomAuthor() {
		return faker.book().author();
	}

	public String getRandomTitle() {
		return faker.book().title();
	}
}
