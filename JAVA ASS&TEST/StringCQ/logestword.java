package StringCQ;

import java.util.Scanner;

public class logestword {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        String longestWord = "";

	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }
	        System.out.println("Longest word: " + longestWord);
	    }
}
/*Enter a sentence: jai sri ram jai hanumann
Longest word: hanumann*/