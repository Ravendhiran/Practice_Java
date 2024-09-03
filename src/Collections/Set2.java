package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
	
				Set<Integer> set = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				
				set.add(10);
				set.add(20);
				set.add(30);
				set.add(40);
				
				System.out.println("set: "+set);
				set2.add(10);
				set2.add(20);
				set2.add(50);
				set2.add(60);
				
				System.out.println("set: "+set2);
				
				set.retainAll(set2);
				System.out.println("set: "+set);
				
				set.addAll(set2);
				System.out.println("set: "+set);
				set.removeAll(set2);
				System.out.println("set: "+set);

			}

		}



