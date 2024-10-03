package ArrayStringTest;

import java.util.Scanner;

public class str1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        boolean endsWith = str1.endsWith(str2);
	        System.out.println("Does the first string end with the second? " + endsWith);
	    }
}
/*Enter the first string: srinivasa
Enter the second string: vekatesha
Does the first string end with the second? false&*/