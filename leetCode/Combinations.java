package leetCode;

import java.util.ArrayList;

public class Combinations {
	public static ArrayList<String> ll;
	public static ArrayList<ArrayList<Integer>> ans; 
	public static void main(String[] args) {
		
	ll=	new ArrayList<String>();
		int n =5;
		int k=2;
	
			ArrayList<Integer> ll2; 
			
		kar(n, k, 0, "", 1);
		
		ans = new ArrayList<ArrayList<Integer>>();
		
		for(int a=0;a<ll.size();a++)
		{
			String s = ll.get(a);
			ll2=new ArrayList<Integer>();
			
			String temp="";
			
			for(int b=0;b<s.length();b++)
			{
			char ch = s.charAt(b);
			
			if(ch==' ')
			{
				ll2.add(Integer.parseInt(temp));
				
				temp="";
			}
			
			else
			{
				temp+=ch;
			}
				
			}
			ll2.add(Integer.parseInt(temp));
		 ans.add(ll2);
		}
		
		System.out.println(ans);
	}

	public static void kar(int n , int k , int isf,String ans,int i)
	{
		
		if(isf==k)
		{
		ll.add(ans.substring(1));
			return;
		}
		
		if(i>n)
		{
			
			{return;}
			
		}
		
		
		kar(n, k, isf+1, ans+" "+i, i+1);
		kar(n, k, isf, ans, i+1);
		
		
	}
}
