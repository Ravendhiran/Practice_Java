package Collections;

import java.util.Set;
import java.util.HashSet;

public class Set_Collection {

	public static void main(String[] args) {

		Set<String> set= new HashSet<String>();
		set.add("My ");
		set.add("name ");
		set.add("is ");
		set.add("Ravi ");
		
		for(String hset:set) {
			System.out.print(hset);
		}
	}

}
