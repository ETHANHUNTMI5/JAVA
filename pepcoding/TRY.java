package pepcoding;

import java.util.Scanner;

public class TRY {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		display(arr, 0);
		
		System.out.println(count(arr, 4, 0, 0));
	}
	public static void display(int [] arr,int idx)
	{
		if(idx==arr.length)
		{
			return;
		}
		
		
		display(arr, idx+1);
		System.out.println(arr[idx]);	
	
	}
public static int count(int [] arr, int x, int idx , int count)
{
	
	if(idx==arr.length)
	{
		return count;
	}
	
  if(arr[idx]==x)
  {
	  return count(arr, x, idx+1, count+1);
  }
	
  else
  {
	  return count(arr, x, idx+1, count);
  }
	
}

	
}
