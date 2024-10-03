import java.util.Scanner;
//sum of odd numbers
public class SumOfOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of the numbers:");
	int n=sc.nextInt();
	int sum=0;
	for( int i=1;i<=n;i=i+2) {
		//if(i%2==1) {
			sum=sum+i;
		//}
		
	}
	System.out.print("sum of odd numbers:"+sum);
			
}
}
// out put
/*Enter the length of the numbers:10
sum of odd numbers:25*/