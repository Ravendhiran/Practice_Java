package Java.OOPS_Concepts;


public class interface_HDFC implements Bank{

	public void depositMoney() {
		System.out.println("Money deposited in HDFC Bank");
	}

	public void viewBalance() {
		System.out.println("Balance viewed in HDFC Bank");
	}

	public void transferAmount() {
		System.out.println("Amount transferrd from HDFC Bank");
	}

	public void openFixedDeposit() {
		System.out.println("Fixed Deposit opened in HDFC Bank");
	}
	
	public void interestDeposit() {
		System.out.println("Interet amount deposited in HDFC Bank");
	}	

	public static void main(String[] args) {
		
		interface_HDFC h = new interface_HDFC();
		h.depositMoney();
		h.viewBalance();
		h.transferAmount();
		h.openFixedDeposit();
		h.interestDeposit();
		
		System.out.println("----------------------------------");
		
		Bank b = new interface_HDFC(); //Up-casting, also can be defined as "Bank b = h;"
		b.depositMoney();
		b.viewBalance();
		b.transferAmount();
		b.openFixedDeposit();
	}

}
