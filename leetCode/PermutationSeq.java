package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PermutationSeq {

	public static void main(String[] args) {
		
		int n = 4;
		int k =9;
		int a= 0;
		String ans ="";
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int b=1;b<=n-a;b++)
		{
			int num = fact(n-1-a);
		    map.put(b,num*b);
			
		}
		while(k>0)
		{
			
ArrayList<Map.Entry<Integer, Integer>> keys2 = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
for(int b=0;b<keys2.size();b++)
{
	int kp = keys2.get(b).getKey();
	map.put(kp,fact(n-1-a)*(b+1));
}

//System.out.println(k+" "+map);




			for(int x=0;x<keys2.size();x++)
			{
				if(keys2.get(x).getValue()>=k)
				{
					if(x>=1)
					{k= k-keys2.get(x-1).getValue();
					ans = ans +keys2.get(x).getKey();
					map.remove(keys2.get(x).getKey());
					break;
					}
					
					else
					{
					ans = ans +keys2.get(x).getKey();
					map.remove(keys2.get(x).getKey());
					
					
					break;
					
					}
					
				}
				
			}
			if(map.size()==0)
			{
				break;}
			
		a++;}
		
		int fans=0;
		fans= Integer.parseInt(ans);
		System.out.println(fans);
	
			
		
	}
	public static int fact(int n )
	{
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		int fnm1= fact(n-1);
		
		return fnm1*n;
		
	}

}
