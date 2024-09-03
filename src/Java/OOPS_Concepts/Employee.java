package Java.OOPS_Concepts;

public class Employee {
	
	//methods
	public void empID() {
		System.out.println("2017709");
	}
	public void empName() {
		System.out.println("Lithish");
	}
	public void empDOB() {
		System.out.println("11th Aug 2000");
	}
	//main method
	public static void main(String[] args) {
		//classname object = keyword classname();
		Employee emp = new Employee(); 
		//objject.method();
		emp.empID();
		emp.empName();
		emp.empDOB();
		
	}

}
