import java.util.Scanner;
// revers degits
public class Reverdigi {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  Digits:");
	int num=sc.nextInt();
	int a= num;
	int rev=0;
	int rem=0;
	while(num>0) {
		rem = num % 10;
		rev = rev * 10 + rem;
		num /= 10;
	}
	System.out.println("Given Digits :" + a);
	System.out.println("reverse degits:"+rev);
	}

}
/* out pput
Enter a  Digits:
535565
Given Digits :535565
reverse degits:565535*/