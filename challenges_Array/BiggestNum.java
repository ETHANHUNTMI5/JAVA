package challenges_Array;


import java.util.Scanner;


public class BiggestNum {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
	
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			long [] arr= new long [n];
			
			for(int b=0;b<n;b++)
			{
				arr[b]=scn.nextLong();
			}
			
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				String s1 = arr[i]+""+arr[j];
				String s2 = arr[j]+""+arr[i];
				
				if(s2.compareTo(s1)>0)
				{
					Swap(arr, i, j);
				}
				
			}
			
		}
		
		for(long b:arr)
		{System.out.print(b);}
		
		System.out.println();}
	
	
	
	}
	public static void Swap(long [] arr, int i , int j)
	{long temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
	}