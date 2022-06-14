package sheet;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
	int l =-1;
	int r=n;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
			
		}
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]!=a+1)
			{l=a;
			break;}
		}
		for(int a=n-1;a>=0;a--)
		{
			if(arr[a]!=a+1)
			{r=a;
			break;}
		}
		int i =l;
		int m =r;
		
		if(i==-1 && r==n)
		{System.out.println("yes");
		System.out.println((i+2)+" "+(i+2));
		return;}
		
		while(l<r)
		{
			int temp =arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
			
		}
		boolean b = true;
		for(int a=0;a<n;a++)
		{
			if(arr[a]!=a+1)
			{b=false;
			break;}
		}
		
		if(b)
		{System.out.println("yes");
		System.out.println((i+1)+" "+(m+1));}
		else
		{System.out.println("no");}
	}

}
