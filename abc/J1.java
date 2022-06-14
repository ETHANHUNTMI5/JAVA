package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		
		long [] arr = {5,1,5};
		long k =22;
		
		
		int x = 539095482;
		long sum=0;
		
		for(long a=0;a<arr.length;a++)
		{sum+=arr[(int) a];}
		
		k=k%sum;
		
		long n = arr.length;
		long a=0;
		
		long count=0;
		while(k>0)
		{
		
			if(k>=arr[(int) a])
			{
				k=k-arr[(int) a];
			}
			
			else
			{   
				count++;
				System.out.println(a);
				
				break;
			}
			
		a=(a+1)%n;	
		//System.out.prlongln(a+" " +k);
		}
		
		if(count==0)
		{
			System.out.println(a);
		}
	}
}