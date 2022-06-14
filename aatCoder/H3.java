package aatCoder;

import java.util.Scanner;

public class H3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] arr = {1};
		int n = arr.length;
		int [] pre = new int[n];
		int [] post = new int[n];
		
		for(int a=1;a<n;a++)
		{pre[a]= pre[a-1]+arr[a-1];}
		
		for(int a=n-2;a>=0;a--)
		{
			post[a]= post[a+1]+arr[a+1];
		}
		
		for(int i : pre)
		{System.out.print(i+" ");}
		
		System.out.println();
		
		for(int i : post)
		{System.out.print(i+" ");}
		
		int ans=-1;
		for(int a=0;a<n;a++)
		{
			if(pre[a]==post[a])
			{ans=a;
			break;}
		}
		System.out.println();
		System.out.println(ans);
	}

}
