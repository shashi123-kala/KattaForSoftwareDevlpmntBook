package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdb.entity.SoftwareDevelopmentBook;
import com.sdb.entity.SoftwareDevelopmentBookSetDiscount;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, 5));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, 10));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, 20));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, 25));
	}

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		sdbList.add(sdbFirstI);
		double discount = 0.00;
		int noOfBooks = 1;
		assertEquals(50.0, calculateDiscount.getTotalPrice(discount, noOfBooks));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		double discount = 5;
		sdbList.add(sdbFirstI);
		sdbList.add(sdbSecondI);
		int noOfBooks = sdbList.size();
		assertEquals(95.0, calculateDiscount.getTotalPrice(discount, noOfBooks));
	}

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		List<SoftwareDevelopmentBook> sdbList = new ArrayList<>();
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		double discount = 10;
		sdbList.add(sdbFirstI);
		sdbList.add(sdbSecondI);
		sdbList.add(sdbThirdI);
		int noOfBooks = sdbList.size();
		assertEquals(135, calculateDiscount.getTotalPrice(discount, noOfBooks));

	}

}
