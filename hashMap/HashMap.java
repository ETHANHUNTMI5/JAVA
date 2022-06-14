package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

		map.put("Usa", 200);
		map.put("Uk", 175);
		map.put("India", 300);
		map.put("China", 350);
		System.out.println(map);
		
		map.put("Sweden", 100);
		System.out.println(map);
		
		map.put("India", 320);//updated
		System.out.println(map);
		
		System.out.println(map.get("India"));
		System.out.println(map.get("russia"));//null
		
		System.out.println(map.remove("Usa"));// removed from map but value is returned
		System.out.println(map);
		
		
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("Usa"));
		
		System.out.println("*******Keys*****");
		
		java.util.Set<String> key = map.keySet();//gives set of unique keys from the map
		
		for(String s: key)
		{System.out.print(s+" ");}
		System.out.println();
		
		System.out.println("******Values****");
		Collection<Integer> values = map.values();// gives the values we dont use Sets as values can be repeated
 
		for(int i : values)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("******EntrySet******");
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet(); 
		for(Map.Entry<String, Integer> entry : entries)
		{
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		
	
	}

	
	

}
