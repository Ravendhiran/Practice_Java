package sri;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Map.En;
import java.util.Map.Entry;
public class interview {
	public void sample(){
		String a ="aaaabbbcccdd";
		char[]b=a.toCharArray();
		Map<Character,Integer> m=new LinkedHashMap<Character, Integer>();
		for(Character c:b){
		    if(m.containsKey(c)){
		        Integer valueofchar=m.get(c);
		        m.put(c,valueofchar+1);
		    }
		    else{
		        m.put(c,1);
		    }
		}
		System.out.println("charcount:"+m);
		for(Entry<Character,Integer>tt:m.entrySet()) {
			Character key = tt.getKey();
			Integer value = tt.getValue();
			System.out.print(key+""+value);
		}
		}
	
		    public static void main(String[] args) {
		        System.out.println("Hello, World!");
		        interview hello=new interview();
		        hello.sample();
		    }
		}

