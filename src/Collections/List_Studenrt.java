package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Studenrt {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			
			System.out.println("List: "+list);
			
			boolean contains = list.contains(30);
			System.out.println(contains);
			
			Integer set = list.set(1, 200);
			System.out.println(set);
			System.out.println("Updated List: "+list);
			
			Integer remove = list.remove(1);
			System.out.println(remove);
			System.out.println("Updated List: "+list);
			
			list.clear();
			System.out.println("List: "+list);
	}

}
