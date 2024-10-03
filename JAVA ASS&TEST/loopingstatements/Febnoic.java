import java.util.Scanner;
//febnoic series
public class Febnoic {
public static void main(String[] args) {
	Scanner feb=new Scanner(System.in);
	System.out.print("Enter the  length Fibonaci series:");
	 int n= feb.nextInt();
	 
	 int[] num =new int[n];
	 num[0]=0;
	 num[1]=1;
	 
	 for(int i=2; i<n;i++) {
		 num[i]=num[i-1]+num[i-2];//sum of last two numbers
		 
	 }
	 System.out.print("Fibonacic series");
	 for(int i=0;i<n;i++) {
		 System.out.println(num[i]+" ");
	 }
	}
}
/*out put
 * Enter the  length Fibonaci series:5
Fibonacic series0 
1 
1 
2 
3 */
