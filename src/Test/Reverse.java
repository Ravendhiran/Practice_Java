package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s=sc.nextLine();
		int l=s.length();
		
		for(int i=l-1;i>=0;i--) {
			char c=s.charAt(i);
			if(c!=' ') {
				System.out.print(c);
			}
		}
	}

}	
