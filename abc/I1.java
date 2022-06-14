package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class I1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			
			ArrayList<Integer> ll = new ArrayList<Integer>();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int a=0;a<4;a++)
			{
			int p = scn.nextInt();	
			
				map.put(p,a);
				
				ll.add(p);
			}
			
		Collections.sort(ll);
		
		int fi = ll.get(ll.size()-1);
		int si = ll.get(ll.size()-2);
		
         
		int fi1= map.get(fi);
		int si1= map.get(si);
		
		
		if(si1>=2 && fi1<=1)
		{System.out.println("YES");}
		
		else if(fi1>=2 && si1<=1)
		{System.out.println("YES");}
		
		else
		{System.out.println("NO");}
		
		
			
			
		}

	}

}
