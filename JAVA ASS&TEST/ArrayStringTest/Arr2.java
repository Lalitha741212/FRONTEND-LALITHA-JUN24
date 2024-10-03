package ArrayStringTest;
//Write a program to array elements print all Even number
public class Arr2 {
public static void main(String[] args) {
	int arr[]={1,2,3,56,765,9809,843,5198989,900,71,88};
	System.out.println("All even numbers are:");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
}
}
