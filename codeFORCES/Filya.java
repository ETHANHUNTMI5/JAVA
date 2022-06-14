package codeFORCES;

import java.util.Scanner;

public class Filya {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long n = scn.nextInt();
		
		
		
		long [] arr = new long[(int)n];
		
		long min = 10000000000L;
		long max=0;
		
		for(long a=0;a<n;a++)
		{
			arr[(int)a]= scn.nextInt();
			if(arr[(int)a]<min)
			{min= arr[(int)a];}
			
			if(arr[(int)a]>max)
			{max=arr[(int)a];}
		}
		
		if(n==2)
		{System.out.println("YES");}
		
		else {
		
		long avg = (min+max)/2;
		
		long var = max-avg;
		
		long count=0;
        long uni=0;
		for(long a=0;a<n;a++)
		{
			if(arr[(int)a]==min || arr[(int)a]==max )
			{uni++;}
			
		}
		
		
		if(uni==n)
		{System.out.println("YES");
	    count++;
	 
		}
		
		
		
		for(long a=0;a<n;a++)
		{
			if(arr[(int)a]<avg)
			{arr[(int)a]=arr[(int)a]+var;}
			
			else if(arr[(int)a]>avg)
			{arr[(int)a]=arr[(int)a]-var;}
		}
		
		long get = arr[0];
		
		for(long a=0;a<n && count==0;a++)
		{
			if(arr[(int)a]!=get)
			{System.out.println("NO");
			count++;
			break;}
			
		}
		
		if(count==0)
		{System.out.println("YES");}
		
		
		
		}
	}

}
