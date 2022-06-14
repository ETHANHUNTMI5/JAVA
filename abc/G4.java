package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class G4 {

	public static void main(String[] args) {
		int [] arr1= {1,0,3};
		int [] arr2= {5,3,4};
		
		int n = arr1.length;
		
		int [][] arr = new int[n][n];

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]= arr1[i]^arr2[j];
			}
		}
		
		int mask = (1<<n) -1;
		int [][] dp = new int[n][(1<<n)];
	  
		for(int a=0;a<dp.length;a++)
		{Arrays.fill(dp[a], -1);}
	  
	  System.out.println(mask2(arr, 0, mask, dp));
		
	}
		public static int mask2(int [][] arr,int i, int mask,int[][]dp)
		{
			if(i==dp.length)
			{return 0;}
			
			if(dp[i][mask]!=-1)
			{
			return dp[i][mask];	
			}
			int max = Integer.MAX_VALUE;
			
			for(int j=0;j<=dp.length-1;j++)
			{
				
				
				if((mask&(1<<j))!=0)
				{
					max =Math.min(max, arr[i][j]+mask2(arr, i+1, (mask^(1<<j)), dp));
				}
				
			}

			
		dp[i][mask]=max;
		return max;	
		}
		
	}
