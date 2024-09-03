package Java.Basic_Program;

public class Reverse_Print {

	public static void main(String[] args) {
		String s = "Ravendhiran";
		for(int i=s.length()-1;i>=0;i--) 
			System.out.print(s.charAt(i));
		
		System.out.println();//After printing reverse string to move into next line
		
		for(int i=s.length()-1;i>=0;i--) 
			System.out.println(s.charAt(i));
		
	}

}
