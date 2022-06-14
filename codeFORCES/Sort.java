package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		
		int dec=0;
		int inc=0;
				
		
		int pre=arr[0];
		
		for(int a=1;a<n;a++)
		{
		if(arr[a]<pre)
		{dec=a;
		break;}
			
		pre= arr[a];
		}
		
		pre = arr[n-1];
		for(int a=n-2;a>=0;a--)
		{
			if(arr[a]>pre)
			{
				inc =a;
				break;
			}
		pre= arr[a];	
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(!(inc==0 && dec==0) && !(inc==n-1 && dec==n-1))
		{
		for(int a=0;a<dec-1;a++)
		{ans.add(arr[a]);}
		
		for(int a=inc+1;a>=dec-1;a--)
		{ans.add(arr[a]);}
		
		
		for(int a=inc+2;a<n;a++)
		{ans.add(arr[a]);}
		
		
		
		System.out.println(ans);
		
  
		int p=ans.get(0);
		boolean b = false;
		for(int a=1;a<ans.size();a++)
		{
			if(ans.get(a)<p)
			{System.out.println("no");
			b=true;
			break;}
			
			p=ans.get(a);
		}
	
		if(!b)
		{System.out.println("yes");
		System.out.println((dec)+" "+(inc+2));}
		
	}
		if( inc==0 && inc==dec)
		{System.out.println("yes");
		 System.out.println(1 +" 1");
		}
	}

}
