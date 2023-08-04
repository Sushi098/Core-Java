package com.rays.basics;

import java.util.Scanner;

public class Questionno14 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of N: ");
		
        int  n = scanner.nextInt();
        
        System.out.println("Avg of Consecutive  odd no. " + calculateOddAverage(n));
        
        System.out.println("Avg of Consecutive even no. " + calculateEvenAverage(n));
        
        scanner.close();
	}

	public static double calculateOddAverage(int n) {
		
		int sum = 0;
		int count = 0;
		int oddNumber = 1;
		
		while(count < n) {
			sum += oddNumber;
			oddNumber +=2;
			count++;
		}
		return(double)sum/n;
	}

	private static  double calculateEvenAverage(int n) {
		int sum = 0;
		int count = 0;
		int evenNumber = 2;
		
		while(count < n) {
			sum += evenNumber;
			evenNumber +=2;
			count++;
		}

		return(double)sum/n;
	}
}
      
        


