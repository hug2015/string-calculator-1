package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public static class CalculatorTest {

	@Test
	public static void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public static void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	/*@Test
	public static void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}*/
}