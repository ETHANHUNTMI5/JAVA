package codeFORCES;

import java.util.Scanner;

public class Olympiad {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		int c1=0,c2=0,c3=0;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			if(arr[a]==1)
			{
				c1++;
			}
			
			else if(arr[a]==2)
			{c2++;}
			else
			{c3++;}
		}
		
		int ans = Math.min(c1, Math.min(c2, c3));
		System.out.println(ans);
		
		if(ans>0)
		{
			int [] one = new int[c1];
			int [] two = new int[c2];
			int [] three = new int[c3];
			
			int d1=0,d2=0,d3=0;
			for(int a=0;a<n;a++)
			{if(arr[a]==1)
			{
				one[d1]=a+1;
				d1++;
			}
			
			else if(arr[a]==2)
			{two[d2]=a+1;
			d2++;
}
			else
			{three[d3]=a+1;
			d3++;
}}
			
			for(int a=0;a<ans;a++)
			{
				System.out.println(one[a]+" "+two[a]+" "+three[a]);
				
			}
			
		}
		
		
	}

}
