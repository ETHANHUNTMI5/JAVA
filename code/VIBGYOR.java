package code;

import java.util.HashMap;
import java.util.Scanner;

public class VIBGYOR {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int w=1;w<=t;w++)
        {
        	int n = scn.nextInt();
        	int [] arr = new int[n];
        	
        	for(int a=0;a<n;a++)
        	{
        		arr[a]= scn.nextInt();
        	}
        	
        	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        	for(int a=1;a<=7;a++)
        	{
        		map.put(a,1);
        	}
        	
        	int ans=0;
        	while(!map.isEmpty())
        	{
        		int k = arr[ans];
        		
        		if(map.containsKey(k))
        		{
        			map.remove(k);
        		}
        		
        	ans++;}
        	
        System.out.println(ans);}
	}

}
