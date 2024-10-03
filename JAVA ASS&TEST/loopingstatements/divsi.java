import java.util.Scanner;
// Divisible by 5   && 3
public class divsi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if(a%5 == 0 && a%3 == 0 ) {
			System.out.println("number  "+a+"  is devisiable by 5 & 3");
		}
		else if(a%5==0) {
			System.out.println("number  "+a+"  is deviable by 5");
		}
		else if(a%3==0) {
			System.out.println("number  "+a+"  is deviable by 3");
		}
		else {
			System.out.println("number  "+a+"  Not deviable by 5 & 3");
		}
	}

}
/*
Enter a number
15
number  15  is devisiable by 5 & 3*/