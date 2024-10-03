package variables;

import java.util.Scanner;

public class Areacircle {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        final double PI = 3.14159;
	        
	      
	        System.out.print("Enter the radius of the circle: ");
	        double radius = sc.nextDouble();
	        
	    
	        double area = PI * radius * radius;
	        
	      
	        System.out.println("Area of the circle: " + area);
	    }
}
/*Enter the radius of the circle: 5.4
Area of the circle: 91.60876440000001*/