package ExceptionHandling;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		String s = "Welcome";
		int n=Integer.parseInt(s);  //NumberFormatException
		System.out.println(n);

	}

}
