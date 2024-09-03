package Pojo;

public class methodCalling {
	
		
	public static int aValue() {
		int a = 10;
		return a;
		
	}
	public static int bValue() {
		int b = 20;
		return b;
		
	}
	
	public static void multi() {
		int c = aValue() * bValue();
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		multi();
		
	}

}
