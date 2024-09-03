package ExceptionHandling;

import java.util.Scanner;

public class Arithmetic_with_ExceptionClass {

	public static void main(String[] args) {
		System.out.println("Program is started............");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to divide:");
		int n = sc.nextInt();
		try {
		System.out.println(100/n);
		}
		catch(Exception e) {
			System.out.println("Exception Reason: "+e.getMessage());
		}
		
		System.out.println("Program is completed............");
		
	}

	}


