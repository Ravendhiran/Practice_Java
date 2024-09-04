package String;

public class ReverseString {

	public static void main(String[] args) {
		String s="Welcome";
		int l = s.length();
		System.out.println("One Method: ");
		for(int i=l-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String rev="";
		for(int i=0;i<l;i++) {
			rev=rev+s.charAt(l-1-i);
		}
		System.out.println("Reverse String another method: "+rev); //always length - 1 
	}

}
