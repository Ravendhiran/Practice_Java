package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
			
			Integer set = list.set(1, 200); //replacing new value
			System.out.println(set);
			System.out.println("Updated List: "+list);
			
			System.out.println("Print all the elements using for-loop");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("Print all the elements using for-each loop");
			for (Integer integer : list) {
				System.out.println(integer);
			}
			
			System.out.println("Print all the elements using iterator()");
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			
			Integer remove = list.remove(1);
			System.out.println(remove);
			System.out.println("Updated List: "+list);
			list.add(0, 5);
			System.out.println(list);
			list.clear();
			System.out.println("List: "+list);
			
	}

}
