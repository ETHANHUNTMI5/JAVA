package recursionChallenges;

import java.util.Scanner;

public class Optimal {
	
	public static void main(String[] args) {

		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		System.out.println(OP(0, n-1, 1, arr));
		
}
	public static int OP(int si,int ei , int t, int[] arr)
	{
		
		if(t==arr.length || si==ei)
		{return 0;}
		
		int fi=0,li=0;
		
		if(t%2!=0)
		{
		fi= OP(si+1, ei, t+1, arr)+arr[si];
		li= OP(si, ei-1, t+1, arr)+arr[ei];
		}
		else
		{
			fi= OP(si, ei-1, t+1, arr);
			li=OP(si+1, ei, t+1, arr);
		}
		
		
		
		if(t%2!=0)
		return Math.max(fi, li);
		else
			return Math.min(fi, li);
	}
}