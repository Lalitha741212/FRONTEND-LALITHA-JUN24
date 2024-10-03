package conditionalStatements;

import java.util.Scanner;

public class MaxOfTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("first number  "+a+"  is the max number:");
			
		}
		else if(b>a) {
			System.out.println("Second number "+b+" is max number");
		}
		else {
			System.out.println("Both numbers are equal");
		}
	}

}
/*enter the first number:
12
Enter the second number:
22
Second number 22 is max number*/
