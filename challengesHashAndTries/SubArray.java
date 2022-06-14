package challengesHashAndTries;

import java.util.HashMap;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
   
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=scn.nextInt();
		}
		
		int i=0,j=0;
		
		int ans=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(i =0;i<n;i++)
		{
			while(j<n && !map.containsKey(arr[j]))
			{
				map.put(arr[j],1);
				j++;
			}
			
			ans += (j-1-i+1)*(j-1-i+2)/2;
			map.remove(arr[i]);
		}
		System.out.println(ans);	
		

	}

}
