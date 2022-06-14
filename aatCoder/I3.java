package aatCoder;

import java.util.ArrayList;
import java.util.Scanner;

public class I3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	ArrayList<int[]> ll = new ArrayList<int[]>();
		for(int w=1;w<=n;w++)
		{
			int t = scn.nextInt();
			int k = scn.nextInt();
			int [] arr = new int[k+3];
			arr[0] = t;
			arr[1] = k;
			for(int a=0;a<k;a++)
			{
				arr[a+2] = scn.nextInt();
			}
			
			arr[k+2] = 0;
			int lp= 0;
			
			for(int a=1;a<=arr[1];a++)
			{
				
			}
			
		ll.add(arr);	
		}
		
		System.out.println(ll);
		
		
	}

}
