package String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int l = s.length();
		String rev="";
		for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Entered String is  Palindrome String");
		}
		else {
			System.out.println("Entered String is not a Palindrome String");
		}
	}

}
