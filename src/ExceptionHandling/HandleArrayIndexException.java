package ExceptionHandling;

import java.util.Scanner;

public class HandleArrayIndexException{

	public static void main(String[] args) {
		
		System.out.println("Program is started............");
		Scanner sc = new Scanner(System.in);
			
		int a[]=new int[5];
		System.out.println("Enter the position:");
		int p = sc.nextInt();
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		try {
			a[p]=n;
		System.out.println(a[p]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Reason: "+e.getMessage());
		}
	
		System.out.println("Program is completed............");
		
	}

}
