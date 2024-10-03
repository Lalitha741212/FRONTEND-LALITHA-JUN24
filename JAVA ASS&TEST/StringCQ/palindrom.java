package StringCQ;
import java.util.Scanner;
public class palindrom {
//srating and ending seriess are same	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the string:");
	        String s = sc.nextLine();
	    
	        s = s.toLowerCase();

	        boolean isPalindrome = true;
	        int length = s.length();
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (s.charAt(i) != s.charAt(length - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	      
	        if (isPalindrome) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	    }
	}

/*Enter the string:
srirs
Palindrome

*Enter the string:
hello
Not a palindrome*/
