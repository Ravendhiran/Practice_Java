package Java.OOPS_Concepts;

public class String_Split {

	public static void main(String[] args) {
		String s="By the people for the people of the people";
		String[] split = s.split(" ");
		for(String temp:split) {
			System.out.println(temp);
		}
	}

}
