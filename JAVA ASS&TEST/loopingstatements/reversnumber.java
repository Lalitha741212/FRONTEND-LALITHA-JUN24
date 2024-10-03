import java.util.Scanner;
// reverse number starting and ending
public class reversnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s = sc.nextInt();
		System.out.print("Enter The Ending Number : ");
		int e = sc.nextInt();
		while (s >= e) {
			System.out.println(s);
			s--;
		}
	}
}
/*Enter The Starting Number : 10
Enter The Ending Number : 6
10
9
8
7
6*/