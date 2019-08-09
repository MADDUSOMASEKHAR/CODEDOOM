package markswitchcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {

	@Test
	void test() {
		MarkValidatorSwitchCase marks= new MarkValidatorSwitchCase();
		assertEquals(true,marks.isPass(65));
		assertEquals("Grade C",marks.markGrade(65));
	}

}
