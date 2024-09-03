package Java.Basic_Program;

public class Static_Variable {
		
		static int b = 10; // Static variable
		
		public static void add() { // Static method
			int a=5; // local variable
			int c=a+b;
			System.out.println("C Value = "+c);			
		}

		public static void main(String[] args) {
			
			//LocalANDInstance_Variable v = new LocalANDInstance_Variable();
			add();
			System.out.println("b value = "+b);

		}

}
