package String;

public class removeSpecialCharacters {

	public static void main(String[] args) {
		String s = "Wel!@!#%$#%$#% come";
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
		
		String s1 = "@$#%$% testing &*&*$ selenium #$#%@%&(% java";
		String replaceAll2 = s1.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(replaceAll2);
		
		

	}

}
