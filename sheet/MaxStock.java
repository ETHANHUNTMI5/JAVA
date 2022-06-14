package sheet;

import java.util.Arrays;

public class MaxStock {

	public static void main(String[] args) {
		int [] arr = {10,7,19};
		int k = 45;
		int n = arr.length;
		int [][] arr2 = new int[n][2];
		
		for(int a=0;a<n;a++)
		{
			arr2[a][0]=a+1;
			arr2[a][1]=arr[a];
		}
		
		
		Arrays.sort(arr2,(a,b)->a[1]-b[1]);
		int ans=0;
		int cost=0;
		for(int a=0;a<n;a++)
		{
			if(cost>k)break;
			if(cost+arr2[a][0]*arr2[a][1]<=k)
			{ans+=arr2[a][0];
			cost+=arr2[a][0]*arr2[a][1];}
			
			else
			{int allowed = (k-cost)/arr2[a][1];
			ans+=allowed;
			cost+=arr2[a][1]*allowed;
			}
		}
		System.out.println(ans);
		System.out.println(cost);
	}

}
