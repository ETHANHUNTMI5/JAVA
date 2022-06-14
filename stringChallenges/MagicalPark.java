package stringChallenges;

import java.util.Scanner;

public class MagicalPark {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		

		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int k = scn.nextInt();
		int s = scn.nextInt();
		
		char [][] arr = new char[rows][cols];
		
		take(arr,rows,cols);
		
			for(int a =0;a<rows;a++)
			{
				for(int b =0;b<cols && s>0;b++)
				{
					
					if(b==cols-1)					{
					if(arr[a][b]=='*')
					{s=s+5;}
					if(arr[a][b]=='.')
					{s=s-2;}
					if(arr[a][b]=='#')
					{break;}
					}
				
					else
					{if(arr[a][b]=='*')
					{s=s+4;}
					if(arr[a][b]=='.')
					{s=s-3;}
					if(arr[a][b]=='#')
					{break;}
					
					}
						
				}
					
				
			}
			
			if(s>=k)
			{	System.out.println("Yes");
				System.out.println(s);
			
			}
			else if(s<k || s<0)
			{System.out.println("No");}
			}
	
	       

	
	
	public static void take(char [][] arr,int rows,int cols)
	{
		for(int a =0;a<rows;a++)
		{
			for(int b =0;b<cols;b++)
			{
				arr[a][b]=scn.next().charAt(0);
				
			}
				
			
		}

	
}

}
