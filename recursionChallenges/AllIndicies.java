package recursionChallenges;

import java.util.Scanner;

public class AllIndicies {

	public static Scanner scn  = new Scanner(System.in);
	public static void main(String[] args) {

		int n = scn.nextInt();
	int[] arr = new int [n];
	takeInput(arr);
	int data = scn.nextInt();
	AllIndicies(arr,0,data,0);
	
	}

	public static void takeInput(int [] arr)
	{
		for(int a =0;a<arr.length;a++)
		{
			arr[a]=scn.nextInt();
			
		}
		
	}
	
	public static int [] AllIndicies(int [] arr,int si,int data,int count)
	{
		if(si==arr.length)
		{
			int[] base = null;
			base=new int[count];
			return base;
		}
		int [] ans = null;
		 if(arr[si]==data)
		    {System.out.print(si+" ");}
			
		
		if(arr[si]==data)
		{
			ans= AllIndicies(arr, si+1, data, count+1);
		
		}
	
		
		else
		{ans=AllIndicies(arr, si+1, data, count);
		}

   
    return ans;
	}
	
	
	
}
