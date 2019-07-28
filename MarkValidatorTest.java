package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator mv= new MarkValidator();
		assertEquals(true,mv.isPass(91));
		assertEquals("Grade A",mv.markGrade(91));
	}

}
