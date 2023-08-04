package com.rays.basics;

public class FindSecondLargest {

	public static void main(String[] args) {

		int [] arr = {11, 02, 67, 87, 287};
 
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > 0) {
				
				a = b ;
				b = arr[i];
			}
			
			if (arr[i]< b && arr[i]> a) {
				a = arr[i];
				
			}
		}
		
      System.out.println(a);
	}

}
