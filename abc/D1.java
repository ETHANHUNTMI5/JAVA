package abc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n =scn.nextLong();
		
		long [] A= new long[(int)n];
		long [] B= new long[(int)n];
		long [] C= new long[(int)n];

		long [] a1 = new long[(int)n+1];
		long[] b1 = new long[(int)n+1];
		long [] c1 = new long[(int)n+1];
		
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(long a=0;a<A.length;a++)
		{A[(int)a]= scn.nextLong();
		a1[(int)A[(int)a]]=a1[(int)A[(int)a]]+1;
		
		if(map.containsKey(A[(int)a]))
		{map.put(A[(int)a],map.get(A[(int)a])+1);}
		
		else
		{map.put(A[(int)a],(long) 1);}
		
		}
		
		
		
		
		HashMap<Long, Long> map2 = new HashMap<Long, Long>();
		
		for(long a=0;a<B.length;a++)
		{B[(int)a]= scn.nextLong();
		
		if(map.containsKey(B[(int)a]))
		{	
			if(map2.containsKey(a+1))
			{
				map2.put(a+1,map2.get(a+1)+1);
			}
			else
			{
				map2.put(a+1,(long) 1);
			}
			
			b1[(int)B[(int)a]]=b1[(int)B[(int)a]]+1;
			
		}

		}
		
		HashMap<Long, Long> map3 = new HashMap<Long, Long>();
		
		for(long a=0;a<C.length;a++)
		{C[(int)a]= scn.nextLong();
		
		if(map2.containsKey(C[(int)a]))
		{
		if(map3.containsKey(C[(int)a]))
		{map3.put(C[(int)a],map3.get(C[(int)a])+1);}
		else
		{
			map3.put(C[(int)a],(long) 1);
		}
		c1[(int)C[(int)a]]=c1[(int)C[(int)a]]+1;
		}
		
		}
		
	
				
		
		
		long fans=0;

       

		for(long a=0;a<=n;a++)
		{
			if(c1[(int)a]==0)
			{continue;}
			fans = fans+ c1[(int)a]*map.get(B[(int)a-1]);
		
			
		}
   System.out.println(fans);
	
	}


}
