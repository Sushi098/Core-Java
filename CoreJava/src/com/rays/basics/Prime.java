package com.rays.basics;

public class Prime {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {

				b++;
			}
		}

		if (b == 0) {

			System.out.println(" Our No. IS Prime No. ");

		} else {
			System.out.println("NO. is not Prime no.");
		}
	}

}
