package temperature;

public class Temperature {
	public double CelsiustoFahrenheit(double celsius)
	{
		double result= (celsius*1.8)+32;
		return result;
	}
	public double FahrenheittoCelsius(double fahrenheit)
	{
		double result= ((fahrenheit-32)*5/9);
		return result;
	}
}
