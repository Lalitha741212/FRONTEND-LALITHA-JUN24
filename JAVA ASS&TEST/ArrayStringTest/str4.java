package ArrayStringTest;

import java.util.Scanner;

//str concat
public class str4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatenated = str1 + str2;
        System.out.println("Concatenated string: " + concatenated);
    }
}
/*Enter the first string: srinivasa
Enter the second string: balaji
Concatenated string: srinivasabalaji*/