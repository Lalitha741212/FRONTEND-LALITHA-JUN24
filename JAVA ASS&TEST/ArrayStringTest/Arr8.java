package ArrayStringTest;

import java.util.Scanner;

//. Write a program to calculate the average value of array elements
public class Arr8 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the length of array:");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
		System.out.printf("elements a[%d]",i);
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		sum=sum+a[i];
		double avg=sum/n;
		System.out.println("sum of all elements:"+sum);
		System.out.println("avg of all elements:"+avg);
	}
}
}
