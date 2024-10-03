package ArrayStringTest;
//Write a program in to find the sum of all elements of the array

import java.util.Scanner;

public class Arr9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array limit:");
	int n=sc.nextInt();
	int ar[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++) {
		System.out.printf("Elements ar[%d]",i);
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		sum=sum+ar[i];
	}
	System.out.println("sum of all array elements:"+sum);
}
}
