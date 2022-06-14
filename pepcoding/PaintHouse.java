package pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintHouse {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
 
		int [][] arr = new int[3][n];
		
		for(int col=0;col<n;col++)
		{
			for(int row=0;row<3;row++)
			{
				arr[row][col] = scn.nextInt();
			}
		}
		
//		for(int row=0;row<3;row++)
//		{
//			for(int col=0;col<n;col++)
//			{
//				System.out.print(arr[row][col]+" ");
//			}
//			System.out.println();
//		}
//		
		
		int [] red = new int[n];
		int [] green = new int[n];
		int [] blue = new int[n];
		
		red[0]= arr[0][0];
		green[0]= arr[1][0];
		blue[0]= arr[2][0];
		
		
		for(int a=1;a<=n-1;a++)
		{
			red[a]=arr[0][a]+Math.min(green[a-1], blue[a-1]);
			green[a]=arr[1][a]+Math.min(red[a-1], blue[a-1]);
			blue[a]=arr[2][a]+Math.min(green[a-1], red[a-1]);
			
		}
		
//		for(int i : red)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//	
//		for(int i : green)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		for(int i : blue)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//	
		int min = red[n-1];
		
		if(green[n-1]<min)
		{
			min= green[n-1];
		}
		
		if(blue[n-1]<min)
		{
			min= blue[n-1];
		}
		
		System.out.println(min);
	}
}