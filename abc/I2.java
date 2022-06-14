package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class I2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			
			int n = scn.nextInt();
			int [] arr = new int[n];
			ArrayList<Integer> even = new ArrayList<Integer>();
			ArrayList<Integer> odd = new ArrayList<Integer>();
			
			
			for(int a=0;a<n;a++)
			{
				
				int p= scn.nextInt();
				arr[a]=p;
				
				if(p%2==0)
				{
					even.add(p);	
					}
				else
				{
					odd.add(p);
				}
				
			}
			
			int ans=0;
			int s = even.size();
			int b = n-1;
			int c=0;
			while(c<s)
			{
				ans +=b;
			b--;
				c++;}
			
			//System.out.println("--"+ans);
	
			Collections.sort(odd);
			//System.out.println(odd);
			for(int a=0;a<odd.size();a++)
			{
				if(odd.get(a)==1)
				{continue;}
					
				
				for(int b2=a+1;b2<odd.size();b2++)
				{
					if(gcd(odd.get(a), 2*odd.get(b2))>1)
					{
						ans++;
					}
				}
				
			}
		
			System.out.println(ans);
		}
		
	
		
	}
	public static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }

}
