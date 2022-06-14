package sheet;

import java.util.HashMap;

public class SubString0_1_2 {

	public static void main(String[] args) {

		String s = "102012";

		int n = s.length();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		char [] arr = s.toCharArray();

		int z=0,o=0,t=0;
		int ans=0;
		map.put("0*0",1);
		for(int a=0;a<n;a++)
		{
			if(arr[a]=='0')
			{
				z++;
			}
			else if(arr[a]=='1')
			{o++;}
			else
			{t++;}
			
			String key = (z-o)+"*"+(z-t);
		
			if(map.containsKey(key))
			{ans+=map.get(key);
			map.put(key,map.get(key)+1);}
			
			else
			{
				map.put(key,1);
			}
			
			
		}
		System.out.println(map);
		System.out.println(ans);
	}
}