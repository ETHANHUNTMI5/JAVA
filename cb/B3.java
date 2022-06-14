package cb;

import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
	
		char[][] arr = {{'#','#','#','.','#','.'}};
		
		
			
		char[][] ans = new char[arr[0].length][arr.length];
		
		for(int b=0;b<arr.length;b++)
		{
			for(int a=0;a<arr[0].length;a++)
			{
				ans[a][b]=arr[arr.length-1-b][a];
			}
		}
		
		int row =arr[0].length;
		int col = arr.length;
		
		System.out.println(row+" "+col);
		
		for(int a=0;a<arr[0].length;a++)
		{
			for(int b=0;b<arr.length;b++)
			{
				System.out.print(ans[a][b]+" ");
			}
		System.out.println();}
System.out.println("----------");
			
          for(int a=0;a<col;a++)
		    {
			for(int b=0;b<=row-2;b++)
			{
				if(ans[b][a]=='#' && ans[b+1][a]=='.')
				{
					
						
						ans[b][a]='.';
						ans[b+1][a]='#';
						
						b=0;
						continue;
					
				}
			}
			
		}
          
		
		for(int a=0;a<arr[0].length;a++)
		{
			for(int b=0;b<arr.length;b++)
			{
				System.out.print(ans[a][b]+" ");
			}
		System.out.println();}

		
	}

}
