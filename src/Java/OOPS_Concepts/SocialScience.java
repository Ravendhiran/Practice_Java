package Java.OOPS_Concepts;

public class SocialScience extends Science{
	int socialscience;
	
	public void socialscienceMark() {
		System.out.println("SocialScience mark is "+socialscience);
	}
}
class Tamil{
	int tamil;
	
	public void tamilMark() {
		System.out.println("Tamil mark is "+tamil);
	}
}

 class English extends Tamil{
	int english;
	
	public void englishMark() {
		System.out.println("English mark is "+english);
	}
}
 class Maths extends English{
	int maths;
	
	public void mathsMark() {
		System.out.println("Maths mark is "+maths);
	}
}
 class Science extends Maths{
	int science;
	
	public void scienceMark() {
		System.out.println("Science mark is "+science);
	}
}

