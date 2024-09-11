package Array;

public class twoDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		System.out.println(a.length);//returns size of row
		System.out.println(a[0].length);//returns size of column, Anyone row value should be specified to get the column size
	
	int b[][]= {{100,200},{300,400},{500,600}};
	System.out.println(a.length);//returns size of row
	System.out.println(a[0].length);
	
	System.out.println(a[1][1]);
	
	for(int i=0;i<=a.length-1;i++) {
		for (int j=0;j<=a[i].length-1;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	for (int arr[] : a) {
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	
	}

}
