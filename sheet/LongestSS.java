package sheet;

import java.util.HashMap;

public class LongestSS {

	public static void main(String[] args) {
		String s = "ABCBADCABH";
		HashMap<Character,Integer> map = new HashMap<>();
		
		int ans=0;
		int n = s.length();
		int fans=0;
		int iprev=-1;
		for(int a=0;a<n;a++)
		{
			
			char cc = s.charAt(a);
			
			
			if(map.containsKey(cc))
			{
				int prev = map.get(cc);
				
				if(prev<iprev)
				{
					ans++;
				}
				else
				{ans= a-prev;
				iprev=prev+1;}
				
				
				
				map.put(cc,a);
				
			}
			else
			{map.put(cc, a);
			ans++;}
			
			if(ans>fans)
			{fans=ans;}
			//System.out.println(a+" "+cc+" "+map+" "+ans+" "+iprev);
			
		}
		System.out.println(fans);
		
	}

}
