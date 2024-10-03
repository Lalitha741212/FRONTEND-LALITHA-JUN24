package StringCQ;

import java.util.Scanner;

public class replasubstr {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to replace: ");
        String toReplace = scanner.nextLine();
        System.out.print("Enter the new substring: ");
        String replacement = scanner.nextLine();

        String result = mainString.replace(toReplace, replacement);
        System.out.println("Modified string: " + result);
}
}
/*Enter the main string: srinivasa
Enter the substring to replace: nivasa
Enter the new substring: vekatesha
Modified string: srivekatesha*/