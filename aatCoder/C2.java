package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		int [] arr = new int[11];
		
		arr[1]=1;
		ArrayList<Integer>ll = new ArrayList<Integer>();
		ll.add(0);
		ll.add(1);
		
		for(int a=2;a<=10;a++)
		{
			arr[a]= arr[a-1]*(a);
			ll.add(arr[a]);
		}

		//System.out.println(ll);
		
		int [] cc = new int[11];
		Arrays.fill(cc, 100);
		int c=0;
		z:while(x>0)
		{
			int i = Collections.binarySearch(ll, x);
			
			if(i>=0)
			{
				if(cc[i]>0)
				{
					x=0;
					c=c+1;
					break z;
				}
			}
			
			
			else {
			i = (i*-1)-1;
			//System.out.println(i+"-");
			if(cc[i-1]>0)
			{
				int y = x/arr[i-1];
				x=x-arr[i-1]*y;				
				
				c=c+y;
				
			}
			
			
			
		}
			
		}
		System.out.println(c);
		
}}