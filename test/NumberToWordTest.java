/**
 * 
 */

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.virt.intv.que.NumberToWord;

/**
 * @author SAI CHAND
 *
 */
public class NumberToWordTest {

	@Test
	public void convertsZero() {
		expectConversion(0, "zero");
	}

	@Test
	public void convertsSingleNumber() {
		expectConversion(1, "one");
		expectConversion(2, "two");
		expectConversion(3, "three");
		expectConversion(4, "four");
		expectConversion(5, "five");
		expectConversion(6, "six");
		expectConversion(7, "seven");
		expectConversion(8, "eight");
		expectConversion(9, "nine");
	}

	@Test
	public void convertsTenToNineteen() {
		expectConversion(10, "ten");
		expectConversion(11, "eleven");
		expectConversion(12, "twelve");
		expectConversion(13, "thirteen");
		expectConversion(14, "fourteen");
		expectConversion(15, "fifteen");
		expectConversion(16, "sixteen");
		expectConversion(17, "seventeen");
		expectConversion(18, "eighteen");
		expectConversion(19, "nineteen");
	}

	@Test
	public void convertsMultiplesOfTenUpToNinety() {
		expectConversion(20, "twenty");
		expectConversion(30, "thirty");
		expectConversion(40, "forty");
		expectConversion(50, "fifty");
		expectConversion(60, "sixty");
		expectConversion(70, "seventy");
		expectConversion(80, "eighty");
		expectConversion(90, "ninety");
	}

	@Test
	public void convertsTwoDigitNumbers() {
		expectConversion(42, "forty two");
		expectConversion(69, "sixty nine");
	}

	@Test
	public void convertsHundreds() {
		expectConversion(100, "one hundred");
		expectConversion(300, "three hundred");
	}

	@Test
	public void convertsThreeDigitNumbers() {
		expectConversion(123, "one hundred and twenty three");
		expectConversion(360, "three hundred and sixty");
		expectConversion(501, "five hundred and one");
	}

	@Test
	public void convertsThousands() {
		expectConversion(4000, "four thousand");
		expectConversion(9000, "nine thousand");
	}

	@Test
	public void convertsFourDigitNumbers() {
		expectConversion(1234, "one thousand two hundred and thirty four");
		expectConversion(9600, "nine thousand six hundred");
		expectConversion(2050, "two thousand and fifty");
		expectConversion(7008, "seven thousand and eight");
	}

	@Test
	public void convertsFiveAndSixDigitNumbers() {
		expectConversion(123456,
				"one hundred and twenty three thousand four hundred and fifty six");
		expectConversion(200003, "two hundred thousand and three");
		expectConversion(340000, "three hundred and forty thousand");
		expectConversion(400500, "four hundred thousand five hundred");
		expectConversion(600070, "six hundred thousand and seventy");
		expectConversion(800000, "eight hundred thousand");
		expectConversion(90000, "ninety thousand");
		expectConversion(10020, "ten thousand and twenty");
		expectConversion(12300, "twelve thousand three hundred");
	}

	private void expectConversion(final int number, final String expectedWords) {
		assertEquals(expectedWords, NumberToWord.convertNumberToWord(number));
	}

	/*@Test
	public void invokeMain() {
		String[] args = null;
		String initialString = "525";
	    InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
		NumberToWord.main(args);
		System.setIn(targetStream);
	}*/

}
