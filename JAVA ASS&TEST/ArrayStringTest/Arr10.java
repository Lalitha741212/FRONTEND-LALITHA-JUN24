package ArrayStringTest;

public class Arr10 {
public static void main(String[] args) {
	int arr1[]= {1,4,6,5,8,9};
	int arr2[]= {9,7,5,3,1};
	int mergeleg=arr1.length+arr2.length;
	int arr3[]=new int[mergeleg];
	System.out.println("First array elements:");
    for (int el : arr1) {
        System.out.print(el + " ");
    }
    System.out.println(); 
    
	for(int i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	
	}
	System.out.println("second array elements:");
    for (int el : arr2) {
        System.out.print(el + " ");
    }
    System.out.println();  
    
	for(int i=0;i<arr2.length;i++) {
		arr3[i+arr1.length]=arr2[i];
	} 
	System.out.println("merged array elements");
	for(int el:arr3) {
		System.out.print(el+" ");
	}
}
}
