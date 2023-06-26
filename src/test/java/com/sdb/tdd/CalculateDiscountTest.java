package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	public static final String SOFTWARE_DEVELOPMENT_BOOK_I = "Clean Code (Robert Martin, 2008)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_II = "The Clean Coder (Robert Martin, 2011)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_III = "Clean Architecture (Robert Martin, 2017)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_IV = "Test Driven Development by Example (Kent Beck, 2003)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_V = "Working Effectively With Legacy Code (Michael C. Feathers, 2004)";

	@Test
	public void initializeToBuyBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		String book = SOFTWARE_DEVELOPMENT_BOOK_I;
		double discount = 0.00;
		int noOfBooks = 1;
		assertEquals(50.0, calculateDiscount.getTotalPrice(discount, noOfBooks));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		List<String> sdbList = new ArrayList<>();
		String book = SOFTWARE_DEVELOPMENT_BOOK_I;
		String book2 = SOFTWARE_DEVELOPMENT_BOOK_II;
		double discount = 5;
		sdbList.add(book);
		sdbList.add(book2);
		int noOfBooks = sdbList.size();
		assertEquals(95.0, calculateDiscount.getTotalPrice(discount, noOfBooks));
	}

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		List<String> sdbList = new ArrayList<>();
		String book = SOFTWARE_DEVELOPMENT_BOOK_I;
		String book2 = SOFTWARE_DEVELOPMENT_BOOK_II;
		String book3 = SOFTWARE_DEVELOPMENT_BOOK_III;
		double discount = 10;
		sdbList.add(book);
		sdbList.add(book2);
		sdbList.add(book3);
		int noOfBooks = sdbList.size();
		assertEquals(135, calculateDiscount.getTotalPrice(discount, noOfBooks));

	}

}
