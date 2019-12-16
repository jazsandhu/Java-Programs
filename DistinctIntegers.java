/*Jasdeep Sandhu - 121190151*/

package Assignment1;

public class DistinctIntegers {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("How many values will you enter?: ");
		int[] inputArray = new int[input.nextInt()];

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print("Enter value #" + (i + 1) + ": ");
			inputArray[i] = input.nextInt();
		}

		System.out.print("Distinct Values: ");
		int distinctValues = 0;
		for (int i = 0; i < inputArray.length; i++) {
			boolean valid = true;
			for (int check = (i + 1); check < inputArray.length; check++) {
				if (inputArray[i] == inputArray[check]) {
					valid = false;
				}
			}
			if (valid) {
				distinctValues++;
				System.out.print(inputArray[i] + " ");
			}
		}
		System.out.print("\nNumber of distinct values: " + distinctValues);

	}

}
