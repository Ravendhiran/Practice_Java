package Java.Basic_Program;

public class LogicalOperators {

	public static void main(String[] args) {
		
		
		int a=5, b=10, c=15;
		
		if(a<b && a<c)
			System.out.println("a value is less than b & c");
		
		if(a<b && c<b)
			System.out.println("Cond should be failed");
		else
			System.out.println("Condition Failed-Both condition should be true");
		
		if(a>b || b<c)
			System.out.println("Either one condition is true");
		
		if(!(a>b))
			System.out.println("Condition will be true, if expression is false");
	}

}
