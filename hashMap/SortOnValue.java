package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortOnValue {

	public static void main(String[] args) {
		
//		 Collections.sort(ll , (o1,o2) -> (o1.s-o2.s==0? o1.e-o2.e : o1.s-o2.s));
		
		
		java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer, String>();
		map.put(1,"Zahir");
		map.put(4,"Aman");
		map.put(5,"Raj");
		map.put(3,"Jatin");
		map.put(2,"Harsh");
		System.out.print("Actual--> ");
		System.out.println(map);
		
		//use arrayList and collections.sort
	ArrayList<Map.Entry<Integer, String>> ll = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
	
	Collections.sort(ll,new Comparator<Map.Entry<Integer, String>>() {

		@Override
		public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			
			return o1.getValue().compareTo(o2.getValue());
		}
	});
	
	System.out.print("Sorted--> ");
	System.out.println(ll);
	 
	System.out.println("********");
	
	// or the lambda function
	java.util.HashMap<Integer, String> map2 = new java.util.HashMap<Integer, String>();
	map2.put(1,"Zahir");
	map2.put(4,"Aman");
	map2.put(5,"Raj");
	map2.put(3,"Jatin");
	map2.put(2,"Harsh");
	System.out.print("Actual--> ");
	System.out.println(map2);
	
	
ArrayList<Map.Entry<Integer, String>> ll2 = new ArrayList<Map.Entry<Integer,String>>(map2.entrySet());
	
	Collections.sort(ll2,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));

	System.out.print("Sorted--> ");
	System.out.println(ll2);
	
	
	}

}
