package codeFORCES;

import java.util.Scanner;

public class Garden {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		
		int max=0;
		
		if(n<=2)
		{System.out.println(n);}
		else
		{
		int [] left = new int[n];
		int [] right= new int[n];
		
		left[0]=1;
		for(int a=1;a<arr.length;a++)
		{
			if(arr[a]>=arr[a-1])
			{left[a]=left[a-1]+1;}
			
			else
			{left[a]=1;}
		}
	 
		right[n-1]=1;
		for(int a=n-2;a>=0;a--)
		{
			if(arr[a]>=arr[a+1])
			{right[a]=right[a+1]+1;}
			
			else
			{right[a]=1;}
		}
		
	
		max= left[0]+right[0];
		for(int a=1;a<n;a++)
		{
			if(left[a]+right[a]>max)
			{max =left[a]+right[a]; }
			
		}
		
		System.out.println(max-1);
	}}

}
