package Collections;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("List: "+list);
		list2.add(10);
		list2.add(20);
		list2.add(50);
		list2.add(60);
		
		System.out.println("List: "+list2);
		
		list.retainAll(list2);
		System.out.println("List: "+list);
		
		list.addAll(list2);
		System.out.println("List: "+list);
		list.removeAll(list2);
		System.out.println("List: "+list);

	}

}
