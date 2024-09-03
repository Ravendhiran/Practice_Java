package Java.Basic_Program;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {


		int x, y ,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for X, Y, Z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber);  

	}

}
