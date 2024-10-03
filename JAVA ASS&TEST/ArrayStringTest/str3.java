package ArrayStringTest;

import java.util.Scanner;
//unioncodepoint
public class str3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        int codePointCount = str.codePointCount(start, end);
        System.out.println("Number of Unicode code points: " + codePointCount);
    }
}
/*Enter a string: lali
Enter the start index: 1
Enter the end index: 3
Number of Unicode code points: 2*/