
/* Jasdeep Sandhu - 121190151 */

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("- Enter Triangle Points -");

		System.out.print("x1: ");
		int x1 = input.nextInt();
		System.out.print("y1: ");
		int y1 = input.nextInt();

		System.out.print("x2: ");
		int x2 = input.nextInt();
		System.out.print("y2: ");
		int y2 = input.nextInt();

		System.out.print("x3: ");
		int x3 = input.nextInt();
		System.out.print("y3: ");
		int y3 = input.nextInt();

		double A = x1 * (y2 - y3);
		double B = x2 * (y3 - y1);
		double C = x3 * (y1 - y2);

		double area = (A + B + C) / 2;

		System.out.print("The result is: " + area * -1);

		input.close();

	}

}
