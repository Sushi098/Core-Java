package com.rays.io;

import java.io.FileWriter;

public class TestFileWriter {

		public static void main(String[] args) throws Exception {
			
			FileWriter file = new FileWriter("C:\\Users\\vivek\\OneDrive\\Desktop\\IO\\hello.txt");
			
			System.out.println();
			file.write("BTS\n");
			
			file.write("Kim");
			System.out.println();
			file.write("Taehyung");
			
			file.close();

		}

	}



