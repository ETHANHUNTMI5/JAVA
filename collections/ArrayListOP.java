package collections;

import java.util.ArrayList;

public class ArrayListOP {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
	
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		ar2.add(1);
		ar2.add(2);
		ar2.add(3);
		ar2.add(4);
		ar2.add(5);
		System.out.println(ar2);
		
    	System.out.println(arr);
    	
    	ar2.addAll(arr);
    	
        System.out.println(ar2);
    	System.out.println(arr);
    	
    	//ar2.removeAll(arr); // removes all the elements of ar2 not present in arr
    	
    	ar2.retainAll(arr);// retains only those elements of ar2 present in arr
    	System.out.println(ar2);
    	System.out.println(arr);
    	
    	Object obj = arr;
    	
    	System.out.println(obj);
	}

}
