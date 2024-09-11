package String;

public class countOccurrences {

	public static void main(String[] args) {
		String s= "Welcome to java";
		int totalCount=s.length();
		
		int totalCount_afterRemove = s.replace("a", "").length();		
		int count=totalCount-totalCount_afterRemove;
		
		System.out.println("Number of occurrences of a is: "+count);
		
			
		

	}

}
