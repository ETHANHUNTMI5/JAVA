package challenges_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SortGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		scn.nextLine();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int a=0;a<m;a++)
		{
	     String s= scn.next();//yeh dekh
	     int t = scn.nextInt();
	     scn.nextLine();
	     map.put(s,t);
			
		}
		int t=0;
		int [] arr = new int[n];
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries)
		{
			if(entry.getValue()>n)
			{
				arr[t]=entry.getValue();
			  t++;
				map2.put(entry.getKey(),entry.getValue());	}
			
		}
		
		Set<Map.Entry<String, Integer>> entries2 = map2.entrySet();
		for(Map.Entry<String, Integer> entry : entries2)
		{
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		for(int i =0;i<t;i++)
		{
			for(int j =i;j<t-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
					
				}
			}
			
		}
		
		
	}

}
