/*Jasdeep Sandhu - 121190151*/

package Assignment1;

public class LeapYears {

	public static void main(String[] args) {
		int index = 0;
		for (int year = 101; year <= 2500; year++) {
			if ((year % 4) == 0 && year % 100 != 0) {
				System.out.print(year + " ");
				index++;
			}
			if (year % 100 == 0 && year % 400 == 0) {
				System.out.print(year + " ");
				index++;
			}
			if (index >= 8) {
				System.out.print("\n");
				index = 0;
			}
		}

	}

}