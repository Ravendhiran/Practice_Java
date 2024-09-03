package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetitive_Words {

	public static void main(String[] args) {
		String s="By the people for the people of the people";
		String split[] = s.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		
		for(String kword:split) {
			if(map.containsKey(kword)) {
				Integer value = map.get(kword);
				map.put(kword, value+1);
			}
			else {
				map.put(kword, 1);
			}
		}
		//Key doesn't allow duplicates
		System.out.println(map);
		
		System.out.println("-----Print the Repetitive Words-------");		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
}
}