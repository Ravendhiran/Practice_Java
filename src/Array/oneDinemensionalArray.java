package Array;

import java.util.Arrays;

public class oneDinemensionalArray {

	public static void main(String[] args) {
		
		//Approach 1:
		//1) Declare an array
		int a[]=new int[5];
		
		//2) add values into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//Approach 1:
		//1) Declare an array and add values into array
		
		int a1[]= {10,20,30,40,50};
		
		//3) Find size of an array
		System.out.println(a.length);
		System.out.println(a1.length);
		
		//4) read single value from an array
		System.out.println(a[2]);
		
		//5) read multiple values from an array
		System.out.println(Arrays.toString(a)); //it will print the value but we cannot do any operation
		
		System.out.println("For loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("For-Each loop");
		for (int i : a1) {
			System.out.println(i);
		}
		
	}

}
