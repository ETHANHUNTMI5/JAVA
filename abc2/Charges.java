package abc2;

import java.util.Scanner;

public class Charges {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			int k = scn.nextInt();
			scn.nextLine();
			String s = scn.nextLine();
			
			int [] arr = new int[n];
			for(int a=0;a<s.length();a++)
			{
				arr[a]=s.charAt(a)-48;
			}
			
			
			int inlen=0;
			
			int pre= arr[0];
			
			for(int x=1;x<arr.length;x++)
			{
				
				if(arr[x]!=pre)
				{
					inlen = inlen+1;
				}
				else
				{
					inlen= inlen+2;
				}
				
				pre= arr[x];
				int Ini=inlen;
			}
	
			
			
			for(int a=1;a<=k;a++)
			{
				int p = scn.nextInt();
				int b = p-1;
				
				if(b==0)
				{
					
					if(arr[b+1]!=arr[b])
					{
					inlen = inlen+1;	
					}
					else
					{
						inlen = inlen-1;
					}
					
				}
				
				else if(b==n-1)
				{
					if(arr[b-1]!=arr[b])
					{
					inlen = inlen+1;	
					}
					else
					{inlen = inlen-1;}
					
				}
				
				else
				{
					if(arr[b+1]!=arr[b])
					{
					inlen = inlen+1;	
					}
					
					else
					{inlen = inlen-1;}
					
					if(arr[b-1]!=arr[b])
					{
					inlen = inlen+1;	
					}
					else
					{inlen = inlen-1;}
					
					
					
				}
		
				
				if(arr[b]==1)
				{arr[b]=0;}
				else
				{
					arr[b]=1;
				}
			System.out.println(inlen);}
		
			
		
	scn.nextLine();
		}
	}

}


