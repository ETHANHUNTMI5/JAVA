package abc;

public class MagicSquare {

	public static void main(String[] args) {

		int [][]  arr= {
				{7,1,4,5,6},
				{2,5,1,6,4},
				{1,5,4,3,2},
				{1,2,7,3,4}
		};
		
		int n = arr.length;
		int m = arr[0].length;
		
		int [][] len = new int[n][m];
		int [][] wid = new int[n][m];
		int [][] dia = new int[n][m];
		int [][] adia = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(j-1>=0)
				{
					len[i][j]= len[i][j-1]+arr[i][j];
				}
					
				else
				{
					len[i][j]= arr[i][j];
				}
				
			}
			
		}
	
		
		for(int j=0;j<m;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(i-1>=0)
				{
					wid[i][j]= wid[i-1][j]+arr[i][j];
				}
					
				else
				{
					wid[i][j]= arr[i][j];
				}
				
			}
			
		}
		
		
		
		
		for(int i =0;i<n;i++)
		{
			for(int j =m-1;j>=0;j--)
			{
				
				if(i-1>=0 && j-1>=0)
				{
					dia[i][j]= arr[i][j]+dia[i-1][j-1];
				}
				
				else
				{
					dia[i][j] =arr[i][j];
				}
				
			}
			
		}
		
		
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<m;j++)
			{
				
				if(i-1>=0 && j+1<m)
				{
					adia[i][j]= arr[i][j]+adia[i-1][j+1];
				}
				
				else
				{
					adia[i][j] =arr[i][j];
				}
				
			}
			
		}
		
		
		int get = Math.min(m, n);
		
		int dim=get;
		
		
		while(dim>1)
		{
			for(int row=0;row<=n-dim;row++)
			{
				
				for(int col=0;col<=m-dim;col++)
				{
					
					for(int a=1;a<=dim;a++)
					{
						
					}
					
					
				}
				
			}
			
		}
				
		
		
		
		
		
		
//			for(int i=0;i<n;i++)
//			{
//				for(int j =0;j<m;j++)
//				{
//					System.out.print(adia[i][j]+" ");
//				}
//			System.out.println();	
//			}
//			
		
		
	}
	
public static int lent(int[][] arr , int cr,int cc,int ec ,int er)
{
  if(cc==0)
  {return arr[cr][ec];}
  
  else
  {
	  return arr[cr][ec]-arr[cr][ec-1];
  }

}

	
	
}