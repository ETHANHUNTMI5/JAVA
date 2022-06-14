package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class BeforeExam {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int d = scn.nextInt();
		int total = scn.nextInt();
		
		int minsum=0;
		int maxsum=0;
		
		ArrayList<Integer> min = new ArrayList<Integer>();
		ArrayList<Integer> max = new ArrayList<Integer>();
		for(int a=0;a<d;a++)
		{
			int x = scn.nextInt();
			minsum+=x;
			min.add(x);
			int y = scn.nextInt();
			maxsum+=y;
			max.add(y);
			
		}
		
		if(minsum>total || maxsum<total)
		{
			System.out.println("NO");
			return;
		}
		
		else
		{
			System.out.println("YES");
			
			ArrayList<Integer> ll = new ArrayList<Integer>(min);
			int ans=minsum;
			while(ans<total)
			{
				for(int a=0;a<ll.size();a++)
				{
					if(ans+max.get(a)-min.get(a)<total)
					{
						ll.set(a,max.get(a));
						
						ans= ans+max.get(a)-min.get(a);
					}
					
					else if(ans+max.get(a)-min.get(a)==total)
					{
						ll.set(a,max.get(a));
						ans= ans+max.get(a)-min.get(a);
						break;
					}
					
					else
					{
						ll.set(a,ll.get(a)+total-ans);
						ans=total;
						break;
					}
				}
				
			}
			for(int l : ll)
			System.out.print(l+" ");
			}
		
	}

}