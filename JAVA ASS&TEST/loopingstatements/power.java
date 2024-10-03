import java.util.Scanner;
//power of number
public class power {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        
		System.out.print("Enter the Base Number :");
		int base = sc.nextInt();        
		System.out.print("Enter the Power Number :");
		int power = sc.nextInt();
		int result = 1;
		for(int i = 1; i <= power; i++)
		{
			result *= base;
		}
 
		System.out.println("Result: "+ result);
	}
}
/*out put
Enter the Base Number :5
Enter the Power Number :9
Result: 1953125*/