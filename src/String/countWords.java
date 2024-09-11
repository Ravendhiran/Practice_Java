package String;

public class countWords {

	public static void main(String[] args) {
		String s="Welcome to java";
		String split[] = s.split(" ");
		
		int wordsCount = split.length;
		System.out.println("1st Method: \n Number of words count is: "+wordsCount);
		
		int count=1;
		
		for(int i=0; i<=s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				count++;
			
		}
		
		System.out.println("2nd Method: \n Number of words count is: "+count);

	}

}
