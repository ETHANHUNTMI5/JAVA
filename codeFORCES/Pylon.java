package codeFORCES;

import java.util.Scanner;

public class Pylon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int curr=0;
		int get=0;
		int ans=0;
		for(int a=0;a<n;a++)
		{
			get += curr-arr[a];
          
			curr= arr[a];
			//System.out.println(get+"<-");

			if(get<0)
			{
				ans= ans+get*-1;
				get = 0;
			}
	
		}
		
		System.out.println(ans);
	}

}
