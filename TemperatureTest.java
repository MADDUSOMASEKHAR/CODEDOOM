package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temp= new Temperature();
		double a=temp.CelstoFar(60);
		double b=temp.FartoCels(a);
		assertEquals(b,60);
	}

}
