package graphs;

public class FloydWarshall {

	public static void main(String[] args) {
	
		int [][] graph = {{0,3,100000,7},{8,0,2,100000},{5,100000,0,1},{2,100000,100000,1}};
		
		
		for(int k=0;k<4;k++)
		{
			for(int i=0;i<4;i++)
			{
				for(int j =0;j<4;j++)
				{
					if(graph[i][k]+graph[k][j]<graph[i][j])
					{
						graph[i][j]= graph[i][k]+graph[k][j];
					}
				}
			}
			
		}
		
		
		// Hence it uses DP
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
			{
			System.out.print(graph[i][j]+" ");
			
			
			}
		System.out.println();}
	}

}
