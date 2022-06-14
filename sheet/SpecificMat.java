package sheet;

import java.util.Arrays;

public class SpecificMat {

	public static void main(String[] args) {
		
		int [][] data = {{1,2,-1,-4,-20},
	             		{-8,-3,4,2,1}, 
	             		{3,8,6,1,3},
	             		{-4,-1,1,7,-6},
	             		{0,-4,10,-5,1}};
		
		int n = data.length;
		
		int [][] arr = new int[n][n];
		
		arr[n-1][n-1] = data[n-1][n-1];
		int max = data[n-1][n-1];
		
		for(int a=n-2;a>=0;a--)
		{
			if(data[n-1][a]>max)
			{
				max= data[n-1][a];
			}
		
			arr[n-1][a] = max; 
		}
		
     max = data[n-1][n-1];
		
		for(int a=n-2;a>=0;a--)
		{
			if(data[a][n-1]>max)
			{
				max= data[a][n-1];
			}
		
			arr[a][n-1] = max; 
		}
		
		
			for(int a =0;a<n;a++)
		{
			for(int b=0;b<n;b++)
			{
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
		
		int ans = Integer.MIN_VALUE;
		
	
		for(int a=n-2;a>=0;a--)
		{
			for(int b= n-2;b>=0;b--)
			{
				if(arr[a+1][b+1]-data[a][b]>ans)
				{
					ans=arr[a+1][b+1]-data[a][b];
				}
			
				arr[a][b] = Math.max(arr[a][b+1], Math.max(arr[a+1][b], data[a][b]));
			}
			
		}
		System.out.println(ans);
	// first compare and then keep on filling the array
	}

}
