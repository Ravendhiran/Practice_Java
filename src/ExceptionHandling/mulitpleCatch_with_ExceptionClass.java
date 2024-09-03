package ExceptionHandling;

public class mulitpleCatch_with_ExceptionClass {
	public static void main(String[] args) {
		try {
			 int[] numbers = {1, 2, 3};
			    System.out.println(numbers[5]); // This may throw ArrayIndexOutOfBoundsException
			    int result = 10 / 0;
		} catch (ArithmeticException e) {
		    System.out.println("Arithmetic error: " + e.getMessage());
		} catch (Exception e) {
		    System.out.println("A general error occurred: " + e.getMessage());
		}
	}

}
