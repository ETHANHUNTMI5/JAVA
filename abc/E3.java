package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class E3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
			
			long ans=0;
			long n = scn.nextLong();
			ArrayList<Long> ll = new ArrayList<Long>();
			
			for(int a=0;a<n;a++) 
			{long b = scn.nextLong();
		    ll.add(b);
		    if(b<=0)
		    {ans++;}
			}
			System.out.println(ans);
			Collections.sort(ll);
			System.out.println(ll);
			long trans=0;
			long pos=0;
			for(int i =0;i<ll.size();i++)
			{
				if(ll.get(i)>0)
				{trans=i;
				pos=ll.get(i);
				break;
				}
			}
			if(pos>0)
			{ans = ans+1;
			for(int i=0;i<trans && pos>0;i++)
			{
				if(Math.abs(ll.get(i)-ll.get(i+1))<pos)
				{
					ans=ans-1;
					break;
				}
			}
			}
			
		    System.out.println(ans);
		    }
	}

}