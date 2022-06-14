package sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

	public static void main(String[] args) {
		int [][]arr = {{1, 2, 1, 4, 8},
	             {1, 7, 8, 5, 1},
	             {8, 7, 1, 3, 1},
	             {8, 1, 2, 1, 9},
	            };
		int n = arr.length;
		int m = arr[0].length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a=0;a<m;a++)
		{
			map.put(arr[0][a],1);
		}
		
		for(int a=1;a<n;a++)
		{
			for(int b=0;b<m;b++)
			{
				if(map.containsKey(arr[a][b]) && map.get(arr[a][b])<a+1)
				{
					map.put(arr[a][b],map.get(arr[a][b])+1);
				}
				
			}
		}
		System.out.println(map);
		ArrayList<Map.Entry<Integer,Integer>> ll =new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
	
		for(Map.Entry<Integer, Integer> key : ll)
		{
			if(key.getValue()==n)
			{System.out.print(key.getKey()+" ");}
		}
	
	}

}
