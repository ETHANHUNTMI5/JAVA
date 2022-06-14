package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class L1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int [] arr = {2,2,2,2,4,4,4,4};
        
        int n = arr.length;
        
        if(n%2!=0)
        {return ;}
        
        else
        {
        	int [] ans = new int[n/2];
        	
        	
        	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        	
        	for(int a=0;a<n;a++)
        	{
        		if(map.containsKey(arr[a]))
        		{
        			map.put(arr[a],map.get(arr[a])+1);
        		}
        		else
        		{map.put(arr[a],1);}
        	}
        	System.out.println(map);
        	
        	ArrayList<Integer> ll = new ArrayList<Integer>();
        	for(int a=0;a<n;a++)
        	{ll.add(arr[a]);}
        	Collections.sort(ll);
        	
        	
        	int count=0;
        	for(int a=ll.size()-1;a>=0;a--)
        	{
        	int gg = ll.get(a);
        	if(gg%2==0 && gg!=0)
        	{
        		if(count<n/2 && map.containsKey(gg/2) && map.containsKey(gg)&&map.get(gg/2)>=1 && map.get(gg)>=1)
        		{
        			
        			
        			count++;
        			ans[count]=gg/2;
        			map.put(gg/2,map.get(gg/2)-1);
        			map.put(gg,map.get(gg)-1);	
        			System.out.println(map);
        		}
        		
        	}
        }
        	System.out.println(count);
        	for(int i : ans)
            {System.out.print(i+" ");}
            
        	
        }
        
        int [][] cc= new int[4][10];
        System.out.println(cc.length);
        System.out.println(cc[0].length);
        
	}

}
