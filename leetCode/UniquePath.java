package leetCode;

public class UniquePath {

	public static void main(String[] args) {
		
		int m =10;
		int n =10;
		
		
		int [][]dp = new int[m+1][n+1];
		
		
		for(int a=0;a<=m-1;a++)
		{dp[a][n-1]=1;}

		for(int a=0;a<=n-1;a++)
		{dp[m-1][a]=1;}

		
		for(int col =n-2;col>=0;col--)
		{
			for(int row=m-2;row>=0;row--)
			{
				dp[row][col]=dp[row+1][col]+dp[row][col+1];
				
			}
		}
	
		
//		for(int i=0;i<=m;i++)
//		{
//			for(int j=0;j<=n;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//		
//		System.out.println();}
//		
//		
		System.out.println(dp[0][0]);
	}
	

}
