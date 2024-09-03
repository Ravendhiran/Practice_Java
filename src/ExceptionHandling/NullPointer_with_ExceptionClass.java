package ExceptionHandling;

public class NullPointer_with_ExceptionClass {

	public static void main(String[] args) {

		String s = null;
		try {
		
		System.out.println(s.length());   //NullPointerException
		}
		catch(Exception e) {
			System.out.println("Exception Reason: "+e.getMessage());
		}
	}

}
