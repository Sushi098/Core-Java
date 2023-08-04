package com.rays.io;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

		public static void main(String[] args) throws Exception {

			FileReader file = new FileReader("C:\\\\Users\\\\vivek\\\\OneDrive\\\\Desktop\\\\IO\\\\hello.txt");

			Scanner sc = new Scanner(file);

			while (sc.hasNext()) {

				String line = sc.nextLine();

				System.out.println(line);

			}
			
			sc.close();
			file.close();

		}

	}



