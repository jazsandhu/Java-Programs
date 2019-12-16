/*Jasdeep Sandhu - 121190151*/

package Assignment1;

public class TemperatureConverter {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter Value in Farenheit: ");
		int farenheit = input.nextInt();

		System.out.print("Degrees in Celcius: " + Math.round(((farenheit - 32) * 0.555556) * 10) / 10.0);
	}

}
