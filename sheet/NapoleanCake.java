package sheet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NapoleanCake {
public static int min =0;
public static boolean[] check;
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
		
			
			int [] arr = new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a] = scn.nextInt();
			}
	
			int min = Integer.MAX_VALUE;
			int [] ans = new int[n];
			for(int a =n-1;a>=0;a--)
			{
				min = Math.min(min, a-arr[a]);
				
				if(min <a)
				{ans[a]=1;}
				
			}
			for(int i : ans)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
	}