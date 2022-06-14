package sheet;
import java.util.HashMap;
import java.util.Map;

public class SmallestSubarray {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 2, 3, 1};
		
		int n = arr.length;
		HashMap<Integer,Integer> start = new HashMap<>();
		HashMap<Integer,Integer> end = new HashMap<>();
		HashMap<Integer,Integer> count = new HashMap<>();
		int gcount=0;
		for(int a=0;a<n;a++)
		{
			int g = arr[a];
			if(!start.containsKey(g))
			{
				start.put(g,a);
				count.put(g,1);
				end.put(g,a);
			}
			else
			{
				count.put(g,count.get(g)+1);
				if(count.get(g)>gcount)
				{gcount=count.get(g);}
				end.put(g,a);
			}
			
		}
//		System.out.println(gcount);
//		System.out.println(start);
//		System.out.println(count);
//		System.out.println(end);
		int fans=n;
		int gs=0;
		int ge=n-1;
		for(Map.Entry<Integer, Integer> bc : count.entrySet())
		{
			if(bc.getValue()==gcount)
			{
				int k = bc.getKey();
				int val = end.get(k)-start.get(k);
				if(val<fans)
				{fans=val;
				gs= start.get(k);
				ge = end.get(k);
					
				}
			}
		}
		for(int i = gs;i<=ge;i++)
		{System.out.print(arr[i]+" ");}
		
	}

}
