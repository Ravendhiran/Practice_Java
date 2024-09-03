package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Collection {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(11, "Ravi");
		map.put(22, "Ranjitha");
		map.put(33, "Lithish");
		map.put(44, "Kiruthiga");
		
		System.out.println(map);
		System.out.println(map.get(22));
		System.out.println(map.values());
		Set<Integer> m=map.keySet();
		System.out.println("Key Set:"+m);
		//for(Integer temp:m) 
	 for(Integer temp:m)
		{
			System.out.println("Key: "+temp);
			System.out.println("Value: "+map.get(temp));
		}
	 
		String remove = map.remove(11);
		System.out.println(remove);
		
		System.out.println(map);
	

		
		for(Entry<Integer,String> temp2:map.entrySet())
		{
			System.out.println("Key = "+temp2.getKey() +", Value = "+temp2.getValue());
		}
	}

}
