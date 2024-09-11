package Array;

import java.util.Arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 20, 30, 50, 20 };

		Arrays.sort(a);
		System.out.println("After Sorting order: " + Arrays.toString(a));

		int j = 0;
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(i!=a.length-1) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
				
			}
			}
			else {
				temp[j++] = a[i];
			}

		}

		for (int k = 0; k < j; k++) {
			System.out.print(temp[k] + " ");
		}
	}
}
