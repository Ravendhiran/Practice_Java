package Java.OOPS_Concepts;

public class Overloading {

	public void student() {
		System.out.println("Lithish");
	}
	public void student(char initial, int age) {
		System.out.println("Name= Lithish "+initial+" ,Age = "+age);
	}
	public void student(int age, char initial) {
		System.out.println("Age = "+age+" , Name = Lithish "+initial);
	}
	
	public static void main (String[] args) {
		Overloading o = new Overloading();
		o.student();
		o.student('R', 2);
		o.student(2, 'R');
	}
}
