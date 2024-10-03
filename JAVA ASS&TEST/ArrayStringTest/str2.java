package ArrayStringTest;
//str equal or not
import java.util.Scanner;

public class str2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isEqual = str1.equals(str2);
        System.out.println("Are the two strings equal? " + isEqual);
    }
}
/*Enter the first string: sri
Enter the second string: sri
Are the two strings equal? true*/