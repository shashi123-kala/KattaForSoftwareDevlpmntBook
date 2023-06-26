package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdb.constants.SoftwareDevlopmentBooksConstants;
import com.sdb.entity.SoftwareDevelopmentBook;
import com.sdb.entity.SoftwareDevelopmentBookSetDiscount;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount;

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList
				.add(new SoftwareDevelopmentBookSetDiscount(SoftwareDevlopmentBooksConstants.TWO_BOOKS,
						SoftwareDevlopmentBooksConstants.FIVE_PERCENT_DISCOUNT_OF_TWO_BOOKS));
		byDifferentCopiesDiscountList
				.add(new SoftwareDevelopmentBookSetDiscount(SoftwareDevlopmentBooksConstants.THREE_BOOKS,
						SoftwareDevlopmentBooksConstants.TEN_PERCENT_DISCOUNT_OF_TWO_BOOKS));
		byDifferentCopiesDiscountList
				.add(new SoftwareDevelopmentBookSetDiscount(SoftwareDevlopmentBooksConstants.FOUR_BOOKS,
						SoftwareDevlopmentBooksConstants.TWENTY_PERCENT_DISCOUNT_OF_TWO_BOOKS));
		byDifferentCopiesDiscountList
				.add(new SoftwareDevelopmentBookSetDiscount(SoftwareDevlopmentBooksConstants.FIVE_BOOKS,
						SoftwareDevlopmentBooksConstants.TWENTY_FIVE_PERCENT_DISCOUNT_OF_TWO_BOOKS));
		calculateDiscount = new CalculateDiscount(byDifferentCopiesDiscountList);
	}

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		calculateDiscount.Add(sdbFirstI);
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		assertEquals(95.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		assertEquals(135, calculateDiscount.getTotalPrice());

	}
	
	@Test
	public void buyingFourCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIVBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		assertEquals(160, calculateDiscount.getTotalPrice());
	}
	
	@Test
	public void buyingFiveCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIVBook();
		SoftwareDevelopmentBook sdbFifthI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentVBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		calculateDiscount.Add(sdbFifthI);
		assertEquals(187.50, calculateDiscount.getTotalPrice());
	}
	
	@Test
	public void buyingFourCpysOfTwoDifftBook () {		
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		
		SoftwareDevelopmentBook sdbSecI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecIII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
										
		
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbFirstIV);
		calculateDiscount.Add(sdbSecI);
		calculateDiscount.Add(sdbSecII);
		calculateDiscount.Add(sdbSecIII);
		calculateDiscount.Add(sdbSecIV);
		assertEquals(380.0, calculateDiscount.getTotalPrice());

	}
	
	@Test
	public void buyingThreeCpyOfTwoDifftBookWithTwoCopsOfoneBook() {

		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstIII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecIII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();

		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbSecI);
		calculateDiscount.Add(sdbSecII);
		calculateDiscount.Add(sdbSecIII);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbThirdII);
		assertEquals(365.00, calculateDiscount.getTotalPrice());
	}
	
	@Test
	public void buyingTwoCopiesOfTwoDiffBookAndThreeCopyOfOneBookAndOneCpyofOthrBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbFirstII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();

		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbSecondII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();

		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbThirdIII = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();

		SoftwareDevelopmentBook sdbFourthI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIVBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbSecondII);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbThirdII);
		calculateDiscount.Add(sdbThirdIII);
		calculateDiscount.Add(sdbFourthI);
		assertEquals(345.00, calculateDiscount.getTotalPrice());

	}

}
