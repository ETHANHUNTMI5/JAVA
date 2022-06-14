package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hashing {

	public static void main(String[] args) {
		
		//HashSet
        HashSet<Integer> set = new HashSet<Integer>();
		
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(5);// if printed returns boolean value
        // in set duplicate values are not allowed
        
        System.out.println(set.add(6));
        
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(7));
        System.out.println(set.isEmpty());
        
        Iterator<Integer> il = set.iterator();
        // to iterate over all the values 
        
        while(il.hasNext())
        {
        	System.out.print(il.next()+" ");
        }
        
        System.out.println("*********");
        //***************
	 
        // LinkedHashSet

        LinkedHashSet<String> lset = new LinkedHashSet<String>();
        
        // all the properties are almost similar to Hashset
        // its just that internally it gives importance to the order in which elements are added
        
        // both are unsorted
        
        // ###############
        System.out.println("###########");
        
        //TreeSet
        TreeSet<Integer> tset = new TreeSet<Integer>();
        
        tset.add(2);
        tset.add(5);
        tset.add(3);
        tset.add(6);
        tset.add(1);
        
      
        
        System.out.println(tset);
	
        SortedSet<Integer> se = tset.headSet(3);
	// i.e returns a sorted set having elements whose values are smaller than the arg passed
        System.out.println(se);
        
        // if 3 also included
        
        se= tset.headSet(3,true);
        System.out.println(se);
        
        SortedSet<Integer> te = tset.tailSet(3);
        //3 inclusive
        System.out.println(te);
        
        // exclude
        te = tset.tailSet(3,false);
        System.out.println(te);
        
        
        
        
        // TreeSet--> the values are sorted 
	}

}
