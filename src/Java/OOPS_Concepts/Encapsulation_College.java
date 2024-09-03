package Java.OOPS_Concepts;

class Student1{
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setID(int id) {
		this.id=id;
	}
	public void getName() {
		System.out.println("Name is "+name);
	}
	public void getID() {
		System.out.println("ID is "+id);
	}
}

public class Encapsulation_College {

	public static void main(String[] args) {
		Student1 e = new Student1();
		e.setName("Lithish");
		e.setID(2017709);
		e.getName();
		e.getID();
	}

}
