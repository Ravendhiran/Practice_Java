package Java.OOPS_Concepts;

public class Dog {
	
	String breed;   //states
	String color; 
	
	public void barking() {
		System.out.println(breed+" is barking");
	}
	public void color() {
		System.out.println(breed+" color is "+color);
	}
	public void eating() {
		System.out.println(breed+" is eating");
	}
	public void sleeping() {
		System.out.println(breed+" is sleeping");
		
		System.out.println("..............................");
	}

	public static void main(String[] args) {
	
		Dog dog1 = new Dog();
		dog1.breed = "Doberman";
		dog1.color = "Black";
		dog1.barking();
		dog1.color();
		dog1.eating();
		dog1.sleeping();
		
		Dog dog2 = new Dog();
		dog2.breed = "Pug";
		dog2.color = "White";
		dog2.barking();
		dog2.color();
		dog2.eating();
		dog2.sleeping();
	}
}
