package recursionChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartKeyAdv {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		String[] arr = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	
		
		String[] names = { "prateek", "sneha", "deepak", "arnav", "shikha", "palak","utkarsh", "divyam", "vidhi", "sparsh", "akku"};

		int l =Length(n);
		ArrayList<String> ans = new ArrayList<>();
		ans=Smart(arr, n);
		System.out.println(ans);
         Final(ans, names,l);		
	}
	public static ArrayList<String> Smart(String [] arr,int n)
	{
		if(n==0)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		int b =0;
		b=n%10;
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = new ArrayList<>();
		
		rr=Smart(arr,n/10);
		String s = arr[b];
		
		
		for(int a=0;a<rr.size();a++)
		{
			String s2 = rr.get(a);
		for(int c=0;c<s.length();c++)
		{
			mr.add(s2+s.charAt(c));
			
		}
			
		}
		
		
		
		return mr;
	}


	public static void Final(ArrayList <String> yo ,String [] names,int l)
	{
		for(int a =0;a<yo.size();a++)
		{
			String s = yo.get(a);
			
			for(int b=0;b<names.length;b++)
			{
				String s2 = names[b];
				
				for(int c=0;c<=s2.length()-l;c++)
				{
					String s3 = s2.substring(c,c+l);
					
					if(s.equals(s3))
					{System.out.println(s2);}
				}
				
				
			}
			
			
		}
		
		
					
		}
	
	public static int Length(int n)
	{
		int l=0;
		
		while(n!=0)
		{
			
			l++;
			
			n=n/10;
			
			
		}
		
		return l;
		
	}
		
	}

	


