package ArrayStringTest;

import java.util.Scanner;

//upper lower count
public class str5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int uppercase = 0, lowercase = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }

        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
    }
}
/*Enter a string: Jai Hanuman Jai SRI RAM
Uppercase letters: 9
Lowercase letters: 10*/
