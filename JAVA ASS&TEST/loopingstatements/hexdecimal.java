import java.util.Scanner;
//hex to decimal
public class hexdecimal {
	public static void main(String[] args) 
	{ 
 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hexadecimal Number : ");
		String hex = sc.nextLine(); 
		System.out.println("Hexadecimal Number :"+hex); 
		System.out.println("Decimal Number :"+hexa_to_decimal(hex)); 
	} 
	static int hexa_to_decimal(String hex_num) 
	{ 
		int len = hex_num.length(); 
		int base = 1; 
		int dec_val = 0; 
 
		for (int i = len - 1; i >= 0; i--) {
			if (hex_num.charAt(i) >= '0'
				&& hex_num.charAt(i) <= '9') { 
				dec_val += (hex_num.charAt(i) - 48) * base;
				base = base * 16; 
			} 
			else if (hex_num.charAt(i) >= 'A'
					&& hex_num.charAt(i) <= 'F') { 
				dec_val += (hex_num.charAt(i) - 55) * base; 
				base = base * 16; 
			} 
		} 
		return dec_val; 
	}
}
/*output
 * Enter Hexadecimal Number : 6879jjhjsfdd
Hexadecimal Number :6879jjhjsfdd
Decimal Number :26745*/
