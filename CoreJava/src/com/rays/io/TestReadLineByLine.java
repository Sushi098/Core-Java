package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestReadLineByLine {

		public static void main(String[] args) throws Exception {

			FileReader file = new FileReader("C:\\Users\\vivek\\OneDrive\\Desktop\\IO\\hello.txt");

			BufferedReader in = new BufferedReader(file);

			String line = in.readLine();

			while (line != null) {

				System.out.println(line);
				
				line = in.readLine();

			}

			in.close();

			file.close();

		}

	}


