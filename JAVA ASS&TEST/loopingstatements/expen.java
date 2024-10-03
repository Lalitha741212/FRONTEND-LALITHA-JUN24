import java.util.Scanner;
//finding the total expensive
public class expen {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a quantity perchesd:");
	int qty=sc.nextInt();
	System.out.println("Enter a amount per item");
	float amt=sc.nextFloat();
	float exp;
	if(qty>100) {
		exp=qty*amt;
		exp=exp -(exp*0.1f);
		
	}
	else {
		exp=qty+amt;
	}
	System.out.println("total expensive is:"+exp);
}
}
/*out put
 * enter a quantity perchesd:
56
Enter a amount per item
96
total expensive is:152.0*/
