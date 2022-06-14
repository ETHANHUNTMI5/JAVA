package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Varun");
		map.put(3, "Bradd");
		map.put(2, "Ethan");
		map.put(1, "Tom");
		map.put(7, "Bradley");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());

		// compute == lambda function to chande value of key specified

		map.compute(1, (key, val) -> "John");

		System.out.println(map);

		System.out.println("**********");
		// **************

		// LinkedHashMap

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(4, "Varun");
		lmap.put(3, "Bradd");
		lmap.put(2, "Ethan");
		lmap.put(1, "Tom");
		lmap.put(7, "Bradley");
		
		System.out.println(lmap);
		System.out.println(lmap.entrySet());
		System.out.println(lmap.values());
		
		// the only difference is clearly visible i.e. the map is printed in the same
		// order the values are inserted no sorting(even of the numbers) keys has been done..
		
		System.out.println("#################");
		//############
		
		// TreeMap
		
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		
		tmap.put("aba","John");
		tmap.put("aaa","Steve");
		tmap.put("aea","Rann");
		tmap.put("aca","Ryan");
		System.out.println(tmap);
	 
		System.out.println(tmap.lastEntry());
		
		System.out.println(tmap.ceilingKey("aac"));
		// it returns the key just greater tham the arg provided
				
		
		System.out.println(tmap.floorKey("aac"));
		// it returns the key just lesser tham the arg provided

		System.out.println(tmap.subMap("aaa", "aca"));
		
		System.out.println(tmap.tailMap("aaa",false));
	}

}
