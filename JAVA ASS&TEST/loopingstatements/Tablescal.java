
import java.util.Scanner;
public class Tablescal {
	

	//Write a program to print tables

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter The Starting Number : ");
			int start = sc.nextInt();
			System.out.print("Enter The Ending Number : ");
			int end = sc.nextInt();
			System.out.print("Enter The Tables Number : ");
			int tableno = sc.nextInt();
			while (start <= end) {  
				System.out.println(tableno + " * " + start + " = " + (tableno * start));
				start++;
			}
		}
	}
// out put
/*Enter The Starting Number : 1
Enter The Ending Number : 10
Enter The Tables Number : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70
*/
