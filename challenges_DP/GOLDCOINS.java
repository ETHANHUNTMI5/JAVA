package challenges_DP;

import java.util.HashMap;
import java.util.Scanner;

public class GOLDCOINS {
public static HashMap<Long, Long>map = new HashMap<Long, Long>();
	
	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		Long l = scn.nextLong();
		System.out.println(GOLD(l)); 
	}
	
	public static long  GOLD(long n)
	{
		if(n==0 || n==1)
		{return n;}
		
		if(map.containsKey(n))
		{return map.get(n);}
		
		long a = GOLD(n/2);
		long b = GOLD(n/3);
		long c = GOLD(n/4);
		
		long ans = Math.max(a+b+c,n);
		
		map.put(n,ans);
		return ans;
	}
	public static long GOLDBU(int n)
	{
		int [] arr = new int[n+1];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int a=2;a<=n;a++)
		{
			arr[a]=Math.max(arr[a/2]+arr[a/3]+arr[a/4], a);
			
		}
		
		
		return arr[n];
	}


}
