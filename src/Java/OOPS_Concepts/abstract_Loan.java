package Java.OOPS_Concepts;



public class abstract_Loan extends Bank2{

	@Override
	public void goldLoan() {
		System.out.println("Gold Loan is at 8%");
	}

	@Override
	public void carLoan() {
		System.out.println("Car Loan is at 11%");	
	}
	
	public void agriLoan() {
		System.out.println("Agri Loan is at 6%");	
	}
	
	public static void main (String[] args) {
		
		abstract_Loan l = new abstract_Loan();
		l.goldLoan();
		l.carLoan();
		l.homeLoan();
		l.agriLoan();
		
		System.out.println("-------------------------------------------------------");	

		Bank2 b= new abstract_Loan(); 
		// we cannot call agriLoan() method from Bank class	
		b.goldLoan();
		b.carLoan();
		b.homeLoan();
		
		
	
	}
	
	
}