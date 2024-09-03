package ExceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {

		String s = null;
		int l = s.length();  //NullPointerException
		System.out.println(l);
	}

}
