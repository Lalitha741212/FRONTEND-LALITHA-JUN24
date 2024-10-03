package ArrayStringTest;

import java.util.Scanner;

//Write a program to array elements print all Positive number
public class Arr7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit of array:");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++) {
		System.out.printf("elements a[%d]",i);
		a[i]=sc.nextInt();
	}
	for(int p:a) {
		if(p>0) {
			sum=sum+p;
		}

	}
	System.out.println("sum of positive numbers:"+sum);
}
}
