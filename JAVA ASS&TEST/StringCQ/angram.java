package StringCQ;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class angram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        char[] charArray1 = str1.replaceAll("\\s+", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s+", "").toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
/*Enter first string: sri
Enter second string: nivas
The strings are not anagrams.*/