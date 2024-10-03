package ArrayCQ;
import java.util.Scanner;
public class YoungOld {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter numbr of passangers length:");
	        int n = sc.nextInt();
	        
	        
	        if (n <= 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        
	        System.out.println("passanger ages:");
	        int[] ages = new int[n];
	        boolean invalidInput = false;
	        for (int i = 0; i < n; i++) {
	            ages[i] = sc.nextInt();
	            if (ages[i] < 0) {
	                invalidInput = true;
	                break;
	            }
	        }
	        
	        
	        if (invalidInput) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        
	       
	        int youngest = ages[0];
	        int oldest = ages[0];
	        
	        for (int i = 1; i < n; i++) {
	            if (ages[i] < youngest) {
	                youngest = ages[i];
	            }
	            if (ages[i] > oldest) {
	                oldest = ages[i];
	            }
	        }
	        
	        
	        System.out.println("yougestage:"+youngest + " " +"oldest age:" +oldest);
	    
	
	    }
}
/*Enter numbr of passangers length:
5
passanger ages:
89
56
20
81
45
yougestage:20 oldest age:89*/

