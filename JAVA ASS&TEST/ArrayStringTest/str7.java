package ArrayStringTest;

import java.util.Scanner;

//repeting every char
public class str7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append(ch).append(ch);
        }

        System.out.println("Modified string: " + result.toString());
    }
}
/*Enter a string: bhanu
Modified string: bbhhaannuu*/