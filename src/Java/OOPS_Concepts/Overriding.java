package Java.OOPS_Concepts;

	 class bike{  
		int km=45;
		 public void run(){
			  System.out.println("Class bike - running "+km+"km speed");
			  }  
		 public void owner() {
			  System.out.print("Lithish");
		  }
		}  
		public class Overriding extends bike{ 
			int km = 60;
			public void run(){
				  System.out.println("Class Overriding - running "+km+"km speed");
				  }   
			public void owner() {
				super.owner();
				System.out.println(" and Kiruthiga");
			}
		  
		  public static void main(String args[]){  
		
		  bike b1 = new bike();
		  	b1.run(); // it'll call the parent class method
			  
		  Overriding b2 = new Overriding();
		    b2.run(); // it'll call the child class method 
		    
		    b2.owner(); //it'll call both parent and child class methods
		    System.out.println("Speed = "+b2.km+"km");
		    
		    bike b3 = new Overriding(); //Up-casting
		    System.out.println("Speed = "+b3.km+"km");
		    
		    
		  }   
		}  
