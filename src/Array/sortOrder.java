package Array;

import java.util.Arrays;

public class sortOrder {
	public static void main(String[] args) {
		
		int b[] = { 10,30,50,40,20};
		
		Arrays.sort(b);
		System.out.println("After Sorting order using inbuild method: " + Arrays.toString(b));
		
		int a[] = { 10,30,50,40,20};
		//no of comparison = length-1 (here index starts from 0 to a.length-1, so i < a.length-1)
		int n=a.length;
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			
		}
		System.out.println("After Sorting order using for-loop: " + Arrays.toString(a));

		System.out.println("Reverse order using For-Loop");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

		System.out.println("Reverse order using While-Loop");
		int j = a.length - 1;
		while (j >= 0) {
			System.out.println(a[j]);
			j--;
		}

	}
}