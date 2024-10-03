package conditionalStatements;

import java.util.Scanner;

public class alphornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("This is a Alphabet");
		} else {
			System.out.println("This is a Not Alphabet");
		}
	}
}
/*Enter the Character :s
This is a Alphabet

Enter the Character :@
This is a Not Alphabet
*/