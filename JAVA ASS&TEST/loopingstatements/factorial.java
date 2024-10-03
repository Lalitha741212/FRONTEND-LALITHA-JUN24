import java.util.Scanner;
//factorial
public class factorial {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Factorial Number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}        
		System.out.println("Factorial: "+ fact);		
	}
}
/*out put
Enter Factorial Number : 5
Factorial: 120*/