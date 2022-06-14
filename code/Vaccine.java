package code;

import java.util.Scanner;

public class Vaccine {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int g = scn.nextInt();
			int p = scn.nextInt();
			
			int day=0;
			int [] arr = new int[10];
			for(int a=0;a<10;a++)
			{arr[a]= scn.nextInt();
			if(a>=g)
			{day=day+arr[a];}
			}
			
			int ndays=day/p;
			int rem= day%p;
			
			int max=ndays;
			int min = ndays;
			
			min = min +1;
			int gt = arr[g-1]-1;

			max = max+ ((gt+rem)/p)+1;
			
			System.out.println(min + " "+max);
		}

	}

}
