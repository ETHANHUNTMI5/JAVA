package code;

import java.util.Scanner;


public class TTT {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		scn.nextLine();
		for(int w=1;w<=t;w++)
		{
			
			char [][] arr = new char[3][3];
			String s1 = scn.nextLine();
			String s2 = scn.nextLine();
			String s3 = scn.nextLine();
			int a=1;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a==1)
					{arr[i][j]=s1.charAt(j);}
					
					else if(a==2)
					{arr[i][j]=s2.charAt(j);}
				
					else
					{arr[i][j]=s3.charAt(j);}
				}
			a++;}
			int spaces=0;
			int X=0;
			int O=0;
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(arr[i][j]=='_')
					{spaces++;}
					else if(arr[i][j]=='X')
					{X++;}
					else
					{O++;}
						
					
				}
			}
			
			if(O>X||X-O>1 ||X>5 || O>4)
			{
			System.out.println("3");

			continue;
			}
				
			
			
			
			int row=0;
			int col=0;
			int XWIN=0;
			int ZWIN=0;
			int blank=0;
			
			while(row<3)
			{
				col=0;
				while(col<2)
				{
					char cc = arr[row][col];
					if(arr[row][col]!=arr[row][col+1])
					{	break;
					}
					
					col++;
				}
				
				if(col==2)
				{
				  if(arr[row][col]=='X')
				  {XWIN++;}
					
				  else if(arr[row][col]=='O')
				  {ZWIN++;}
				  
				  else
				  {blank++;}
				}				
			
				row++;
				
			}
			
			
			row=0;
			col=0;
			//System.out.println(XWIN+" "+ZWIN+" "+blank);
			while(col<3)
			{
				row=0;
				while(row<2)
				{
					if(arr[row][col]!=arr[row+1][col])
					{	break;
					}
					
					row++;
				}
				
				if(row==2)
				{
				  if(arr[row][col]=='X')
				  {XWIN++;}
					
				  else if(arr[row][col]=='O')
				  {//System.out.println(row+" -->"+col);
					  ZWIN++;}
				  
				  else
				  {blank++;}
				}				
			
				col++;
				
			}
			
			row=0;
			col=0;
			
			while(row<2)
			{
				if(arr[row][col]!=arr[row+1][col+1])
				{
					break;
				}
				row++;
				col++;
			}
			
			if(row==2)
			{
				if(arr[row][col]=='X')
				  {XWIN++;}
					
				  else if(arr[row][col]=='O')
				  {//System.out.println(row+" -->"+col);
					  ZWIN++;}
				  
				  else
				  {blank++;}
				
			}
			
			row=2;
			col=0;
			
			while(row>0)
			{
				if(arr[row][col]!=arr[row-1][col+1])
				{
					break;
				}
				row--;
				col++;
			}
			
			if(row==0)
			{
				if(arr[row][col]=='X')
				  {XWIN++;}
					
				  else if(arr[row][col]=='O')
				  {//System.out.println(row+" -->"+col);
					  ZWIN++;}
				  
				  else
				  {blank++;}
				
			}
			
			
			
			
			if((XWIN>0 && ZWIN>0))
			{
				System.out.println("3");
				continue;
			}
		
			if(XWIN>0)
			{
				if(X<=O)
				{System.out.println("3");
				continue;}
				
			}
			
			if(ZWIN>0)
			{
				if(O!=X)
				{System.out.println("3");
				continue;}
			}
			
			
			if(spaces>=1 && XWIN==0 && ZWIN==0)
			{
				if(X-O<=1)
				{System.out.println("2");
			continue;}
			
		}
		
			
			if(XWIN>=0 || ZWIN>=0)
			{if(X-O<=1)
				{System.out.println("1");
				continue;}
			}
			
		 
	}
	}
}
//1
//OOX
//XXO
//OXX
