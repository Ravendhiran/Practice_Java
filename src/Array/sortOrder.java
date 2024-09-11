package Array;

import java.util.Arrays;

public class sortOrder { 
		public static void main(String[] args) {
			int a[] = { 10, 20, 30, 40, 60, 80, 50, 70 };
			
			Arrays.sort(a);
			System.out.println("After Sorting order: "+Arrays.toString(a));
			
			System.out.println("Reverse order using For-Loop");
			for(int i=a.length-1;i>=0;i--) {
				System.out.println(a[i]);
			}
			
			System.out.println("Reverse order using While-Loop");
			int j=a.length-1;
			while(j>=0) {
				System.out.println(a[j]);
				j--;
			}
			
				
}
}