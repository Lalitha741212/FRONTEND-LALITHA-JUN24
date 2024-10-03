import java.util.Scanner;
//positive or negtive
public class posineg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	if(num>0) {
		System.out.println("given number is positive:"+num);
	}
	else if(num==0) {
		System.out.println("number is Zero");
	}
	else {
		System.out.println("Given number is negtive:"+num);
	}
}
}
/* out put
Enter the number:
10
given number is positive:10

Enter the number:
-77
Given number is negtive:-77

Enter the number:
0
number is Zero
*/