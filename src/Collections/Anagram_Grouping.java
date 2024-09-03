package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram_Grouping {
	
	public static void groupAnagram(String[] str) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String s:str) {
			char[] charArray=s.toCharArray();
			Arrays.sort(charArray);
			//Convert Array char[] into String
			String sortedStr=new String(charArray);
			if(!map.containsKey(sortedStr)) {
				//map.put(sortedStr, new ArrayList<Integer>());
			}
			}
	}

	public static void main(String[] args) {
		
		
		String s[]={"eat","tea","tan","ate","nat","bat"};
		//Add values directly to the list
		List<String> list=Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(list);
	
		
		

	}

}
