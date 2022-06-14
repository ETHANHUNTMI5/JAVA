package challengesHashAndTries;

import java.util.HashMap;
import java.util.Scanner;

public class ExistOrNot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			
			int n = scn.nextInt();
			
			for(int b=1;b<=n;b++)
			{
				map.put(scn.nextInt(), true);
				
			}
			int q= scn.nextInt();
			
			for(int c=1;c<=q;c++)
			{
				int get = scn.nextInt();
				
				if(map.containsKey(get))
				{System.out.println("Yes");}
				else
				{System.out.println("No");}
			}
			
			
			
		}
		
	}

}
