package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class helloworldTest {

	@Test
	void test() {
		helloworld hello= new helloworld();
		String result= hello.getMessage();
		assertEquals("helloworld",result);
	}

}
