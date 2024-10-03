package ArrayStringTest;

import java.util.Scanner;

//max b/w two str
public class str6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String max = str1.compareTo(str2) > 0 ? str1 : str2;
        System.out.println("The maximum string is: " + max);
    }
}
/*Enter the first string: lalitha
Enter the second string: lali
The maximum string is: lalitha*/