package marks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator mark= new MarkValidator();
		assertEquals(true,mark.isPass(91));
		assertEquals("Grade A",mark.markGrade(91));
	}

}
