package Java.Basic_Program;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		for(int i=1;i<=5;i++) {
			for(int k=5; k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
			}
			System.out.println();
			if(i==5) {
				System.out.println("I value is :"+i);
			}
		}

}
}
