package Array;

import java.util.Arrays;

public class findDuplicates {
 
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 20, 30, 50, 20 };

		Arrays.sort(a);
		System.out.println("After Sorting order: "+Arrays.toString(a));
	
		int count, i, j;
		for (i = 0; i < a.length; i++) {
			count = 1;
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				} 
				else {
					break;
				}
			}
			if (count > 1) {
				System.out.println(a[i] + " is repeated " + count + " times");
			}
			i = j - 1;
			
		}

	}

}
