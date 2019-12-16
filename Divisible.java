/*Jasdeep Sandhu - 121190151*/

package Assignment1;

public class Divisible {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter Integer Value: ");
		int value = input.nextInt();

		if (value % 5 == 0) {
			System.out.println(value + " is divisible by 5!");
		} else if (value % 6 == 0) {
			System.out.println(value + " is divisible by 6!");
		} else {
			System.out.println(value + " is not divisible by 5 or 6!");
		}

	}

}
