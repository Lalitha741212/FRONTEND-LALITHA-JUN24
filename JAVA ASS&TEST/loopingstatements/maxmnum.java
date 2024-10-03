import java.util.Scanner;
// max of three number
public class maxmnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a first number:");
		int a=sc.nextInt();
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		System.out.println("Enter the third number:");
		int c=sc.nextInt();
		 if(a>b && a>c){
			 System.out.println("first number"+a+" is max number");
		 }
		 else if(b>a && b>c) {
			 System.out.println("Second number"+b+" is max number:");
			 
		 }
		 else {
			 System.out.println("Third number"+c+" is max");
		 }
	}

}
/*out put
 * enter a first number:
10
Enter a second number:
50
Enter the third number:
99
Third number99 is max*/
