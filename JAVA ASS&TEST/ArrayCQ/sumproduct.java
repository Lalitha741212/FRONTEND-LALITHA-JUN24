package ArrayCQ;
import java.util.Scanner;
public class sumproduct {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the length of numbers:");
	        int N = sc.nextInt();
	        if (N <= 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        System.out.println("Enter numbers:");
	        int[] A = new int[N];
	        int sum = 0;
	        int product = 1;
	        for (int i = 0; i < N; i++) {
	            A[i] = sc.nextInt();
	            sum += A[i];
	            product *= A[i];
	        }
	        
	        if (sum % 2 == 0) {
	            System.out.println("sum of numbers is devisble by 2: "+sum);
	        } else {
	            System.out.println("product of numbers is not devisible by 2:"+product);
	        }
	    }
	}
/*Enter the length of numbers:
4
Enter numbers:
1
7
5
3
sum of numbers is devisble by 2: 16*/

