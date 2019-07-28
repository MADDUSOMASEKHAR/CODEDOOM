package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial fc= new Factorial();
		assertEquals(120,fc.calculateFactorial(5));
	}

}
