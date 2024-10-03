package conditionalStatements;

import java.util.Scanner;

public class profitloss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cost Price :");
		int cost = sc.nextInt();
		System.out.println("Enter The Selling Price :");
		int selling = sc.nextInt();
		int profit, loss;
		if (selling > cost) {
			profit = selling - cost;
			System.out.println("Profit : " + profit);
		} else if (selling < cost) {
			loss = cost - selling;
			System.out.println("Loss : " + loss);
		} else {
			System.out.println("No Profit No Loss");
		}
	}
}
/*Enter The Cost Price :
250
Enter The Selling Price :
350
Profit : 100*/