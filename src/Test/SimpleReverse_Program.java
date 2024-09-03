package Test;

public class SimpleReverse_Program {

	public static void main(String[] args) {
		String s="Hello World";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
