package sheet;

import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		boolean [] arr = new boolean[n+1];
		
		arr[0]=arr[1]=true;
		
		for(int table=2;table*table<=n;table++)
		{
			if(arr[table])
			{continue;}
			
			for(int mul=2;mul*table<=n;mul++)
			{
				if(!arr[table*mul])
				{arr[table*mul]=true;}
				
			}
				
		}
		
		
		for(int a=2;a<n;a++)
		{
			if(!arr[a])
			{System.out.print(a+" ");}
		}
		
		
	}

}
