package temperature;

public class Temperature {
	public double CelsiustoFahrenheit(double celsius)
	{
		if(celsius>=0 && celsius<=100)
		{
			double result= (celsius*1.8)+32;
			return result;
		}
		else 
		return -1;
	}
	public double FahrenheittoCelsius(double fahrenheit)
	{
		if(fahrenheit>=32 && fahrenheit<=212)
		{
			double result= ((fahrenheit-32)*5/9);
			return result;
		}
		else
		return -1;
	}
}
