package summation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumofNumbersTest {

	@Test
	void test() {
		SumofNumbers sum= new SumofNumbers();
		int actual1 = 30, actual2 = 24;
		int expected1= sum.SumofEvenNumbers(2, 10), expected2= sum.SumofOddNumbers(2, 10);
		assertEquals(actual1,expected1);
		assertEquals(actual2,expected2);
	}

}
