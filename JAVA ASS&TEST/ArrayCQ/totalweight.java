package ArrayCQ;
import java.util.Scanner;
//total wights
public class totalweight {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the length of goods:");
	        int n = sc.nextInt();
	      
	        if (n <= 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	      System.out.println("Enter the goods values:");
	        int[] weights = new int[n];
	        int totalWeight = 0;
	        
	        for (int i = 0; i < n; i++) {
	            weights[i] = sc.nextInt();
	           
	            totalWeight += weights[i];
	        }
	        
	     
	        System.out.println("Total wight:"+totalWeight);
	    }
	}

/*Enter the length of goods:
5
Enter the goods values:
15
84
32
25
23
Total wight:179*/
