package codeFORCES;

import java.util.Scanner;

public class Police {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		}
		
		int sum=0;
		int ans=0;
		for(int a=0;a<n;a++)
		{
			
			
			if(sum<=0 && arr[a]==-1)
			{ans++;
			
			}
			sum+=arr[a];
			if(sum<0)
			{sum=0;}
			
			
		}
		System.out.println(ans);
	}

}
