package challenges_Array;

import java.util.Scanner;

public class WavePrint {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		
		int [][] arr = new int [rows][cols];
	
		take(arr,rows,cols);
		Wave(arr,rows,cols);

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

   public static void Wave(int [][] arr,int rows,int cols)
   {for(int a=0;a<rows;a++)
   {
	   
	   if(a%2==0)
	   {for(int b=0;b<cols;b++)
		   {System.out.print(arr[a][b]+", ");}}
	   
	   else
	   {
		   for(int b=cols-1;b>=0;b--)
		   {System.out.print(arr[a][b]+ ", ");}
		   
	   }
   }


}
   }