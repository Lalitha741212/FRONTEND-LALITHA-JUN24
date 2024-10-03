package StringCQ;
import java.util.Scanner;
public class mail {
//email validation	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an email address: ");
	        String email = sc.nextLine();
	        boolean isValid = isValidEmail(email);
	        
	        System.out.println(email);
	        if (isValid) {
	            System.out.println("The email address is valid.");
	        } else {
	            System.out.println("The email address is not valid.");
	        }
	    }
	    public static boolean isValidEmail(String email) {
	        if (email.contains("@")) {
	            String[] parts = email.split("@");
	            if (parts.length == 2) {
	                String domain = parts[1];
	                return domain.endsWith(".com") || domain.endsWith(".in") || 
	                       domain.endsWith(".net") || domain.endsWith(".org");
	            }
	        }
	        return false;
	    }
	}

/*Enter an email address: bhanu@gamil.com
bhanu@gamil.com
The email address is valid.*/
