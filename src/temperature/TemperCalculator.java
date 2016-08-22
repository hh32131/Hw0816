package temperature;

public class TemperCalculator {
	
	public double celsius(int f){
		
		double result = (f-32) / 1.8;
		return result;
		
	}
	public double fahrenheit(int c){
		
		double result = c * 1.8 +32;
		return result;
	}

}
