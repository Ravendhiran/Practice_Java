package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Collection{

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("List: "+list);
		System.out.println("Using For Loop");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("Using For-each Loop");
		
		for(Integer temp:list)
		{
			System.out.println(temp);
		}
		
		System.out.println("Adding values directly to the list");
		List<Integer> list2=Arrays.asList(11,22,33,44);
		System.out.println(list2);
		for(Integer temp2:list2)
		{
			System.out.println(temp2);
		}
		
		

	}

}
