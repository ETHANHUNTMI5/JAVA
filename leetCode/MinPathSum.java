package leetCode;

public class MinPathSum {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3},{4,5,6}};
		
		int [][] dp = new int[arr.length+1][arr[0].length+1];
		
		for(int a=0;a<=arr.length;a++)
		{
			dp[a][arr[0].length]=1000;
		}
		
		for(int a=0;a<=arr[0].length;a++)
		{
			dp[arr.length][a]=1000;
		}
	
		
		dp[arr.length-1][arr[0].length-1]=arr[arr.length-1][arr[0].length-1];
		
		for(int col = arr[0].length-1;col>=0;col--)
		{
			for(int row= arr.length-1;row>=0;row--)
			{
				if(row==arr.length-1 && col==arr[0].length-1)
				{continue;}
				
				dp[row][col] = arr[row][col]+Math.min(dp[row][col+1], dp[row+1][col]);
			}
		}
		
		
//		for(int i=0;i<=arr.length;i++)
//		{
//			for(int j=0;j<=arr[0].length;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//		System.out.println();}
		
		System.out.println(dp[0][0]);
	}

}
