package Array;

import java.util.Arrays;

public class MaxandMinNumber {

	public static void main(String[] args) {
		
		int a[]= {10,20,9,6,40,30,1,100};
		
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Maximum value: "+max);
		
		int min=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}	
		}
		
		System.out.println("Minimum value: "+min);
		
		Arrays.sort(a);
		System.out.println("Maximum value using in-built method: "+a[a.length-1]);
		System.out.println("Minimum value using in-built method: "+a[0]);
		
		
	}

}
