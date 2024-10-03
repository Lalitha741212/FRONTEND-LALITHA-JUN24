import java.util.Scanner;
//vowel or Consonent
public class ovecons {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a Character:");
	char ch = sc.next().charAt(0);
	if(ch == 'a' || ch== 'e' || ch=='i' || ch=='o'||ch=='u' ) {
		System.out.println("This is vowel");
	}
	else {
		System.out.println("this is consonent");
	}
	
}
}
/*out put
 
enter a Character
a
This is vowel

enter a Character:
b
this is consonent

*/