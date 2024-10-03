import java.util.Scanner;
// gross salary
public class Grosal {
public static void main(String[] args) {
	Scanner sal=new Scanner(System.in);
	System.out.println("Enter the base salary:");
	int bs=sal.nextInt();
	float hra,da,tot;
	if(bs<=10000) {
		hra = bs*0.2f;
		da= bs*0.8f;
	}
	else if(bs <=20000) {
		hra = bs*0.25f;
		da=bs*0.9f;
	}
	else {
		hra = bs *0.3f;
		da=bs*0.95f;
	}
	System.out.println("Gross salary:"+(bs+hra+da));
}
}
/*out put
Enter the base salary:
450000
Gross salary:1012500.0*/