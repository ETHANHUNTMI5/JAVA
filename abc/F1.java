package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
		   
			ArrayList<Long> ll = new ArrayList<Long>();
			for(long a=0;a<2*n;a++)
			{

				ll.add(scn.nextLong());
			}
			
			long lo = 0;
			long hi =2*n-1;
			Collections.sort(ll);
			//System.out.println(ll);
	ArrayList<Long> ans = new ArrayList<Long>();
	   
	
	
			while(lo<=hi)
			{
				ans.add(ll.get((int) lo));
				ans.add(ll.get((int)hi));
				
				lo++;
				hi--;
			}
			
			for(long l : ans)
			{System.out.print(l+" ");}
			
		System.out.println();}
		
	}

}
