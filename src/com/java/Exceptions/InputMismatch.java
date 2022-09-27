package com.java.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("Enter value of a to get its square value");
				Integer a = sc.nextInt();
				System.out.println((a*a));
			}
			
			catch(InputMismatchException ex) {
				System.out.println(ex);
			}
			
		}
	}


