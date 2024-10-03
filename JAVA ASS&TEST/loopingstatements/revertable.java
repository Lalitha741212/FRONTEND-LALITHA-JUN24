import java.util.Scanner;
//reverse table
public class revertable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s = sc.nextInt();
		System.out.print("Enter The Ending Number : ");
		int e = sc.nextInt();
		System.out.print("Enter The Tables Number : ");
		int t = sc.nextInt();
		while (s >= e) {
			System.out.println(s + " * " + t + " = " + (s * t));
			s--;
		}
	}
}
/*out put
Enter The Starting Number : 10
Enter The Ending Number : 1
Enter The Tables Number : 5
10 * 5 = 50
9 * 5 = 45
8 * 5 = 40
7 * 5 = 35
6 * 5 = 30
5 * 5 = 25
4 * 5 = 20
3 * 5 = 15
2 * 5 = 10
1 * 5 = 5*/