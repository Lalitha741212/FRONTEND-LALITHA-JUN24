package conditionalStatements;

import java.util.Scanner;

public class MonthName {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Month number:");
	int num=sc.nextInt();
	if(num==1){
		System.out.println("Month :"+num+" name is Jan");
	}
	else if(num==2){
		System.out.println("Month:"+num+" name is Feb");
	}
	else if(num==3){
		System.out.println("Month:"+num+" name is Mar");
	}
	else if(num==4){
		System.out.println("Month:"+num+" name is Apr");
	}
	else if(num==5){
		System.out.println("Month:"+num+" name is May");
	}
	else if(num==6){
		System.out.println("Month:"+num+" name is Jun");
	}
	else if(num==7){
		System.out.println("Month:"+num+" name is Jul");
	}
	else if(num==8){
		System.out.println("Month:"+num+" name is Aug");
	}
	else if(num==9){
		System.out.println("Month:"+num+" name is Sept");
	}
	else if(num==10){
		System.out.println("Month:"+num+" name is Oct");
	}
	else if(num==11){
		System.out.println("Month:"+num+" name is Nov");
	}else if(num==12){
		System.out.println("Month:"+num+" name is Dec");
	}
	else {
		System.out.println("please Enter valid month number");
	}
}
}
/*Enter the Month number:
12
Month:12 name is Dec*/
