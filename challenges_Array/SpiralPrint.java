package challenges_Array;

import java.util.Scanner;

public class SpiralPrint {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
						
				int rows = scn.nextInt();
				int cols = scn.nextInt();
				
				int [][] arr = new int [rows][cols];
				
				take(arr,rows,cols);
				
				int top=0,left=0,bottom=rows-1,right=cols-1,counter=rows*cols,d=1;
				
				 while(counter>0 && top<=bottom&& left<=right)
					   
					   
				   {
					   
					   if(d==1)
					   {for(int a=left;a<=right;a++)
						   {System.out.print(arr[top][a] + ", ");
						   counter--;}
					   
					        d=2;
					        top++;}
					   
					   if(d==2)
					   {for(int a=top;a<=bottom;a++)
					   {System.out.print(arr[a][right] + ", ");
					   counter--;}
				   
				        d=3;
				        right--;}
				   
					   if(d==3)
					   {for(int a=right;a>=left;a--)
					   {System.out.print(arr[bottom][a] + ", ");
					   counter--;}
				   
				        d=4;
				        bottom--;}
				   	   
					   if(d==4)
					   {for(int a=bottom;a>=top;a--)
					   {System.out.print(arr[a][left] + ", ");
					   counter--;}
				   
				        d=1;
				        left++;}
				      
					   
						   
					   }
						
				
				
				
				System.out.print("END");
				
				
			}
			
			public static void take(int [][] arr,int rows,int cols)
			{
				for(int a =0;a<rows;a++)
				{
					for(int b =0;b<cols;b++)
					{
						arr[a][b]=scn.nextInt();
						
					}
						
					
				}
				
				
			}
			
			
			
			
		

	

}
