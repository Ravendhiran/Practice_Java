package String;

import java.util.Arrays;

public class String_Concepts {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		//Ex1
		String s2="$15,20,55";
		System.out.println(s2.replace("$","").replace(",",""));
		
		//Ex2
		String s3="abc,123@xyz";
		String split[] = s3.split(",");
		String split2[] = split[1].split("@");
		System.out.println(split[0]+" , "+split2[0]+", "+split2[1]);
		
		//Ex3
		String s4="abc 123 xyz";
		String[] split3 = s4.split(" ");
		System.out.println(split3[0]);
		System.out.println(Arrays.toString(split3));
		for (String string : split3) {
			System.out.println(string);
		}
		
		//Ex4
		String name = "John Kenedy";
		System.out.println(name.toLowerCase().contains("john"));  //Checking without Case sensitive
		
		//Substring
		String s5="Hello World";
		System.out.println(s5.substring(3));
		System.out.println(s5.substring(2, 7));
		
		
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.indexOf("to"));
		System.out.println(s.startsWith("Wel"));
		System.out.println(s.endsWith("Java"));
		
		String s6="";
		String s7=" ";
		String s8=null;
		
		System.out.println(s.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());
		
		
	}

}
