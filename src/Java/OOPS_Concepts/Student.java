package Java.OOPS_Concepts;

public class Student extends SocialScience{

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.english=85;
		s.englishMark();
		
		/*we can access the variables and methods without using extends keyword by
		creating an object for the child class*/
		SocialScience ss = new SocialScience();
		ss.tamil=90;
		ss.english=85;
		ss.maths=100;
		ss.science=95;
		ss.socialscience=90;
		
		ss.tamilMark();
		ss.englishMark();
		ss.mathsMark();
		ss.scienceMark();
		ss.socialscienceMark();
		
		
	}
	
}

 