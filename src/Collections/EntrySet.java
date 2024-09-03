package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(11, "Ravi");
		map.put(22, "Ranjitha");
		map.put(33, "Lithish");
		map.put(44, "Kiruthiga");
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer temp:keySet) {
			System.out.println(map.get(temp));
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Entry<Integer,String> entry:entrySet) {
			
			System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
		}
		
		
		
		
	}

}
