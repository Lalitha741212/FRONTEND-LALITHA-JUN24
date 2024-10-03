package StringCQ;

import java.util.Scanner;

public class captile {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1))
	                           .append(" ");
	            }
	        }
	        System.out.println("Capitalized sentence: " + capitalized.toString().trim());
	    }
}
/*Enter a sentence: kbbejgreiCGYFU
Capitalized sentence: KbbejgreiCGYFU*/