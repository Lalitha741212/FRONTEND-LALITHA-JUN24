package conditionalStatements;

import java.util.Scanner;

public class Triangleall {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		if ((s1 + s2) > s3)
			if ((s2 + s3) > s1)
				if ((s1 + s3) > s2)
					System.out.println("Triangle is valid.");
				else
					System.out.println("Triangle is not valid.");
			else
				System.out.println("Triangle is not valid.");
		else
			System.out.println("Triangle is not valid.");
	}

}
/*Enter Three Sides of Triangle :
15
21
45
Triangle is not valid.*/
