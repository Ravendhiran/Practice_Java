package Array;

import java.util.Arrays;

public class oddEvenNumbers {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		
		int oddCount=0, evenCount=0;
		System.out.println("Odd numbers in array");

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
				oddCount++;
			} 
		}
		System.out.println("number of odd's in array: "+oddCount);
		System.out.println("Even numbers in array");

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				evenCount++;
			} 
		}
		System.out.println("number of even's in array: "+evenCount);

	}

}
