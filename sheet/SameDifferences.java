package sheet;

import java.util.HashMap;
import java.util.Scanner;

public class SameDifferences {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
			long ans =0;
			long n = scn.nextInt();
			long [] arr = new long[(int) n];
			HashMap<Long,Long> map = new HashMap<>();
			for(long a=0;a<n;a++)
			{
				arr[(int) a] = scn.nextInt();
				if(map.containsKey(arr[(int) a]-a))
				{ans= ans+map.get(arr[(int) a]-a);
				map.put(arr[(int) a]-a,map.get(arr[(int) a]-a)+1);
				}
				else
				{map.put(arr[(int) a]-a,(long) 1);}
				
			}
			System.out.println(ans);
			
		}
		
	}

}
