package StringCQ;

import java.util.Scanner;

public class substrfnd {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        int index = 0;
        int count = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        System.out.println("Occurrences of substring: " + count);
    }
}
/*Enter the main string: lalithabathula
Enter the substring to find: lali
Occurrences of substring: 1*/