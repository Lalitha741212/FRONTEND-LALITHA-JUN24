package StringCQ;

import java.util.Scanner;

public class removewhite {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = input.replaceAll("\\s+", "");
        System.out.println("String without whitespaces: " + result);
    }
}
/*Enter a string: jai hanuman 
String without whitespaces: jaihanuman*/