package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			ArrayList<Integer> ll = new ArrayList<Integer>();
			
			for(int a=0;a<n;a++)
			{ll.add(scn.nextInt());}
			
			Collections.sort(ll);
			
			int count=0;
			
			int lo = 0;
			int hi = ll.size()-1;
			while(hi>1)
			{
				int avg = (ll.get(lo)+ll.get(lo+1)+ll.get(hi))/3;
				if(ll.get(hi)>avg)
				{count++;
				ll.remove(ll.size()-1);}
				
				else
				{break;}
				
				hi=ll.size()-1;
			}
			
			if(ll.size()==2)
			{
				if((ll.get(0)+ll.get(1))/2<ll.get(1))
				{
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}
