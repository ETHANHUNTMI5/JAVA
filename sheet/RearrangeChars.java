package sheet;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeChars {
public static class Pair
{
	char c;
	int f;
	Pair(char c , int f)
	{
		this.c=c;
		this.f=f;
	}
}
	
	public static class HComparator implements Comparator<Pair>
	{
		public int compare(Pair t, Pair o)
		{
			return o.f-t.f;
		}
	}
	public static void main(String[] args) {
		String s = "aaaabbbbcc";
		StringBuilder sb = new StringBuilder();
		HashMap<Character,Integer> map = new HashMap<>();
		 
		int n = s.length();
		int max = -1;
		for(int a=0;a<n;a++)
		{char c = s.charAt(a);
		
		if(!map.containsKey(c))
		{map.put(c,1);}
		else
		{map.put(c,map.get(c)+1);}
		
		max = Math.max(max,map.get(c));
		}
		
		if(max>(int)Math.ceil((double)n/2))
		{System.out.println("Not Possible");
		return;}
		
		System.out.println(map);
		PriorityQueue<Pair> heap = new PriorityQueue<>(new HComparator());
		for(Map.Entry<Character, Integer> bc : map.entrySet())
		{
			heap.add(new Pair(bc.getKey(),bc.getValue()));
		}
		
		char prev='*';
		while(!heap.isEmpty())
		{
		Pair p = heap.peek();	
		if(p.c!=prev)
		{
			sb.append(p.c);
			p.f=p.f-1;
			if(p.f==0)
			{heap.remove();}
			prev=p.c;
		}
		else
		{
		 p = heap.remove();
		 Pair p2 = heap.remove();
		 sb.append(p2.c);
		 p2.f=p2.f-1;
		 if(p2.f!=0) {heap.add(p2);}
		 heap.add(p);
		 prev=p2.c;
		}
			
		}
		System.out.println(sb);
		}
		
	}


