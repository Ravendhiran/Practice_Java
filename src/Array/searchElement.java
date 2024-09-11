package Array;

import java.util.Scanner;

public class searchElement {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search number: ");
		int searchNum=sc.nextInt();
	
		boolean status=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==searchNum) {
				System.out.println("Element Found "+searchNum+" in array");
				status=true;
				break;
			}
	}
		if(status==false) {
			System.out.println("Element not Found "+searchNum+" in array");
		}

}
}
