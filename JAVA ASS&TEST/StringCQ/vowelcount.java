package StringCQ;
import java.util.Scanner;
public class vowelcount {
	//vowel count
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String s = sc.nextLine();
	        s = s.toLowerCase();
	        int vowelCount = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            }
	        }
	        System.out.println(vowelCount);
	    }
	}

/*Enter the string:
lalitha
3*/
