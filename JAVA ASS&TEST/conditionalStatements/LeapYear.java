package conditionalStatements;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner year=new Scanner(System.in);
	System.out.println("Enter the Year:");
	int yeear = year.nextInt();
	if(yeear%4==0) {
		System.out.println(" The year "+yeear+" is leap year");
	}
	else if(yeear%4==0 && yeear%400==0 || yeear%100!=0) {
		System.out.println("The year "+yeear+" is leap year");
	}
	else {
		System.out.println("Enter  year "+yeear+"  is Not a leap year");
	}
}
}
/*Enter the Year:
2003
The year 2003 is leap year*/