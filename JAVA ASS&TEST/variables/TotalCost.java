package variables;

import java.util.Scanner;

public class TotalCost {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = sc.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        double totalCost = price * quantity;
      
        System.out.println("Total cost: $" + totalCost);
    }
}
/*Enter the price of the item: 512
Enter the quantity of the item: 900
Total cost: $460800.0*/