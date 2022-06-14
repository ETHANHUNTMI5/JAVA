package challenges_DP;

import java.util.Scanner;

public class Biotonic {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		int t =scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
		
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int b=0;b<n;b++)
		{arr[b]= scn.nextInt();}

		System.out.println(Kar(arr));
		}
		}
	
	public static int Kar(int [] arr)
	{
		int n = arr.length;
		
		
		int [] in = new int[n];
		int [] de = new int[n];
		in[0]=1;
		de[n-1]=1;
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]>=arr[a-1])
		{
			in[a]= in[a-1]+1;
		}
		else
		{
			in[a]=1;
		}
		}
		
		
		for(int a=n-2;a>=0;a--)
		{
			if(arr[a]>=arr[a+1])
			{de[a]= de[a+1]+1;}
			else
			{de[a]=1;}
			
		}
		int max=in[0]+de[0]-1,an=0;
		
		
		for(int i=1;i<n;i++)
		{
			an = in[i]+de[i]-1;
			if(an>max)
			{max=an;
			}
			
		}
		
		 return max;
		
	}
	
	
}
