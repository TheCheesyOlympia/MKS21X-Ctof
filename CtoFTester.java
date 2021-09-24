/*there should be 2 parameters, the celsius value and the farenheit value,
and they should both be double in order to account for division and fraction numbers.
The function c to f sould return the value c times 9/5 + 32
The function f to c shoudl return the value f times 5/9 -32*/
public class CtoFTester
{
	public static void main(String[] args) {
	    //main
	    double c = 9.0;
	    double f = 85.0;
	    System.out.println("Your value for Celsius is: " + c);
	    System.out.println("Your value for Farenheit is: " + f);
	    System.out.println(c + " Celsius in Farenheit is: " + celsiusToFahrenheit(c));
	    System.out.println(f + " Farenheit in Celsius is: " + fahrenheitToCelsius(f));
	}
	//function 1
	public static double celsiusToFahrenheit(double c) {
	return (c / 5.0 * 9.0 + 32);
	}
	//function 2
	public static double fahrenheitToCelsius(double f) {
	return ((f - 32) / 9.0 * 5.0);
	}
}
