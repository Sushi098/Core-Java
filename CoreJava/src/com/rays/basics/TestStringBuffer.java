package com.rays.basics;

public class TestStringBuffer {
	
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Kim");
		sb.append("TaeHyung");
		
		System.out.println("Length : " + sb.length ());
		
		System.out.println("Reverse : " +sb.reverse());

		
		System.out.println("Capacity : " + sb.capacity ());
		
		System.out.println("Char at : " +sb.charAt(1));
	
		System.out.println("Replace : " +sb.replace(0,4, "im"));
		

		
	}

}
