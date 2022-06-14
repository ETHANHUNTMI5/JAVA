package challengesHashAndTries;

import java.util.HashMap;
import java.util.Scanner;

public class Unlock {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a]=scn.nextInt();
			map.put(arr[a],a);
			
		}
	int t =1;
		for(int b=n;b>=1&& t<=k;b--)
		{
			int gi= getI(map, b);
			int best = n-b;
			
			if(gi!=best)
			{
				t++;
				map.put(b,best);
				map.put(arr[best],gi);
				Swap(arr, gi, best);

			}
			
		}
		
		for(int i : arr)
		{System.out.print(i+" ");}
				
	}
	public static int getI(HashMap<Integer, Integer> map,int data)
	{
		
		
		
		
		return map.get(data);
		
	}
	public static void Swap(int [] arr, int i , int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}