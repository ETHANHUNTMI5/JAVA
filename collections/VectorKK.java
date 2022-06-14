package collections;

import java.util.ListIterator;
import java.util.Vector;

public class VectorKK {

	public static void main(String[] args) {
	Vector<Integer > vec = new Vector<Integer>();
	
	vec.ensureCapacity(20);   // ensures the min capacity
	vec.add(1);
	vec.add(5);
	vec.add(3);
	vec.add(6);
	vec.add(3);
	
	System.out.println(vec.size());
	System.out.println(vec.contains(6));
	
	
	System.out.println(vec);
	
	
	ListIterator<Integer> l= vec.listIterator();
	
	while(l.hasNext())
	{System.out.print(l.next()+" ");}
	System.out.println();

	// in backward manner
	
while(l.hasPrevious())
{System.out.print(l.previous()+" ");}
}
}
