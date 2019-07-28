package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumofNumbersTest {

	@Test
	void test() {
		SumofNumbers sum= new SumofNumbers();
		assertEquals(30,sum.SumofEven(2, 10));
		assertEquals(24,sum.SumofOdd(2, 10));
	}

}
