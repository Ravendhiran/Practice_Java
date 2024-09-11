package String;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable, cannot change
		String s="Welcome ";
		s.concat("to Java");
		System.out.println("Doesn't change the original string: \n"+s);
		
		//StringBuffer - mutable , can change
		StringBuffer s1=new StringBuffer("Welcome");
		s1.append(" to Java");  
		System.out.println("Changed the original string: \n"+s1);

	}

}
