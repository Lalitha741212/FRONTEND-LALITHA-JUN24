import java.util.Scanner;
//sum of even numbers
public class EvenNumSum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of the numbers:");
	int num=sc.nextInt();
	int sum=0;
	for(int i=0;i<=num;i=i+2) {
		sum=sum+i;
	}
	System.out.println("sum of all even numbers:"+sum);
}
}
/*out put
Enter the length of the numbers:
7
sum of all even numbers:12*/