package sheet;

import java.util.Scanner;

public class PickChicks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long cases = scn.nextLong();
		
		for(long wt=1;wt<=cases;wt++)
		{
			long n = scn.nextLong();
			long k = scn.nextLong();
			long b = scn.nextLong();
			long T = scn.nextLong();
			
			long [] pos = new long[(int) n];
			long [] vel = new long[(int) n];
			for(long a=0;a<n;a++)
			{pos[(int) a]=scn.nextLong();}
			
			for(long a=0;a<n;a++)
			{vel[(int) a]=scn.nextLong();}
			
			long count=0;
			long ans=0;
			long re=0;
			for(long a=n-1;a>=0;a--)
			{
				if(count==k)break;
				
				long possible = b-pos[(int) a];
				if(possible<=vel[(int) a]*T)
				{ans+=count;
				re++;}
				else
				{count++;}
				
			}
			if(re>=k)
			{System.out.println("Case #"+wt+": "+ans);}
			else
			{System.out.println("Case #"+wt+": IMPOSSIBLE");}
			
		}

	}

}
