package challenges_Array;

import java.util.Scanner;

public class WavePColumn {

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
   {for(int a=0;a<cols;a++)
   {
	   
	   if(a%2==0)
	   {for(int b=0;b<rows;b++)
		   {System.out.print(arr[b][a]+", ");}}
	   
	   else
	   {
		   for(int b=rows-1;b>=0;b--)
		   {System.out.print(arr[b][a]+ ", ");}
		   
	   }
   }


}
   

}
