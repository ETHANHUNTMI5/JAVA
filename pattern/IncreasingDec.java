package pattern;

import java.util.Scanner;

public class IncreasingDec {
 
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		long [] arr = new long [n];
		take(arr);
		
		boolean bc =true;
		int c=arr.length-1;
		
		
		for(int a=0;a<arr.length-1;a++)
		{
			if(arr[a+1]>=arr[a])
			{
				c=a+1;
				break;
			}
			
		}
		
		for(int b=c;b<arr.length-1;b++)
		{
			if(arr[b+1]<=arr[b])
			{
				bc=false;
				break;
			}
			
			
		}
		
		
		System.out.println(bc);
		
			
	}
	public static void take(long [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=scn.nextLong();
		
		}
		
	}

}
