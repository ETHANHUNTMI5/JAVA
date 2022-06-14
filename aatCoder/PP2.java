package aatCoder;

import java.util.Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class PP2 {

	public static void main(String[] args) {
	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(-1,12);
		map.put(0,21);
		map.put(1,23);
		map.put(2,25);
		
		System.out.println(map);
		Collection<Integer> ll = map.values();
		
     for(int i : ll)
     {
    	 System.out.println(i);
     }
	}
}