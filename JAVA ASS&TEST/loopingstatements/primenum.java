import java.util.Scanner;
//prime numbers
public class primenum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        
		System.out.print("Enter the Number :");
		int num = sc.nextInt(); 
		int i, count = 0;
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");
	}
}
/*out put
 * Enter the Number :5
This is a Prime Number.

Enter the Number :4
This is not a Prime Number.*/

