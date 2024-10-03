package ArrayCQ;
import java.util.Scanner;
//frequenc
public class frequesdesti {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	       System.out.println("Enter the length of numbers:");
	        int n = sc.nextInt();
	        
	       System.out.println();
	        if (n <= 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        
	       
	        int[] frequency = new int[26]; 
	       
	        for (int i = 0; i < n; i++) {
	            int number = sc.nextInt();
	            if (number < 1 || number > 25) {
	                System.out.println("Invalid Input");
	                return;
	            }
	            frequency[number]++;
	        }
	        
	     
	        for (int i = 1; i <= 25; i++) {
	            if (frequency[i] > 0) {
	                System.out.println(i + " occurs " + frequency[i] + " time(s)");
	            }
	        }
	    }
	}

/*Enter the length of numbers:
5
Enter the elements:
5
2
2
6
7
2 occurs 2 time(s)
5 occurs 1 time(s)
6 occurs 1 time(s)
7 occurs 1 time(s)*/
