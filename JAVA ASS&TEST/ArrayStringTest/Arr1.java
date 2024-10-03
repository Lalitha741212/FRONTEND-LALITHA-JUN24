package ArrayStringTest;
//Write a program to copy the elements of one array into another array
public class Arr1 {
public static void main(String[] args) {
	int arr1[]={1,2,3,4,8,99,785,788};
	int arr2[]=new int [arr1.length];
	for(int i=0;i < arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	System.out.println("arr1 elements:");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("arr2 elemnts:");
	for(int i=0;i < arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}
}
}

