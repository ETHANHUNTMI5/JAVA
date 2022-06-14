package codeFORCES;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;



public class Practical {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		
		int [] arr = new int[n];
		ArrayList<Integer> ll = new ArrayList<Integer>();
		int si=0;
        for(int a=0;a<s.length();a++)
        {
        	if(s.charAt(a)==' ')
        	{
        	ll.add(Integer.parseInt(s.substring(si,a)));
        	si=a+1;}
        	
        }
        
        ll.add(Integer.parseInt(s.substring(si,s.length())));
		
		Collections.sort(ll);
	
			
		
		
		
		int ans=(kar(ll, 0, ll.size()-1));
		String fans= ans+"";
		System.out.println(fans);
		
	}
	
	public static int kar(ArrayList<Integer> ll ,int l,int r)
	{
		if(ll.get(l)*2>=ll.get(r) || l>=r)
		{return 0;}
		
		int a = kar(ll, l+1, r);
		int b = kar(ll, l, r-1);
		
		int ans = Math.min(a, b)+1;
		
		return ans;
		
	}
}
