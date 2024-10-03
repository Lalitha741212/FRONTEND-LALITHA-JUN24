import java.util.Scanner;
//natural number
public class natural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s = sc.nextInt();
		System.out.print("Enter The Ending Number : ");
		int e = sc.nextInt();
		while (s <= e) {
			System.out.println(s);
			s++;
		}
	}
}
/*out put
Enter The Starting Number : 5
Enter The Ending Number : 22
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
*/