package ExceptionHandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[4]=100;    //ArrayIndexException
		System.out.println(a[4]); 

	}

}
