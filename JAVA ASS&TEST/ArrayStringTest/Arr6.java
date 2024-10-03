package ArrayStringTest;

import java.util.Scanner;

//Write a program to Print Unique Elements in Array
public class Arr6 {
	static void Uniq(int a[], int n) {
		for (int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++)
				if(a[i]==a[j])
					break;
				if(i==j)
					System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("entr arry limit:");
		int num=sc.nextInt();
		int a[]=new int[num];
	for(int i=0;i<num;i++) {
		System.out.printf("Elements of a[%d]",i);
		a[i]=sc.nextInt();
	}
	System.out.println("\n arry unique elements\n");
	
	Uniq(a,num);
	}

}
