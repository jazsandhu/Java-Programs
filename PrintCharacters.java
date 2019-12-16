/*Jasdeep Sandhu - 121190151*/

package Assignment1;

public class PrintCharacters {

	public static void main(String[] args) {
		char char1 = '1', char2 = 'Z';
		System.out.println("Result:");
		printChars(char1, char2, 10);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int linecount = 1;
		for (char index = ch1; index <= ch2; index++, ++linecount) {
			System.out.print(index + " ");
			if (linecount == numberPerLine) {
				System.out.print("\n");
				linecount = 0;
			}
		}
	}

}
