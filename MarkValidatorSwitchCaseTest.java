package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {

	@Test
	void test() {
		MarkValidatorSwitchCase msc= new MarkValidatorSwitchCase();
		assertEquals(true,msc.isPass(65));
		assertEquals("Grade C",msc.markGrade(65));
	}

}
