import java.util.Scanner;
//traingle
public class condit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three sides of triangle:");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		if(side1==side2 && side2==side3 ) {
			System.out.println("Equalater Traiangle");}
		else if(side1==side2 || side2==side3|| side1==side3) {
			System.out.println("Issolated triangle");
		}
		else {
			System.out.println("Scaler traingle");
		}
		}

}
/*Enter the three sides of triangle:
5
8
5
Issolated triangle*/