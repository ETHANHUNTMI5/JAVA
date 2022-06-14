package sheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModeOfFreq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		for(int wt =0;wt<t;wt++)
		{
			int n = scn.nextInt();
			HashMap<Integer,Integer> map = new HashMap<>();
			
			for(int a=1;a<=n;a++)
			{
				int get = scn.nextInt();
				if(map.containsKey(get))
				{map.put(get,map.get(get)+1);}
				else
				{map.put(get, 1);}
				
			}
		//System.out.println(map);
		HashMap<Integer,Integer> fans = new HashMap<Integer,Integer>();
		int maxfreq=1;
		for(Map.Entry<Integer,Integer> bc: map.entrySet())
		{
			int freq = bc.getValue();
			if(fans.containsKey(freq))
			{fans.put(freq,fans.get(freq)+1);}
			else
			{fans.put(freq,1);}
			
			maxfreq = Math.max(maxfreq, fans.get(freq));
		}
		int ans=Integer.MAX_VALUE;
		for(Map.Entry<Integer, Integer> bc : fans.entrySet())
		{
			if(bc.getValue()==maxfreq)
			{
				ans = Math.min(ans, bc.getKey());
			}
		}
	System.out.println(ans);}

}
	
}
