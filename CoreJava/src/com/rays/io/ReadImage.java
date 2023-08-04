package com.rays.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImage {

   public static class TestReadImage {

		public static void main(String[] args) throws Exception{
			
		

			FileInputStream in = new FileInputStream("C:\\Users\\vivek\\OneDrive\\Desktop\\Logo.jpg.jpg");

			FileOutputStream out = new FileOutputStream("C:\\Users\\vivek\\OneDrive\\Desktop\\IO\\rays.jpg");

			int ch = in.read();

			while (ch != -1) {

				out.write(ch);

				 System.out.print((char)ch);

				ch = in.read();

			}

			out.close();
			in.close();

			System.out.println("Nice Pic...!!!");

		}

   }
}