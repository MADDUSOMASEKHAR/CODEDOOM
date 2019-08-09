package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial factorial= new Factorial();
		double actual = 120;
		double result= factorial.calculateFactorial(5);
		assertEquals(actual, result);
	}

}
