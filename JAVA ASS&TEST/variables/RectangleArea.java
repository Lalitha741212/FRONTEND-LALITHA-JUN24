package variables;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}
/*Enter the length of the rectangle: 5.8
Enter the width of the rectangle: 4
Area of the rectangle: 23.2*/