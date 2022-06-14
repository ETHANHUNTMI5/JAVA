package codeFORCES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Burglar {

	int box=0;
	int matches =0;
	
	
	public void add(int box , int mat)
	{
		this.box=box;
		mat= matches;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	   long n = scn.nextLong();
		int m = scn.nextInt();
		
		int [] num = new int[m];
		int [] mat = new int[m];
		
		
  ArrayList<Burglar> arr = new ArrayList<Burglar>();
		for(int a=0;a<m;a++)
		{
			num[a]=scn.nextInt();
			mat[a]=scn.nextInt();
			Burglar bg = new Burglar();
			bg.box= num[a];
			bg.matches=mat[a];
			arr.add(bg);
			
		}
        
		
        	Collections.sort(arr,(o1, o2) -> o2.matches-o1.matches);
        
       
        long x=0;
        long ans=0;
        
        //System.out.println(ll.get(0).getKey());
        
        for(int a=0;a<arr.size() && n>=0;a++)
        {
        	int t =arr.get(a).box;
        	        	if(n>=t)
        	{ans = ans + t*arr.get(a).matches;
        	n=n-t;
        	
        	}
        	
        	else
        	{
        		long k = n;
        		
        		ans = ans + k*arr.get(a).matches;
        		n=0;
        	}
        	
        	
        }
        System.out.println(ans);
	}
}