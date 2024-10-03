package StringCQ;
import java.util.Scanner;
//revers string
public class revers {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        String reversed = new StringBuilder(input).reverse().toString();
	        System.out.println("Reversed string: " + reversed);
	    }
	}

/*Enter a string: srinivasa
Reversed string: asavinirs*/
