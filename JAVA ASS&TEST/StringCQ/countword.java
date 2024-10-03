package StringCQ;

import java.util.Scanner;

public class countword {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        String[] words = input.trim().split("\\s+");
	        System.out.println("Number of words: " + words.length);
	    }
}
/*Enter a string: lalitha
Number of words: 1*/