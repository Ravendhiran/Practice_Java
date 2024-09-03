package Collections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPI {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str1="Welcome";
		String str2="Add";
		
		 Method m1 = ReflectionAPI.class.getMethod(str1);
		 Method m2 = ReflectionAPI.class.getMethod(str2,Integer.class,Integer.class);
		 
		 m1.invoke(m1);
		 m2.invoke(m2,5,6);
	}
	
	public static void Welcome() {
		System.out.println("Welcome to Reflection API");
	}
	
	public static void Add(Integer x,Integer y) {
		
		System.out.println("x+y value: "+(x+y));
	}
	
	

}
