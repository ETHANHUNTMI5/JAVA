package leetCode;

public class Spiral2 {

	public static void main(String[] args) {
		
		int n =20;
		
		int count=1;
		int d=1;
		
		
		int top=0;
		int down = n-1;
		int left=0;
		int right=n-1;
		
		int [][] arr = new int[n][n];
		
		while(count<=n*n && left<=right && top<=down)
		{
			
			if(d==1)
			{
				for(int a=left;a<=right;a++)
				{
					arr[top][a]=count;
					count++;
				}
					
				d=2;
				top++;
				
			}
			
			else if(d==2)
			{
				for(int a=top;a<=down;a++)
				{
					arr[a][right]=count;
					count++;
				}
					
				d=3;
				right--;
				
				
			}
			
			else if(d==3)
			{
				for(int a=right;a>=left;a--)
				{
					arr[down][a]=count;
					count++;
				}
					
				d=4;
				down--;
				
				
			}
			
			else
			{
				for(int a=down;a>=top;a--)
				{
					arr[a][left]=count;
					count++;
				}
					
				d=1;
				left++;
				
				
				
			}
			
			
			
			
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{System.out.print(arr[i][j]+" ");}
		
		System.out.println();}
	
		
		
	}

}
