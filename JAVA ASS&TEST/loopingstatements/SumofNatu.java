import java.util.Scanner;
// sum of natural number
public class SumofNatu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a length of natural numbers:");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println("sum of natural number you enter:"+sum);
}
}
//out put

/*Enter a length of natural numbers:
20
sum of natural number you enter:210*/
