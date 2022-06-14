package stringChallenges;

import java.util.Scanner;

public class MAX {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		
		StringBuilder sb = new StringBuilder(s1);
	    int [] arr = new int [255];
		max(sb,arr);
	    
	}

	public static void max(StringBuilder sb, int [] arr)
	{char ch;
		for(int a =0;a<sb.length();a++)
		{
			ch = sb.charAt(a);
			
			arr[ch]=arr[ch]+1;
			
		}
		
		
		arrmax(arr);
	}
	
	public static void arrmax(int [] arr)
	{
		int max=0;
		int c=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]>max)
			{max=arr[a];
			c=a;}
			
		}
		char ch=(char)c;
		System.out.println(ch);
		
	}
}