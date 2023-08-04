package com.rays.basics;

public class FindLargest {

	public static void main(String[] args) {
		
		
		int[] arr = {1,27,3,42,5};
			int a =0;
			for (int i = 0; i < arr.length; i++) {
				
				if(arr[i]>a) {
					a= arr[i];
				}
			}
			System.out.println(a);
			

	}

}
