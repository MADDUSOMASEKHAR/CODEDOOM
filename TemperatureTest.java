package temperature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temp= new Temperature();
		double actual=60;
		double alpha=temp.CelsiustoFahrenheit(actual);
		double expected=temp.FahrenheittoCelsius(alpha);
		assertEquals(actual,expected);
	}

}
