package sheet;

import java.util.HashMap;

public class TwoDifference {

	public static void main(String[] args) {
	
		int [] arr = {5, 20, 3, 2, 50, 80};
	 
		int tar = 0;
		
		int n = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a=0;a<n;a++)
		{
			map.put(arr[a],1);
		}
		
		boolean b = false;
		for(int a=0;a<n;a++)
		{
			System.out.println(map.get(20));
			if(map.containsKey(arr[a]+tar))
			{b=true;
			System.out.println(arr[a]+" "+(arr[a]+tar));
			break;}
			
			
		}
		
		if(b)
		{System.out.println("Yes");}
		else
		{System.out.println("No");}
	
	}

}
