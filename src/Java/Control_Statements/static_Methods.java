package Java.Control_Statements;

public class static_Methods {

	public static void methodA() {
		System.out.println("Method A");
		
	}
	public static void methodB() {
		System.out.println("Method B");
		System.out.println("Calling Method A from Method B");
		methodA();
	}
	
	public static int methodC() {
		System.out.println("Method C");
		return 04;		
	}

	public static void main(String[] args) {
		int a=6, b=5, c;
		c=a+b;
		System.out.println("The sum of a and b is "+c);
		
		methodA();   //method calling statement
		methodB();   //method calling statement
		int x= methodC();
		System.out.println("Return value of Method C is fdht"+x);
	}
}
