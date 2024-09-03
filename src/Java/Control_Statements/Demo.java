package Java.Control_Statements;

public class Demo {
	public static void main(String[] args) {
		
		int a=6, b=1, c=4, d=3;
		
		if(a<b && a<c && a<d) 
		{System.out.println(" a is less than b,c & e");}
		
		else if(b<c && b<d) {
			System.out.println(" b is less than a,c & e");
         }
		else if(c<d) {
			System.out.println(" c is less than a,b & e");
		}
		else {
			System.out.println(" d is less than a, b & c");
		}
	}
}
